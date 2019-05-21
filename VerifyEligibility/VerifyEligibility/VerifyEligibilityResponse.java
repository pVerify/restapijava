package VerifyEligibility;

public class VerifyEligibilityResponse
{
    private String eligibilityResult;

    private String eligibilityStatus;

    private String ediErrorMessage;

    private String transactionStatus;

    private String transactionMessage;

    public String getEligibilityResult ()
    {
        return eligibilityResult;
    }

    public void setEligibilityResult (String eligibilityResult)
    {
        this.eligibilityResult = eligibilityResult;
    }

    public String getEligibilityStatus ()
    {
        return eligibilityStatus;
    }

    public void setEligibilityStatus (String eligibilityStatus)
    {
        this.eligibilityStatus = eligibilityStatus;
    }

    public String getEdiErrorMessage ()
    {
        return ediErrorMessage;
    }

    public void setEdiErrorMessage (String ediErrorMessage)
    {
        this.ediErrorMessage = ediErrorMessage;
    }

    public String getTransactionStatus ()
    {
        return transactionStatus;
    }

    public void setTransactionStatus (String transactionStatus)
    {
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionMessage ()
    {
        return transactionMessage;
    }

    public void setTransactionMessage (String transactionMessage)
    {
        this.transactionMessage = transactionMessage;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [eligibilityResult = "+eligibilityResult+", eligibilityStatus = "+eligibilityStatus+", ediErrorMessage = "+ediErrorMessage+", transactionStatus = "+transactionStatus+", transactionMessage = "+transactionMessage+"]";
    }
}