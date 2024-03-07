package com.neuedu.His02.controller.Register;

import com.neuedu.His02.entity.Invoice;
import com.neuedu.His02.service.Register.DailySettlementService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/daily")
public class DailySettlementController {
    @Autowired
    private DailySettlementService service;

    @RequestMapping("/selectBydate")

    public ResultUtil selectBydate(Invoice invoice) throws ParseException {
        System.out.println("Start time"+invoice.getCreationTime());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date nowDate = df.parse(df.format(new Date()));
        return new ResultUtil(EnumCode.OK.getValue(), "Query successfully",service.selectAllInvoice(invoice.getCreationTime(),nowDate));
    }

    @PostMapping("/updateInvoice")
    public ResultUtil updateInvoice(@RequestBody Invoice invoice){
        System.out.println("Modified implementation");
        System.out.println(invoice.getID());
        service.updateInvoice(invoice);
        return new ResultUtil(EnumCode.OK.getValue(), "Modified successfully",1);
    }
}
