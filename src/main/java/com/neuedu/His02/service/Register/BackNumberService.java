package com.neuedu.His02.service.Register;

import com.neuedu.His02.entity.Invoice;

import java.util.List;

public interface BackNumberService {
	public List<Invoice> selectAllInvoice(Invoice invoice);
	public int updateInvoice(Invoice invoice);
	public int addInvoice(Invoice invoice);
	public int deleteInvoice(Invoice invoice);
}
