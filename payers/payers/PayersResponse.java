package payers;

public class PayersResponse {
	
	
	    private String PayerCode;

	    private String PayerName;

	    public String getPayerCode ()
	    {
	        return PayerCode;
	    }

	    public void setPayerCode (String PayerCode)
	    {
	        this.PayerCode = PayerCode;
	    }

	    public String getPayerName ()
	    {
	        return PayerName;
	    }

	    public void setPayerName (String PayerName)
	    {
	        this.PayerName = PayerName;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [PayerCode = "+PayerCode+", PayerName = "+PayerName+"]";
	    }
	}


