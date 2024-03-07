package com.neuedu.His02.controller.OutpatientFinancial;


import com.neuedu.His02.entity.ExpenseClass;
import com.neuedu.His02.service.OutpatientFinancial.IExpenseclassService;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/expenseclass")
public class ExpenseclassController {
    @Autowired
    IExpenseclassService service;


    @RequestMapping("/getExpenseClassAll")
    public ResultUtil getExpenseClassAll(ExpenseClass expenseClass) {
        List<ExpenseClass> expenseClassList = service.selectAll(expenseClass);
        if (expenseClassList != null) {
            return new ResultUtil(EnumCode.OK.getValue(), "Success", expenseClassList);
        }
        return new ResultUtil(EnumCode.GONE.getValue(), "Query not available");
    }


    @RequestMapping("/addExpenseClass")
    public ResultUtil addExpenseClass(@RequestBody ExpenseClass expenseClass) {

        expenseClass.setDelMark(1);

        if (service.add(expenseClass) == 1) {
            return new ResultUtil(EnumCode.OK.getValue(), "Success");
        }

        return new ResultUtil(EnumCode.BAD_REQUEST.getValue(), "Added Failed");
    }


    @RequestMapping("/deleteExpenseClass")
    public ResultUtil deleteExpenseClass(@RequestBody ExpenseClass expenseClass) {

        expenseClass.setDelMark(0);
        if (service.update(expenseClass) == 1) {
            return new ResultUtil(EnumCode.OK.getValue(), "Success");
        }
        return new ResultUtil(EnumCode.BAD_REQUEST.getValue(), "Delete Failed");
    }


    @RequestMapping("/updateExpenseClass")
    public ResultUtil updateExpenseClass(@RequestBody ExpenseClass expenseClass) {
        if (service.update(expenseClass) == 1) {
            return new ResultUtil(EnumCode.OK.getValue(), "Success");
        }
        return new ResultUtil(EnumCode.BAD_REQUEST.getValue(), "Modification failure");
    }
}
