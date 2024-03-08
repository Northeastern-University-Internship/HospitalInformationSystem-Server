create table checkapply
(
    ID           int auto_increment comment 'ID_Primary_key'
        primary key,
    MedicalID    int           not null comment 'medical_record_ID',
    RegistID     int           not null comment 'registered_ID',
    ItemID       int           not null comment 'Item ID',
    Name         varchar(64)   not null comment 'Project name',
    Objective    varchar(512)  null comment 'Objective requirement',
    Position     varchar(64)   null comment 'Check position',
    IsUrgent     int default 0 null comment 'Whether it is urgent, 1 means urgent, 0 means not urgent',
    Num          int           null comment 'Quantity',
    CreationTime datetime      not null comment 'Creation time',
    DoctorID     int           null comment 'Doctor ID',
    CheckOperID  int           not null comment 'CheckOperID',
    ResultOperID int           not null comment 'Result entry personnel ID',
    CheckTime    datetime      null comment 'Check time',
    Result       varchar(512)  null comment 'Check result',
    ResultTime   datetime      null comment 'result time',
    State        int           null comment 'state',
    RecordType   int           not null comment 'Record type 1-check 2-test 3-dispose'
)
    charset = utf8mb3;

create table checkrelation
(
    ID          int auto_increment comment 'ID_Primary_key'
        primary key,
    CheckProjID int         not null comment 'Project ID',
    CheckTempID int         not null comment 'Application template ID',
    Position    varchar(64) null comment 'Check position'
)
    charset = utf8mb3;

