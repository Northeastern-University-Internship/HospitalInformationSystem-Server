package com.neuedu.His02.mapper.Register;

import java.util.List;

import com.neuedu.His02.entity.Invoice;
import com.neuedu.His02.entity.PatientCosts;
import org.apache.ibatis.annotations.Mapper;

import com.neuedu.His02.entity.Register;

@Mapper
public interface RegisterMapper {
	public List<Register> selectAll(Register r);
	public Register selectById(Register r);
	public int add(Register r);
	public int delete(Register r);
	public int update(Register r);
	public Invoice print(Register r);
	public Invoice selectInvoice(Invoice invoice);
	public Invoice selectMaxInvoice();
	public int addInvoice(Invoice invoice);
	public int addPatientCosts(PatientCosts patientCosts);
}
