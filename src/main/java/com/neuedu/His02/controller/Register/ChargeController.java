package com.neuedu.His02.controller.Register;

import com.neuedu.His02.entity.*;
import com.neuedu.His02.service.Register.ChargeService;
import com.neuedu.His02.service.Register.RegisterService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/charge")
public class ChargeController {
    @Autowired
    private ChargeService service;
    @Autowired
    private RegisterService registerService;

    @RequestMapping("/allItem")
    // http://localhost:8899/charge/allItem?ID=35
    public ResultUtil selectAllFmeditem(Register register) {
        List<CheckApply> checkApply = service.selectByIDCheckAppy(register.getID());
        ArrayList<Fmeditem> fmeditems = new ArrayList<Fmeditem>();
        System.out.println(checkApply);
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        for(CheckApply itme1 : checkApply){
            Integer temp= itme1.getItemID();
            if (itme1.getState() <= 2) {
                itemID.add(temp);
            }
        }
        for (Integer itme : itemID){
            fmeditems.add(service.selectByID(itme));
        }
        System.out.println("Non-drug"+fmeditems);
        return new ResultUtil(EnumCode.OK.getValue(), "ok",fmeditems);
    }

    @RequestMapping("/allDrugs")
    // http://localhost:8899/charge/allDrugs?ID=35
    public ResultUtil selectAllDrugs(Register register) {
        List<Prescription> prescriptions = service.selectByIDPrescription(register.getID());
        ArrayList<PrescriptionDetailed> prescriptionDetaileds = new ArrayList<PrescriptionDetailed>();
        ArrayList<Drugs> drugs = new ArrayList<Drugs>();
        for (Prescription item : prescriptions) {
            List<PrescriptionDetailed> temp = service.selectByDetailed(item.getID());
            prescriptionDetaileds.addAll(temp);
        }
        for (PrescriptionDetailed item1 : prescriptionDetaileds) {
            if (item1.getState() == 2) {
                drugs.add(service.selectByDrugID(item1.getDrugsID()));
            }
        }
        System.out.println(drugs);
        return new ResultUtil(EnumCode.OK.getValue(), "ok",drugs);
    }
    @RequestMapping("/allCharge")
    // http://localhost:8899/charge/allCharge?ID=35
    public ResultUtil allCharge(Register register) throws ParseException {
        Invoice invoice = new Invoice();
        System.out.println("registeredID"+register.getID());
        ResultUtil resultUtil1 = selectAllFmeditem(register);
        ResultUtil resultUti2 = selectAllDrugs(register);
        ArrayList<Drugs> drugs = (ArrayList<Drugs>) resultUti2.getData();
        ArrayList<Fmeditem> fmeditems = (ArrayList<Fmeditem>) resultUtil1.getData();
        System.out.println("fmeditems"+fmeditems);
        System.out.println("drugs"+drugs);
        BigDecimal sumMoney = new BigDecimal("0");
        for (Drugs item : drugs) {
            sumMoney = sumMoney.add(item.getDrugsPrice());
            service.updatePrescriptionDetailed(item.getID());
            Invoice invoice8 = registerService.selectMaxInvoice();
            int invoicenum8 = Integer.parseInt(invoice8.getInvoiceNum());
            int invoicenum9 = invoicenum8 + 1;
            PatientCosts patientCosts = new PatientCosts();
            patientCosts.setInvoiceID(invoicenum9);
            patientCosts.setRegistID(register.getID());
            BigDecimal bigDecimal8 = new BigDecimal("1");
            patientCosts.setAmount(bigDecimal8);
            patientCosts.setCreateOperID(10);
            SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            Date nowDate1 = df1.parse(df1.format(new Date()));
            patientCosts.setCreatetime(nowDate1);
            patientCosts.setFeeType(51);
            patientCosts.setPayTime(nowDate1);
            patientCosts.setRegisterID(10);
            patientCosts.setDeptID(1);
            patientCosts.setPrice(item.getDrugsPrice());
            patientCosts.setItemType(2);
            patientCosts.setItemID(item.getID());
            patientCosts.setName(item.getDrugsName());
            System.out.println("schedule："+patientCosts);
            registerService.addPatientCosts(patientCosts);
        }
        for (Fmeditem item1 : fmeditems) {
            sumMoney = sumMoney.add(item1.getPrice());
            service.updateCheckApply(item1.getID());
        }
        System.out.println("Total consumption："+sumMoney);
        Invoice invoice1 = registerService.selectMaxInvoice();
        int invoicenum1 = Integer.parseInt(invoice1.getInvoiceNum());
        int invoicenum2 = invoicenum1 + 1;
        invoice.setInvoiceNum(Integer.toString(invoicenum2));
        invoice.setMoney(sumMoney);
        invoice.setState(1);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date nowDate = df.parse(df.format(new Date()));
        invoice.setCreationTime(nowDate);
        invoice.setFeeType(51);
        invoice.setDailyState(0);
        invoice.setUserID(9);
        registerService.addInvoice(invoice);
        return new ResultUtil(EnumCode.OK.getValue(), "Charges for Success",invoice);
    }
}
