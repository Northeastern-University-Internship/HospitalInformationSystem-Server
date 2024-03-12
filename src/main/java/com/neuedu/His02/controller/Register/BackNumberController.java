package com.neuedu.His02.controller.Register;

import com.neuedu.His02.entity.Invoice;
import com.neuedu.His02.service.Register.BackNumberService;
import com.neuedu.His02.service.Register.RegisterService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/backnumber")
public class BackNumberController {
    @Autowired
    private BackNumberService service;

    @Autowired
    private RegisterService service1;
    @PostMapping("/selectAllInvoice")
    public ResultUtil selectAllInvoice(Invoice invoice) {
        return new ResultUtil(EnumCode.OK.getValue(), "The account was found successfully",service.selectAllInvoice(invoice));
    }
    @PostMapping("/addInvoice")
    public int addInvoice(Invoice invoice) {
        return service.addInvoice(invoice);
    }
    @PostMapping("/updateInvoice")
    public ResultUtil updateInvoice(@RequestBody Invoice invoice) {
        System.out.println(invoice);
        System.out.println(invoice.getID());
        System.out.println("The update performed");
        return new ResultUtil(EnumCode.OK.getValue(), "Modified successfully",service.updateInvoice(invoice));
    }
    @PostMapping("/deleteInvoice")
    public int deleteInvoice(Invoice invoice) {
        return service.deleteInvoice(invoice);
    }

    @PostMapping("/backNumber")
    public ResultUtil backNumber(@RequestBody Invoice invoice) throws ParseException {
        if(invoice.getState()==7) {
            return new ResultUtil(EnumCode.GONE.getValue(), "The invoice has been returned",invoice);
        }
        new Invoice();
        Invoice invoice1;
        invoice1 = service1.selectMaxInvoice();
        int invoicenum1 = Integer.parseInt(invoice1.getInvoiceNum());
        int invoicenum2 = invoicenum1 + 1;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date nowDate = df.parse(df.format(new Date()));
        invoice.setCreationTime(nowDate);
        invoice.setInvoiceNum(Integer.toString(invoicenum2));
        invoice.setBack(invoice.getInvoiceNum());
        BigDecimal bignum1 = new BigDecimal("-1");
        invoice.setMoney(invoice.getMoney().multiply(bignum1));
        invoice.setState(7);
        System.out.println("Add Red Invoice"+service.addInvoice(invoice));
        return new ResultUtil(EnumCode.OK.getValue(), "Withdrawal succeeded",invoice);
    }
}
