package com.neuedu.His02.mapper.Register;

import com.neuedu.His02.entity.Invoice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BackNumberMapper {
	public List<Invoice> selectAllInvoice(Invoice invoice);
	public int updateInvoice(Invoice invoice);
	public int addInvoice(Invoice invoice);
	public int deleteInvoice(Invoice invoice);
}
