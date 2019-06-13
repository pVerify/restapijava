package easyEligibilitySummary;

import eligibilitySummary.DemographicInfo;
import eligibilitySummary.HBPC_Deductible_OOP_Summary;
import eligibilitySummary.MiscellaneousInfoSummary;
import eligibilitySummary.PCPAuthInfoSummary;
import eligibilitySummary.PlanCoverageSummary;
import eligibilitySummary.PracticeTypeSummary;
import eligibilitySummary.ServiceTypeDetailInfo;

public class EEligSummaryResponse {

	private String OtherPayerInfo;

    private String RequestID;

    private PlanCoverageSummary PlanCoverageSummary;

    private String APIResponseCode;

    private String VerificationType;

    private String IsHMOPlan;

    private String APIResponseMessage;

    private String DOS;

    private ServiceTypeDetailInfo[] ServiceTypeDetailInfo;

    private String PayerName;

    private String AddtionalInfo;

    private String NonEDIResultPath;

    private String MedicareInfoSummary;

    private String ExceptionNotes;

    private String DisclaimerMessage;

    private String IsPayerBackOffice;

    private PracticeTypeSummary PracticeTypeSummary;

    private PCPAuthInfoSummary PCPAuthInfoSummary;

    private MiscellaneousInfoSummary MiscellaneousInfoSummary;

    private String ResponseText;

    private HBPC_Deductible_OOP_Summary HBPC_Deductible_OOP_Summary;

    private DemographicInfo DemographicInfo;

    private String ReferrenceId;

    private String Location;

    public String getOtherPayerInfo ()
    {
        return OtherPayerInfo;
    }

    public void setOtherPayerInfo (String OtherPayerInfo)
    {
        this.OtherPayerInfo = OtherPayerInfo;
    }

    public String getRequestID ()
    {
        return RequestID;
    }

    public void setRequestID (String RequestID)
    {
        this.RequestID = RequestID;
    }

    public PlanCoverageSummary getPlanCoverageSummary ()
    {
        return PlanCoverageSummary;
    }

    public void setPlanCoverageSummary (PlanCoverageSummary PlanCoverageSummary)
    {
        this.PlanCoverageSummary = PlanCoverageSummary;
    }

    public String getAPIResponseCode ()
    {
        return APIResponseCode;
    }

    public void setAPIResponseCode (String APIResponseCode)
    {
        this.APIResponseCode = APIResponseCode;
    }

    public String getVerificationType ()
    {
        return VerificationType;
    }

    public void setVerificationType (String VerificationType)
    {
        this.VerificationType = VerificationType;
    }

    public String getIsHMOPlan ()
    {
        return IsHMOPlan;
    }

    public void setIsHMOPlan (String IsHMOPlan)
    {
        this.IsHMOPlan = IsHMOPlan;
    }

    public String getAPIResponseMessage ()
    {
        return APIResponseMessage;
    }

    public void setAPIResponseMessage (String APIResponseMessage)
    {
        this.APIResponseMessage = APIResponseMessage;
    }

    public String getDOS ()
    {
        return DOS;
    }

    public void setDOS (String DOS)
    {
        this.DOS = DOS;
    }

    public ServiceTypeDetailInfo[] getServiceTypeDetailInfo ()
    {
        return ServiceTypeDetailInfo;
    }

    public void setServiceTypeDetailInfo (ServiceTypeDetailInfo[] ServiceTypeDetailInfo)
    {
        this.ServiceTypeDetailInfo = ServiceTypeDetailInfo;
    }

    public String getPayerName ()
    {
        return PayerName;
    }

    public void setPayerName (String PayerName)
    {
        this.PayerName = PayerName;
    }

    public String getAddtionalInfo ()
    {
        return AddtionalInfo;
    }

    public void setAddtionalInfo (String AddtionalInfo)
    {
        this.AddtionalInfo = AddtionalInfo;
    }

    public String getNonEDIResultPath ()
    {
        return NonEDIResultPath;
    }

    public void setNonEDIResultPath (String NonEDIResultPath)
    {
        this.NonEDIResultPath = NonEDIResultPath;
    }

    public String getMedicareInfoSummary ()
    {
        return MedicareInfoSummary;
    }

