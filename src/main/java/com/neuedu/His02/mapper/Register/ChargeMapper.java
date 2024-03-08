package com.neuedu.His02.mapper.Register;

import com.neuedu.His02.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChargeMapper {
	public List<CheckApply> selectByIDCheckAppy(int RegistID);
	public List<Prescription> selectByIDPrescription(int RegistID);
	public Fmeditem selectByID(int ID);
	public List<PrescriptionDetailed> selectByDetailed(int PrescriptionID);
	public Drugs selectByDrugID(int ID);
	public int updateCheckApply(Integer ID);
	public int updatePrescriptionDetailed(Integer ID);

}
