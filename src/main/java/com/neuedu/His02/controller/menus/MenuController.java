package com.neuedu.His02.controller.menus;

import com.neuedu.His02.entity.User;
import com.neuedu.His02.entity.menu.Menu;
import com.neuedu.His02.util.EnumCode;
import com.neuedu.His02.util.ResultUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MenuController {
    public List<Menu> adminMenu() { //Hospital Administrator's Menu
        List<Menu> adminMenuList = new ArrayList<>(); //Hospital Administrator's General Menu

        Menu departmentManagement = new Menu(); //
        departmentManagement.setName("DiagnosticDepartmentManagement ");
        departmentManagement.setTitle("DiagnosticDepartmentManagement");
        departmentManagement.setPath("/administrator/diagnosticDepartmentManagement");
        departmentManagement.setComponent("administrator/DiagnosticDepartmentManagement");
        departmentManagement.setChildren(null);

        Menu userManagement = new Menu(); //First child menu
        userManagement.setName("User Management");
        userManagement.setTitle("User management");
        userManagement.setIcon("");
        userManagement.setPath("/administrator/userManagement");
        userManagement.setComponent("administrator/UserManagement");
        userManagement.setChildren(null);

        Menu registrationLevelManagement = new Menu(); //Third child menu
        registrationLevelManagement.setName("User Rating Management");
        registrationLevelManagement.setTitle("User Rating Management");
        registrationLevelManagement.setIcon("");
        registrationLevelManagement.setPath("/administrator/userRatingManagement");
        registrationLevelManagement.setComponent("administrator/UserRatingManagement");
        registrationLevelManagement.setChildren(null);

        Menu settlementCategoryManagement = new Menu(); //Fourth sublevel menu
        settlementCategoryManagement.setName("Balance Accounting Management");
        settlementCategoryManagement.setTitle("Balance Accounting Management");
        settlementCategoryManagement.setIcon("");
        settlementCategoryManagement.setPath("/administrator/balanceAccountingManagement");
        settlementCategoryManagement.setComponent("administrator/BalanceAccountingManagement");
        settlementCategoryManagement.setChildren(null);

        Menu diagnosticDirectoryManagement = new Menu(); //Fifth Child Menu
        diagnosticDirectoryManagement.setName("Diagnostic Classification Management");
        diagnosticDirectoryManagement.setTitle("Diagnostic Classification Management");
        diagnosticDirectoryManagement.setIcon("");
        diagnosticDirectoryManagement.setPath("/administrator/diagnosticClassificationManagement");
        diagnosticDirectoryManagement.setComponent("administrator/DiagnosticClassificationManagement");
        diagnosticDirectoryManagement.setChildren(null);

        Menu nonDrugChargeItemsManagement = new Menu(); //Sixth child menu
        nonDrugChargeItemsManagement.setName("Non Pharmaceutical Management");
        nonDrugChargeItemsManagement.setTitle("Non Pharmaceutical Management");
        nonDrugChargeItemsManagement.setIcon("");
        nonDrugChargeItemsManagement.setPath("/administrator/nonPharmaceuticalManagement");
        nonDrugChargeItemsManagement.setComponent("administrator/NonPharmaceuticalManagement");
        nonDrugChargeItemsManagement.setChildren(null);

        Menu doctorSchedulingManagement = new Menu(); //Seventh child menu
        doctorSchedulingManagement.setName("MedicalScheduleManagement");
        doctorSchedulingManagement.setTitle("Medical Schedule Management");
        doctorSchedulingManagement.setIcon("");
        doctorSchedulingManagement.setPath("/administrator/medicalScheduleManagement");
        doctorSchedulingManagement.setComponent("administrator/MedicalScheduleManagement");
        doctorSchedulingManagement.setChildren(null);

        Menu basicInformationMaintenance = new Menu(); //First Parent Menu
        basicInformationMaintenance.setName("BasicInformationMaintenance");
        basicInformationMaintenance.setTitle("BasicInformationMaintenance");
        basicInformationMaintenance.setIcon("");
        basicInformationMaintenance.setPath("");
        basicInformationMaintenance.setComponent("");

        List<Menu> allChildren = new ArrayList<>();
        allChildren.add(departmentManagement);
        allChildren.add(userManagement);
        allChildren.add(registrationLevelManagement);
        allChildren.add(settlementCategoryManagement);
        allChildren.add(diagnosticDirectoryManagement);
        allChildren.add(nonDrugChargeItemsManagement);
        allChildren.add(doctorSchedulingManagement);
        basicInformationMaintenance.setChildren(allChildren);

        adminMenuList.add(basicInformationMaintenance);

        return adminMenuList;
    }

    public List<Menu> registeredTollCollectorMenu() { //Menu for Registered Toll Collector
        List<Menu> registeredTollCollectorMenuList = new ArrayList<>(); //General Menu for the Registered Toll Collector

        Menu onSiteRegistration = new Menu(); //First child menu
        onSiteRegistration.setName("windowRegistration");
        onSiteRegistration.setTitle("windowRegistration");
        onSiteRegistration.setIcon("");
        onSiteRegistration.setPath("/registeredOrderCollector/windowRegistration");
        onSiteRegistration.setComponent("registeredOrderCollector/WindowRegistration");
        onSiteRegistration.setChildren(null);

        Menu charge = new Menu(); //Second child menu
        charge.setName("Window Withdrawal");
        charge.setTitle("Window Withdrawal");
        charge.setIcon("");
        charge.setPath("/registeredOrderCollector/windowWithdrawal");
        charge.setComponent("registeredOrderCollector/WindowWithdrawal");
        charge.setChildren(null);

        Menu backNumber = new Menu(); //Third child menu
        backNumber.setName("Refund");
        backNumber.setTitle("Refund");
        backNumber.setIcon("");
        backNumber.setPath("/registeredOrderCollector/refund");
        backNumber.setComponent("registeredOrderCollector/Refund");
        backNumber.setChildren(null);


        Menu patientExpenseQuery = new Menu(); //Fifth Child Menu
        patientExpenseQuery.setName("PatientExpenseQuery");
        patientExpenseQuery.setTitle("PatientFeeInquiries");
        patientExpenseQuery.setIcon("");
        patientExpenseQuery.setPath("/registeredOrderCollector/expenseRecordQuery");
        patientExpenseQuery.setComponent("registeredOrderCollector/ExpenseRecordQuery");
        patientExpenseQuery.setChildren(null);

        Menu tollCollectorDailySettlement = new Menu(); //Sixth child menu
        tollCollectorDailySettlement.setName("TollManagement");
        tollCollectorDailySettlement.setTitle("TollManagement");
        tollCollectorDailySettlement.setIcon("");
        tollCollectorDailySettlement.setPath("/registeredOrderCollector/tollManagement");
        tollCollectorDailySettlement.setComponent("registeredOrderCollector/TollManagement");
        tollCollectorDailySettlement.setChildren(null);


        Menu outpatientRegistrationFee = new Menu(); //FirstParentMenu
        outpatientRegistrationFee.setName("OutpatientRegistrationFee");
        outpatientRegistrationFee.setTitle("OutpatientRegistrationFee");
        outpatientRegistrationFee.setIcon("");
        outpatientRegistrationFee.setPath("");
        outpatientRegistrationFee.setComponent("");

        List<Menu> allChildren = new ArrayList<>();
        allChildren.add(onSiteRegistration);
        allChildren.add(charge);
        allChildren.add(backNumber);

        allChildren.add(patientExpenseQuery);
        allChildren.add(tollCollectorDailySettlement);

        outpatientRegistrationFee.setChildren(allChildren);

        registeredTollCollectorMenuList.add(outpatientRegistrationFee);

        return registeredTollCollectorMenuList;
    }

    public List<Menu> outpatientDoctorWorkstationMenu() { //Outpatient Doctor's Menu
        List<Menu> outpatientDoctorWorkstationMenuList = new ArrayList<>(); //General Menu for Outpatient Physicians

        Menu outpatientMedicalRecordHomePage = new Menu(); //First child menu
        outpatientMedicalRecordHomePage.setName("OutpatientMedicalHistory");
        outpatientMedicalRecordHomePage.setTitle("OutpatientMedicalHistory");
        outpatientMedicalRecordHomePage.setIcon("");
        outpatientMedicalRecordHomePage.setPath("/medicalCareManagement/outpatientMedicalHistory");
        outpatientMedicalRecordHomePage.setComponent("medicalCareManagement/OutpatientMedicalHistory");
        outpatientMedicalRecordHomePage.setChildren(null);

        Menu inspectionApplication = new Menu(); //Second child menu
        inspectionApplication.setName("ConsultationApplication");
        inspectionApplication.setTitle("ConsultationApplication");
        inspectionApplication.setIcon("");
        inspectionApplication.setPath("/medicalCareManagement/consultationApplication");
        inspectionApplication.setComponent("medicalCareManagement/ConsultationApplication");
        inspectionApplication.setChildren(null);



        Menu outpatientDiagnosis = new Menu(); //Fourth sublevel menu
        outpatientDiagnosis.setName("OutpatientDiagnosis");
        outpatientDiagnosis.setTitle("OutpatientDiagnosis");
        outpatientDiagnosis.setIcon("");
        outpatientDiagnosis.setPath("/medicalCareManagement/outpatientDiagnosis");
        outpatientDiagnosis.setComponent("medicalCareManagement/OutpatientDiagnosis");
        outpatientDiagnosis.setChildren(null);

        Menu disposalApplication = new Menu(); //Fifth Child Menu
        disposalApplication.setName("HandlingApplication");
        disposalApplication.setTitle("HandlingApplication");
        disposalApplication.setIcon("");
        disposalApplication.setPath("/medicalCareManagement/handlingApplication");
        disposalApplication.setComponent("medicalCareManagement/HandlingApplication");
        disposalApplication.setChildren(null);

        Menu patentPrescription = new Menu(); //Sixth child menu
        patentPrescription.setName("Prescription");
        patentPrescription.setTitle("Prescription");
        patentPrescription.setIcon("");
        patentPrescription.setPath("/medicalCareManagement/prescription");
        patentPrescription.setComponent("medicalCareManagement/Prescription");
        patentPrescription.setChildren(null);


        Menu afterDiagnosis = new Menu(); //Eighth child menu
        afterDiagnosis.setName("FollowUpManagement");
        afterDiagnosis.setTitle("FollowUpManagement");
        afterDiagnosis.setIcon("");
        afterDiagnosis.setPath("/medicalCareManagement/followUpManagement");
        afterDiagnosis.setComponent("medicalCareManagement/FollowUpManagement");
        afterDiagnosis.setChildren(null);

        Menu patientExpenseDetailsQuery = new Menu(); //Ninth child menu
        patientExpenseDetailsQuery.setName("ExpenseDetail");
        patientExpenseDetailsQuery.setTitle("ExpenseDetail");
        patientExpenseDetailsQuery.setIcon("");
        patientExpenseDetailsQuery.setPath("/medicalCareManagement/expenseDetail");
        patientExpenseDetailsQuery.setComponent("medicalCareManagement/ExpenseDetail");
        patientExpenseDetailsQuery.setChildren(null);

        Menu inspectionTemplateManagement = new Menu(); //Eleventh Child Menu
        inspectionTemplateManagement.setName("ConsultationManagement");
        inspectionTemplateManagement.setTitle("ConsultationManagement");
        inspectionTemplateManagement.setIcon("");
        inspectionTemplateManagement.setPath("/medicalCareManagement/consultationManagement");
        inspectionTemplateManagement.setComponent("medicalCareManagement/ConsultationManagement");
        inspectionTemplateManagement.setChildren(null);


        Menu personalWorkloadStatistics = new Menu(); //Fifteenth Child Menu
        personalWorkloadStatistics.setName("ConsultationStatistics");
        personalWorkloadStatistics.setTitle("ConsultationStatistics");
        personalWorkloadStatistics.setIcon("");
        personalWorkloadStatistics.setPath("/medicalCareManagement/consultationStatistics");
        personalWorkloadStatistics.setComponent("medicalCareManagement/ConsultationStatistics");
        personalWorkloadStatistics.setChildren(null);

        Menu outpatientDoctorWorkstation = new Menu(); //First Parent Menu
        outpatientDoctorWorkstation.setName("OutpatientDoctorWorkstation");
        outpatientDoctorWorkstation.setTitle("OutpatientDoctorWorkstation");
        outpatientDoctorWorkstation.setIcon("");
        outpatientDoctorWorkstation.setPath("");
        outpatientDoctorWorkstation.setComponent("");

        List<Menu> allChildren = new ArrayList<>();
        allChildren.add(outpatientMedicalRecordHomePage);
        allChildren.add(inspectionApplication);
//
        allChildren.add(outpatientDiagnosis);
        allChildren.add(disposalApplication);
        allChildren.add(patentPrescription);
//        allChildren.add(herbalPrescription);
        allChildren.add(afterDiagnosis);
        allChildren.add(patientExpenseDetailsQuery);
//        allChildren.add(medicalRecordTemplateManagement);
        allChildren.add(inspectionTemplateManagement);
//        allChildren.add(testTemplateManagement);
//        allChildren.add(disposalTemplateManagement);
//        allChildren.add(prescriptionSetManagement);
        allChildren.add(personalWorkloadStatistics);
        outpatientDoctorWorkstation.setChildren(allChildren);

        outpatientDoctorWorkstationMenuList.add(outpatientDoctorWorkstation);

        return outpatientDoctorWorkstationMenuList;
    }

    public List<Menu> outpatientMedicalTechnologyWorkstationMenu() { //Menu for Outpatient Medical Technology
        List<Menu> outpatientMedicalTechnologyWorkstationMenuList = new ArrayList<>(); //General menu of outpatient medical skills

        Menu inspectionAndTestRegister = new Menu(); //First child menu
        inspectionAndTestRegister.setName("InspectionRegister");
        inspectionAndTestRegister.setTitle("InspectionRegister");
        inspectionAndTestRegister.setIcon("");
        inspectionAndTestRegister.setPath("/inspectionManagement/inspectionRegister");
        inspectionAndTestRegister.setComponent("inspectionManagement/InspectionRegister");
        inspectionAndTestRegister.setChildren(null);

        Menu inspectionAndTestResultEntry = new Menu(); //Second child menu
        inspectionAndTestResultEntry.setName("InspectionEntry");
        inspectionAndTestResultEntry.setTitle("InspectionEntry");
        inspectionAndTestResultEntry.setIcon("");
        inspectionAndTestResultEntry.setPath("/inspectionManagement/inspectionEntry");
        inspectionAndTestResultEntry.setComponent("inspectionManagement/InspectionEntry");
        inspectionAndTestResultEntry.setChildren(null);

        Menu personalWorkloadStatistics = new Menu(); //Third child menu
        personalWorkloadStatistics.setName("Inspection Statistics");
        personalWorkloadStatistics.setTitle("Inspection Statistics");
        personalWorkloadStatistics.setIcon("");
        personalWorkloadStatistics.setPath("/inspectionManagement/inspectionStatistics");
        personalWorkloadStatistics.setComponent("inspectionManagement/InspectionStatistics");
        personalWorkloadStatistics.setChildren(null);

        Menu outpatientMedicalTechnologyWorkstation = new Menu(); //First Parent Menu
        outpatientMedicalTechnologyWorkstation.setName("OutpatientMedicalTechnologyWorkstation");
        outpatientMedicalTechnologyWorkstation.setTitle("OutpatientMedicalTechnologyWorkstation");
        outpatientMedicalTechnologyWorkstation.setIcon("");
        outpatientMedicalTechnologyWorkstation.setPath("");
        outpatientMedicalTechnologyWorkstation.setComponent("");

        List<Menu> allChildren = new ArrayList<>();
        allChildren.add(inspectionAndTestRegister);
        allChildren.add(inspectionAndTestResultEntry);
        allChildren.add(personalWorkloadStatistics);
        outpatientMedicalTechnologyWorkstation.setChildren(allChildren);

        outpatientMedicalTechnologyWorkstationMenuList.add(outpatientMedicalTechnologyWorkstation);

        return outpatientMedicalTechnologyWorkstationMenuList;
    }

    public List<Menu> outpatientPharmacyWorkstationMenu() { //Menu for the Outpatient Pharmacy
        List<Menu> outpatientPharmacyWorkstationMenuList = new ArrayList<>(); //General Menu of the Outpatient Pharmacy

        Menu outpatientDispensing = new Menu(); //First child menu
        outpatientDispensing.setName("PharmacyDispensingMedicine");
        outpatientDispensing.setTitle("PharmacyDispensingMedicine");
        outpatientDispensing.setIcon("");
        outpatientDispensing.setPath("/pharmacyManagement/pharmacyDispensingMedicine");
        outpatientDispensing.setComponent("pharmacyManagement/PharmacyDispensingMedicine");
        outpatientDispensing.setChildren(null);

        Menu outpatientWithdrawal = new Menu(); //Second child menu
        outpatientWithdrawal.setName("PharmacyWithdrawal");
        outpatientWithdrawal.setTitle("PharmacyWithdrawal");
        outpatientWithdrawal.setIcon("");
        outpatientWithdrawal.setPath("/pharmacyManagement/pharmacyWithdrawal");
        outpatientWithdrawal.setComponent("pharmacyManagement/PharmacyWithdrawal");
        outpatientWithdrawal.setChildren(null);

        Menu drugCatalogueManagement = new Menu(); //Third child menu
        drugCatalogueManagement.setName("DrugLibraryManagement");
        drugCatalogueManagement.setTitle("DrugLibraryManagement");
        drugCatalogueManagement.setIcon("");
        drugCatalogueManagement.setPath("/pharmacyManagement/drugLibraryManagement");
        drugCatalogueManagement.setComponent("pharmacyManagement/DrugLibraryManagement");
        drugCatalogueManagement.setChildren(null);

        Menu outpatientPharmacyWorkstation = new Menu(); //First Parent Menu
        outpatientPharmacyWorkstation.setName("OutpatientPharmacyWorkstation");
        outpatientPharmacyWorkstation.setTitle("OutpatientPharmacyWorkstation");
        outpatientPharmacyWorkstation.setIcon("");
        outpatientPharmacyWorkstation.setPath("");
        outpatientPharmacyWorkstation.setComponent("");

        List<Menu> allChildren = new ArrayList<>();
        allChildren.add(outpatientDispensing);
        allChildren.add(outpatientWithdrawal);
        allChildren.add(drugCatalogueManagement);
        outpatientPharmacyWorkstation.setChildren(allChildren);

        outpatientPharmacyWorkstationMenuList.add(outpatientPharmacyWorkstation);

        return outpatientPharmacyWorkstationMenuList;
    }

    public List<Menu> patientMenu() { //Patient's Menu
        List<Menu> patientMenuList = new ArrayList<>(); //Patient's Total Menu

        Menu register = new Menu(); //First child menu
        register.setName("register");
        register.setTitle("Registered");
        register.setIcon("");
        register.setPath("/patient/register");
        register.setComponent("patient/Register");
        register.setChildren(null);

        Menu patient = new Menu(); // First Parent Menu
        patient.setName("Patient");
        patient.setTitle("Patient Medical Services");
        patient.setIcon("");
        patient.setPath("");
        patient.setComponent("");

        List<Menu> allChildren = new ArrayList<>();
        allChildren.add(register);

        patient.setChildren(allChildren);

        patientMenuList.add(patient);

        return patientMenuList;
    }

    public List<Menu> outpatientFinancialManagementMenu() { //Menu for Outpatient Finance
        List<Menu> outpatientFinancialManagementMenuList = new ArrayList<>(); //General Menu for Outpatient Finance

        Menu expenseAccountManagement = new Menu(); //First child menu
        expenseAccountManagement.setName("FinancialAccountingManagement");
        expenseAccountManagement.setTitle("FinancialAccountingManagement");
        expenseAccountManagement.setIcon("");
        expenseAccountManagement.setPath("/financialManagement/financialAccountingManagement");
        expenseAccountManagement.setComponent("financialManagement/FinancialAccountingManagement");
        expenseAccountManagement.setChildren(null);


        Menu workloadStatisticsOfOutpatientDepartments = new Menu(); //Third child menu
        workloadStatisticsOfOutpatientDepartments.setName("OutPatientConsultationStatistics");
        workloadStatisticsOfOutpatientDepartments.setTitle("OutPatientConsultationStatistics");
        workloadStatisticsOfOutpatientDepartments.setIcon("");
        workloadStatisticsOfOutpatientDepartments.setPath("/financialManagement/outPatientConsultationStatistics");
        workloadStatisticsOfOutpatientDepartments.setComponent("financialManagement/OutPatientConsultationStatistics");
        workloadStatisticsOfOutpatientDepartments.setChildren(null);


        Menu outpatientFinancialManagement = new Menu(); //First Parent Menu
        outpatientFinancialManagement.setName("OutpatientFinancialManagement");
        outpatientFinancialManagement.setTitle("OutpatientFinancialManagement");
        outpatientFinancialManagement.setIcon("");
        outpatientFinancialManagement.setPath("");
        outpatientFinancialManagement.setComponent("");

        List<Menu> allChildren = new ArrayList<>();
        allChildren.add(expenseAccountManagement);

        allChildren.add(workloadStatisticsOfOutpatientDepartments);
        outpatientFinancialManagement.setChildren(allChildren);

        outpatientFinancialManagementMenuList.add(outpatientFinancialManagement);

        return outpatientFinancialManagementMenuList;
    }


    @PostMapping("/sys/menu/nav")
    public ResultUtil menus(@RequestBody User user) {
        System.out.println("Users at the front end:" + user);
        if (user.getID() != null) {
            int type = user.getUseType();
            System.out.println("Type of user：" + type);
            switch (type) {
                case 1:
                    return new ResultUtil(EnumCode.OK.getValue(), "Generate menu successfully", this.adminMenu());
                case 2:
                    return new ResultUtil(EnumCode.OK.getValue(), "Generate menu successfully", this.registeredTollCollectorMenu());
                case 3:
                    return new ResultUtil(EnumCode.OK.getValue(), "Generate menu successfully", this.outpatientDoctorWorkstationMenu());
                case 4:
                    return new ResultUtil(EnumCode.OK.getValue(), "Generate menu successfully", this.outpatientMedicalTechnologyWorkstationMenu());
                case 5:
                    return new ResultUtil(EnumCode.OK.getValue(), "Generate menu successfully", this.outpatientPharmacyWorkstationMenu());
                case 6:
                    return new ResultUtil(EnumCode.OK.getValue(), "Generate menu successfully", this.outpatientFinancialManagementMenu());
                case 7:
                    return new ResultUtil(EnumCode.OK.getValue(), "Generate menu successfully", this.patientMenu());
                default:
                    return new ResultUtil(EnumCode.LOGIN_FAIL.getValue(), "Failed to generate menu", null);

            }

        } else {
            return new ResultUtil(EnumCode.LOGIN_FAIL.getValue(), "Failed to generate menu", null);
        }

    }
}