    public void setMedicareInfoSummary (String MedicareInfoSummary)
    {
        this.MedicareInfoSummary = MedicareInfoSummary;
    }

    public String getExceptionNotes ()
    {
        return ExceptionNotes;
    }

    public void setExceptionNotes (String ExceptionNotes)
    {
        this.ExceptionNotes = ExceptionNotes;
    }

    public String getDisclaimerMessage ()
    {
        return DisclaimerMessage;
    }

    public void setDisclaimerMessage (String DisclaimerMessage)
    {
        this.DisclaimerMessage = DisclaimerMessage;
    }

    public String getIsPayerBackOffice ()
    {
        return IsPayerBackOffice;
    }

    public void setIsPayerBackOffice (String IsPayerBackOffice)
    {
        this.IsPayerBackOffice = IsPayerBackOffice;
    }

    public PracticeTypeSummary getPracticeTypeSummary ()
    {
        return PracticeTypeSummary;
    }

    public void setPracticeTypeSummary (PracticeTypeSummary PracticeTypeSummary)
    {
        this.PracticeTypeSummary = PracticeTypeSummary;
    }

    public PCPAuthInfoSummary getPCPAuthInfoSummary ()
    {
        return PCPAuthInfoSummary;
    }

    public void setPCPAuthInfoSummary (PCPAuthInfoSummary PCPAuthInfoSummary)
    {
        this.PCPAuthInfoSummary = PCPAuthInfoSummary;
    }

    public MiscellaneousInfoSummary getMiscellaneousInfoSummary ()
    {
        return MiscellaneousInfoSummary;
    }

    public void setMiscellaneousInfoSummary (MiscellaneousInfoSummary MiscellaneousInfoSummary)
    {
        this.MiscellaneousInfoSummary = MiscellaneousInfoSummary;
    }

    public String getResponseText ()
    {
        return ResponseText;
    }

    public void setResponseText (String ResponseText)
    {
        this.ResponseText = ResponseText;
    }

    public HBPC_Deductible_OOP_Summary getHBPC_Deductible_OOP_Summary ()
    {
        return HBPC_Deductible_OOP_Summary;
    }

    public void setHBPC_Deductible_OOP_Summary (HBPC_Deductible_OOP_Summary HBPC_Deductible_OOP_Summary)
    {
        this.HBPC_Deductible_OOP_Summary = HBPC_Deductible_OOP_Summary;
    }

    public DemographicInfo getDemographicInfo ()
    {
        return DemographicInfo;
    }

    public void setDemographicInfo (DemographicInfo DemographicInfo)
    {
        this.DemographicInfo = DemographicInfo;
    }

    public String getReferrenceId ()
    {
        return ReferrenceId;
    }

    public void setReferrenceId (String ReferrenceId)
    {
        this.ReferrenceId = ReferrenceId;
    }

    public String getLocation ()
    {
        return Location;
    }

    public void setLocation (String Location)
    {
        this.Location = Location;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [OtherPayerInfo = "+OtherPayerInfo+", RequestID = "+RequestID+", PlanCoverageSummary = "+PlanCoverageSummary+", APIResponseCode = "+APIResponseCode+", VerificationType = "+VerificationType+", IsHMOPlan = "+IsHMOPlan+", APIResponseMessage = "+APIResponseMessage+", DOS = "+DOS+", ServiceTypeDetailInfo = "+ServiceTypeDetailInfo+", PayerName = "+PayerName+", AddtionalInfo = "+AddtionalInfo+", NonEDIResultPath = "+NonEDIResultPath+", MedicareInfoSummary = "+MedicareInfoSummary+", ExceptionNotes = "+ExceptionNotes+", DisclaimerMessage = "+DisclaimerMessage+", IsPayerBackOffice = "+IsPayerBackOffice+", PracticeTypeSummary = "+PracticeTypeSummary+", PCPAuthInfoSummary = "+PCPAuthInfoSummary+", MiscellaneousInfoSummary = "+MiscellaneousInfoSummary+", ResponseText = "+ResponseText+", HBPC_Deductible_OOP_Summary = "+HBPC_Deductible_OOP_Summary+", DemographicInfo = "+DemographicInfo+", ReferrenceId = "+ReferrenceId+", Location = "+Location+"]";
    }

}
