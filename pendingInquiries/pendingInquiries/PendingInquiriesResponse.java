package pendingInquiries;

public class PendingInquiriesResponse {
    private String TransactionId;

    private String IsDependentVerification;

    private String Status;

    private String PatientDOB;

    private String DOS_StartDate;

    private String PatientFirstName;

    private String PatientLastName;

    private String ProviderNPI;

    private String ProviderLastName;

    private String MemberId;

    public String getTransactionId ()
    {
        return TransactionId;
    }

    public void setTransactionId (String TransactionId)
    {
        this.TransactionId = TransactionId;
    }

    public String getIsDependentVerification ()
    {
        return IsDependentVerification;
    }

    public void setIsDependentVerification (String IsDependentVerification)
    {
        this.IsDependentVerification = IsDependentVerification;
    }

    public String getStatus ()
    {
        return Status;
    }

    public void setStatus (String Status)
    {
        this.Status = Status;
    }

    public String getPatientDOB ()
    {
        return PatientDOB;
    }

    public void setPatientDOB (String PatientDOB)
    {
        this.PatientDOB = PatientDOB;
    }

    public String getDOS_StartDate ()
    {
        return DOS_StartDate;
    }

    public void setDOS_StartDate (String DOS_StartDate)
    {
        this.DOS_StartDate = DOS_StartDate;
    }

    public String getPatientFirstName ()
    {
        return PatientFirstName;
    }

    public void setPatientFirstName (String PatientFirstName)
    {
        this.PatientFirstName = PatientFirstName;
    }

    public String getPatientLastName ()
    {
        return PatientLastName;
    }

    public void setPatientLastName (String PatientLastName)
    {
        this.PatientLastName = PatientLastName;
    }

    public String getProviderNPI ()
    {
        return ProviderNPI;
    }

    public void setProviderNPI (String ProviderNPI)
    {
        this.ProviderNPI = ProviderNPI;
    }

    public String getProviderLastName ()
    {
        return ProviderLastName;
    }

    public void setProviderLastName (String ProviderLastName)
    {
        this.ProviderLastName = ProviderLastName;
    }

    public String getMemberId ()
    {
        return MemberId;
    }

    public void setMemberId (String MemberId)
    {
        this.MemberId = MemberId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TransactionId = "+TransactionId+", IsDependentVerification = "+IsDependentVerification+", Status = "+Status+", PatientDOB = "+PatientDOB+", DOS_StartDate = "+DOS_StartDate+", PatientFirstName = "+PatientFirstName+", PatientLastName = "+PatientLastName+", ProviderNPI = "+ProviderNPI+", ProviderLastName = "+ProviderLastName+", MemberId = "+MemberId+"]";
    }
}
