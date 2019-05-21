package getEligibility;

public class GetEligibilityResponse {

	    private String isParsed;

	    private String errorMessage;

	    private String value;

	    private String key;

	    public String getIsParsed ()
	    {
	        return isParsed;
	    }

	    public void setIsParsed (String isParsed)
	    {
	        this.isParsed = isParsed;
	    }

	    public String getErrorMessage ()
	    {
	        return errorMessage;
	    }

	    public void setErrorMessage (String errorMessage)
	    {
	        this.errorMessage = errorMessage;
	    }

	    public String getValue ()
	    {
	        return value;
	    }

	    public void setValue (String value)
	    {
	        this.value = value;
	    }

	    public String getKey ()
	    {
	        return key;
	    }

	    public void setKey (String key)
	    {
	        this.key = key;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [isParsed = "+isParsed+", errorMessage = "+errorMessage+", value = "+value+", key = "+key+"]";
	    }
	
}
