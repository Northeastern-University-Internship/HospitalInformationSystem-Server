package com.neuedu.His02.service.OutpatientFinancial;

import com.neuedu.His02.entity.ExpenseClass;

import java.util.List;


public interface IExpenseclassService{
    public List<ExpenseClass> selectAll(ExpenseClass expenseClass);
    public ExpenseClass selectById(ExpenseClass expenseClass);
    public int add(ExpenseClass expenseClass);
    public int update(ExpenseClass expenseClass);
    public int delete(ExpenseClass expenseClass);
}
