package com.neuedu.His02.service.Register;

import com.neuedu.His02.entity.Invoice;

import java.util.Date;
import java.util.List;

public interface DailySettlementService {
	public List<Invoice> selectAllInvoice(Date start_time, Date end_time);
	public int updateInvoice(Invoice invoice);
}
