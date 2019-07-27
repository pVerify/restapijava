package getPayerStatus;

public class PayerStatusSummaryResponse
{
    private String payer_Code;

    private String payerName;

    private String payerStatus;

    public String getPayer_Code ()
    {
        return payer_Code;
    }

    public void setPayer_Code (String payer_Code)
    {
        this.payer_Code = payer_Code;
    }

    public String getPayerName ()
    {
        return payerName;
    }

    public void setPayerName (String payerName)
    {
        this.payerName = payerName;
    }

    public String getPayerStatus ()
    {
        return payerStatus;
    }

    public void setPayerStatus (String payerStatus)
    {
        this.payerStatus = payerStatus;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [payer_Code = "+payer_Code+", payerName = "+payerName+", payerStatus = "+payerStatus+"]";
    }
}