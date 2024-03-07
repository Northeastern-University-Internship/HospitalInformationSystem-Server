package com.neuedu.His02.service.Register;

import com.neuedu.His02.entity.*;
import com.neuedu.His02.entity.*;

import java.util.List;

public interface ChargeService {
	public List<CheckApply> selectByIDCheckAppy(int RegistID);
	public List<Prescription> selectByIDPrescription(int RegistID);
	public Fmeditem selectByID(int ID);
	public List<PrescriptionDetailed> selectByDetailed(int PrescriptionID);
	public Drugs selectByDrugID(int ID);
	public int updateCheckApply(Integer ID);
	public int updatePrescriptionDetailed(Integer ID);
}
