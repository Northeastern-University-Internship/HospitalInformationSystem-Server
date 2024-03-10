package com.neuedu.His02.mapper.OutpatientFinancial;

import com.neuedu.His02.entity.ExpenseClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ExpenseclassMapper{
    public List<ExpenseClass> selectAll(ExpenseClass expenseClass);
    public ExpenseClass selectById(ExpenseClass expenseClass);
    public int add(ExpenseClass expenseClass);
    public int update(ExpenseClass expenseClass);
    public int delete(ExpenseClass expenseClass);
}