create table checktemplate
(
    ID           int auto_increment comment 'ID_Primary_key'
        primary key,
    Name         varchar(64)   not null comment 'name',
    UserID       int           not null comment 'Doctor ID',
    CreationTime datetime      not null comment 'Creation time',
    Scope        char(2)       null comment 'Scope of use: whole hospital/department/individual',
    RecordType   int           not null comment 'Record type 1-check 2-test 3-dispose',
    DelMark      int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table constantitem
(
    ID             int auto_increment comment 'ID_Primary_key'
        primary key,
    ConstantTypeID int           not null comment 'Constant category ID',
    ConstantCode   varchar(64)   not null comment 'Constant item code',
    ConstantName   varchar(64)   not null comment 'Constant item name',
    DelMark        int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table constanttype
(
    ID               int auto_increment comment 'ID_Primary_key'
        primary key,
    ConstantTypeCode varchar(64)   not null comment 'Constant type code',
    ConstantTypeName varchar(64)   not null comment 'Constant category name',
    DelMark          int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table department
(
    ID             int auto_increment comment 'ID_Primary_key'
        primary key,
    DeptCode       varchar(64)   not null comment 'Department code',
    DeptName       varchar(255)  not null comment 'Department name',
    DeptCategoryID int           not null comment 'Department Category',
    DeptType       int           null comment 'Department type',
    DelMark        int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table diagnosistemplate
(
    ID        int auto_increment comment 'ID_Primary_key'
        primary key,
    DeptID    int           not null comment 'Department ID',
    UserID    int           not null comment 'Doctor ID',
    Diagnosis varchar(512)  null comment 'Diagnosis result',
    Handling  varchar(512)  null comment 'Handling opinions',
    Scope     char(255)     null comment 'Scope of use: whole hospital/department/individual',
    DelMark   int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table disease
(
    ID             int auto_increment comment 'ID_Primary_key'
        primary key,
    DiseaseCode    varchar(64)   not null comment 'Disease mnemonic code',
    DiseaseName    varchar(255)  not null comment 'Disease name',
    DiseaseICD     varchar(64)   not null comment 'International ICD code',
    DiseCategoryID int           not null comment 'Disease category',
    DelMark        int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table disecategory
(
    ID         int auto_increment comment 'ID_Primary_key'
        primary key,
    DicaCode   varchar(64)   not null comment 'Category code',
    DicaName   varchar(64)   not null comment 'Category name',
    SequenceNo int           null comment 'Display sequence number',
    DicaType   int           not null comment 'Disease type',
    DelMark    int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table drugs
(
    ID             int auto_increment comment 'ID_Primary_key'
        primary key,
    DrugsCode      char(255)     not null comment 'drug code',
    DrugsName      varchar(512)  not null comment 'drug name',
    DrugsFormat    varchar(512)  null comment 'Drug specifications',
    DrugsUnit      varchar(64)   null comment 'Packaging unit',
    Manufacturer   varchar(512)  null comment 'Manufacturer',
    DrugsDosageID  int           null comment 'Drug dosage form',
    DrugsTypeID    int           null comment 'drug type',
    DrugsPrice     decimal(8, 2) not null comment 'drug unit price',
    MnemonicCode   varchar(64)   null comment 'Pinyin mnemonic code',
    CreationDate   datetime      not null comment 'Creation time',
    LastUpdateDate datetime      null comment 'Last modified time',
    DelMark        int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table drugsdetailed
(
    ID          int auto_increment comment 'ID_Primary_key'
        primary key,
    DrugsTempID int         not null comment 'Pharmaceutical template ID',
    DrugsID     int         not null comment 'drug ID',
    DrugsUsage  varchar(64) null comment 'usage',
    Dosage      varchar(64) null comment 'Dosage',
    Frequency   varchar(64) null comment 'Frequency'
)
    charset = utf8mb3;

create table drugstemplate
(
    ID           int auto_increment comment 'ID_Primary_key'
        primary key,
    Name         varchar(64)   not null comment 'name',
    UserID       int           not null comment 'Doctor ID',
    CreationTime datetime      not null comment 'Creation time',
    Scope        char(255)     null comment 'Scope of use: whole hospital/department/individual',
    DelMark      int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table expenseclass
(
    ID      int auto_increment comment 'ID_Primary_key'
        primary key,
    ExpCode varchar(64)   not null comment 'Expense account code',
    ExpName varchar(64)   not null comment 'Expense account name',
    DelMark int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table fmeditem
(
    ID             int auto_increment comment 'ID_Primary_key'
        primary key,
    ItemCode       varchar(64)   not null comment 'Item code',
    ItemName       varchar(64)   not null comment 'Item name',
    Format         varchar(64)   null comment 'Specification',
    Price          decimal(8, 2) not null comment 'unit price',
    ExpClassID     int           null comment 'The expense account ID',
    DeptID         int           null comment 'Executive department ID',
    MnemonicCode   varchar(64)   null comment 'Pinyin mnemonic code',
    CreationDate   datetime      not null comment 'Creation time',
    LastUpdateDate datetime      null comment 'Last modified time',
    RecordType     int           null comment 'Project type',
    DelMark        int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table herbaldetailed
(
    ID           int auto_increment comment 'ID_Primary_key'
        primary key,
    HerbalPresID int           not null comment 'Herbal prescription ID',
    HerbalID     int           not null comment 'drug ID',
    Dosage       varchar(64)   null comment 'Dosage',
    Price        decimal(8, 2) not null comment 'drug unit price',
    Footnote     varchar(64)   null comment 'footnote'
)
    charset = utf8mb3;

create table herbalprescription
(
    ID               int auto_increment comment 'ID_Primary_key'
        primary key,
    MedicalID        int          not null comment 'medical_record_ID',
    RegistID         int          not null comment 'registered_ID',
    UserID           int          not null comment 'Doctor ID',
    PrescriptionName varchar(64)  not null comment 'prescription name',
    CreationTime     datetime     not null comment 'Creation time',
    PrescriptioType  varchar(64)  null comment 'Prescription type: decoction/soak in wine/powder/pill making/capsulation, etc.',
    PayNumber        int          null comment 'PayNumber',
    Frequency        varchar(64)  null comment 'Frequency',
    DrugsUsage       varchar(64)  null comment 'Usage internal/external use',
    Therapy          varchar(512) null comment 'Therapy',
    Detailed         varchar(512) null comment 'Detailed treatment method',
    Advice           varchar(512) null comment 'Doctors advice',
    State            int          null comment 'state'
)
    charset = utf8mb3;

create table herbaltempdetailed
(
    ID           int auto_increment comment 'ID_Primary_key'
        primary key,
    HerbalTempID int         not null comment 'Herbal template ID',
    HerbalID     int         not null comment 'drug ID',
    Dosage       varchar(64) null comment 'Dosage',
    Unit         varchar(64) null comment 'drug unit',
    Footnote     varchar(64) null comment 'footnote'
)
    charset = utf8mb3;

create table herbaltemplate
(
    ID              int auto_increment comment 'ID_Primary_key'
        primary key,
    Name            varchar(64)   not null comment 'name',
    DoctorID        int           not null comment 'Doctor ID',
    CreationTime    datetime      not null comment 'Creation time',
    PrescriptioType varchar(64)   null comment 'Prescription type: decoction/soak in wine/powder/pill making/capsulation, etc.',
    PayNumber       int           null comment 'PayNumber',
    DrugsUsage      varchar(64)   null comment 'usage',
    Therapy         varchar(512)  null comment 'Therapy',
    Detailed        varchar(512)  null comment 'Detailed treatment method',
    Advice          varchar(512)  null comment 'Doctors advice',
    Scope           varchar(64)   null comment 'Scope of use: whole hospital/department/individual',
    DelMark         int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table invoice
(
    ID           int auto_increment comment 'ID_Primary_key'
        primary key,
    InvoiceNum   varchar(64)   not null comment 'Invoice number',
    Money        decimal(8, 2) not null comment 'Invoice amount',
    State        int           not null comment 'Invoice status 1-normal 2-voided',
    CreationTime datetime      not null comment 'Collection/refund time',
    UserID       int           not null comment 'ID of person who collects/refunds',
    RegistID     int           null comment 'registered_ID ',
    FeeType      int           null comment 'Charging method',
    Back         varchar(64)   null comment 'red invoice number',
    DailyState   int default 0 not null comment 'Invoice status 0-not yet settled 1-submitted 2-approved'
)
    charset = utf8mb3;

create table medicaldisease
(
    ID           int auto_increment comment 'ID_Primary_key'
        primary key,
    MedicalID    int      not null comment 'medical_record_ID',
    RegistID     int      not null comment 'registered_ID',
    DiseaseID    int      not null comment 'Disease ID',
    DiagnoseType int      null comment 'Diagnosis type 1-Western medicine 2-Traditional Chinese medicine',
    GetSiskDate  datetime null comment 'date of onset',
    DiagnoseCate int      null comment 'Diagnosis type 1-initial diagnosis 2-final diagnosis'
)
    charset = utf8mb3;

create table medicalrecord
(
    ID           int auto_increment comment 'ID_Primary_key'
        primary key,
    CaseNumber   varchar(64)  not null comment 'medical_record_Id',
    RegistID     int          not null comment 'registered_ID',
    Readme       varchar(512) null comment 'Main complaint',
    Present      varchar(512) null comment 'History of current illness',
    PresentTreat varchar(512) null comment 'Treatment status of current disease',
    History      varchar(512) null comment 'History',
    Allergy      varchar(512) null comment 'Allergy history',
    Physique     varchar(512) null comment 'Physical examination',
    Proposal     varchar(512) null comment 'Check proposal',
    Careful      varchar(512) null comment 'Notes',
    CheckResult  varchar(512) null comment 'Check result',
    Diagnosis    varchar(512) null comment 'Diagnosis result',
    Handling     varchar(512) null comment 'Handling opinions',
    CaseState    int          null comment 'Medical record status 1-temporary storage 2-submitted 3-diagnosis completed'
)
    charset = utf8mb3;

create table patientcosts
(
    ID           int auto_increment comment 'ID_Primary_key'
        primary key,
    RegistID     int           not null comment 'registered_ID',
    InvoiceID    int           not null comment 'Invoice ID',
    ItemID       int           not null comment 'Item ID',
    ItemType     int           not null comment 'Item type 1-non-drug 2-drug',
    Name         varchar(64)   not null comment 'Project name',
    Price        decimal(8, 2) not null comment 'Project unit price',
    Amount       decimal(8, 2) not null comment 'Amount',
    DeptID       int           not null comment 'Executive department ID',
    Createtime   datetime      not null comment 'Create time',
    CreateOperID int           not null comment 'Issuer ID',
    PayTime      datetime      not null comment 'Payment/refund time',
    RegisterID   int           not null comment 'ID of person who collects/refunds',
    FeeType      int           not null comment 'Charging method',
    BackID       int           null comment 'Refund corresponding record ID'
)
    charset = utf8mb3;

create table prescription
(
    ID                int auto_increment comment 'ID_Primary_key'
        primary key,
    MedicalID         int         not null comment 'medical_record_ID',
    RegistID          int         not null comment 'registered_ID',
    UserID            int         not null comment 'Doctor ID',
    PrescriptionName  varchar(64) not null comment 'prescription name',
    PrescriptionTime  datetime    not null comment 'Issuance time',
    PrescriptionState int         not null comment 'prescription status'
)
    charset = utf8mb3;

create table prescriptiondetailed
(
    ID             int auto_increment comment 'ID_Primary_key'
        primary key,
    PrescriptionID int           not null comment 'Pharmaceutical prescription ID',
    DrugsID        int           not null comment 'drug ID',
    DrugsUsage     varchar(64)   null comment 'usage',
    Dosage         varchar(64)   null comment 'Dosage',
    Frequency      varchar(64)   null comment 'Frequency',
    Amount         decimal(8, 2) not null comment 'Amount',
    State          int default 2 not null comment 'State'
)
    charset = utf8mb3;

create table recordtemplate
(
    ID           int auto_increment comment 'ID_Primary_key'
        primary key,
    Name         varchar(64)   not null comment 'name',
    DeptID       int           not null comment 'Department ID',
    UserID       int           not null comment 'Doctor ID',
    CreationTime datetime      not null comment 'Creation time',
    Scope        varchar(64)   null comment 'Scope of use: whole hospital/department/individual',
    Readme       varchar(512)  null comment 'Main complaint',
    Present      varchar(512)  null comment 'History of current illness',
    PresentTreat varchar(512)  null comment 'Treatment status of current disease',
    History      varchar(512)  null comment 'History',
    Allergy      varchar(512)  null comment 'Allergy history',
    Physique     varchar(512)  null comment 'Physical examination',
    Proposal     varchar(512)  null comment 'Check proposal',
    Careful      varchar(512)  null comment 'Notes',
    CheckResult  varchar(512)  null comment 'Check result',
    Diagnosis    varchar(512)  null comment 'Diagnosis result',
    Handling     varchar(512)  null comment 'Handling opinions',
    DelMark      int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table register
(
    ID          int auto_increment comment 'ID_Primary_key'
        primary key,
    CaseNumber  varchar(64) not null comment 'medical_record_ID',
    RealName    varchar(64) not null comment 'name',
    Gender      int         not null comment 'Gender',
    IDnumber    varchar(18) null comment 'ID number',
    BirthDate   date        null comment 'Birth date',
    Age         int         null comment 'Age',
    AgeType     char(255)   null comment 'Age type years months days',
    HomeAddress varchar(64) null comment 'Home Address',
    VisitDate   date        not null comment 'Date of this visit',
    Noon        char(255)   not null comment 'noon morning/afternoon',
    DeptID      int         not null comment 'Department ID of this registration',
    UserID      int         not null comment 'doctors ID',
    RegistLeID  int         not null comment 'registration section ID',
    SettleID    int         not null comment 'Settlement category ID',
    IsBook      char(255)   null comment 'Medical record book to be or not yes/no',
    RegistTime  datetime    not null comment 'Registration time',
    RegisterID  int         not null comment 'Register ID',
    VisitState  int         null comment 'This visit status'
)
    charset = utf8mb3;

create table registlevel
(
    ID          int auto_increment comment 'ID_Primary_key'
        primary key,
    RegistCode  varchar(64)   not null comment 'number code',
    RegistName  varchar(64)   not null comment 'number name',
    SequenceNo  int           not null comment 'Display sequence number',
    RegistFee   decimal(8, 2) null comment 'Registration fee',
    RegistQuota int           not null comment 'Registration quota',
    DelMark     int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table registwork
(
    ID         int auto_increment comment 'ID_Primary_key'
        primary key,
    RegisterID int      not null comment 'Charge person ID',
    StartTime  datetime not null comment 'Daily settlement starting time',
    EndTime    datetime not null comment 'end time of daily settlement'
)
    charset = utf8mb3;

create table rule
(
    ID       int auto_increment comment 'ID_Primary_key'
        primary key,
    RuleName varchar(64)   not null comment 'Rule name',
    DeptID   int           null comment 'Department ID',
    UserID   int           null comment 'Doctor ID',
    Week     varchar(14)   null comment 'week',
    DelMark  int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table scheduling
(
    ID        int auto_increment comment 'ID_Primary_key'
        primary key,
    SchedDate date          not null comment 'Schedule date',
    DeptID    int           not null comment 'Department ID',
    UserID    int           not null comment 'Doctor ID',
    Noon      char(255)     not null comment 'noon farewell',
    RuleID    int           not null comment 'Scheduling rule ID',
    DelMark   int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table settlecategory
(
    ID         int auto_increment comment 'ID_Primary_key'
        primary key,
    SettleCode varchar(64)   not null comment 'Category code',
    SettleName varchar(64)   not null comment 'category name',
    SequenceNo int           null comment 'Display sequence number',
    DelMark    int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;

create table user
(
    ID           int auto_increment comment 'ID_Primary_key'
        primary key,
    UserName     varchar(64)   not null comment 'Login name',
    Password     varchar(64)   not null comment 'Password',
    RealName     varchar(64)   not null comment 'real name',
    UseType      int           null comment 'User category',
    DocTitleID   int           null comment 'Doctor title ID',
    IsScheduling char(255)     null comment 'Whether to participate in shift scheduling',
    DeptID       int           not null comment 'Department ID',
    RegistLeID   int           null comment 'Registration level ID',
    DelMark      int default 1 not null comment 'Delete mark'
)
    charset = utf8mb3;


