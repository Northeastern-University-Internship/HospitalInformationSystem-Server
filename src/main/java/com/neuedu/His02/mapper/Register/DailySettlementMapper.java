package com.neuedu.His02.mapper.Register;

import com.neuedu.His02.entity.Invoice;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface DailySettlementMapper {
	public List<Invoice> selectAllInvoice(Date start_time, Date end_time);
	public int updateInvoice(Invoice invoice);
}
