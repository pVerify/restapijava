package easyEligibilitySummary;

public class ServiceTypeSections {

	    private String Label;

	    private ServiceParameters[] ServiceParameters;

	    public String getLabel ()
	    {
	        return Label;
	    }

	    public void setLabel (String Label)
	    {
	        this.Label = Label;
	    }

	    public ServiceParameters[] getServiceParameters ()
	    {
	        return ServiceParameters;
	    }

	    public void setServiceParameters (ServiceParameters[] ServiceParameters)
	    {
	        this.ServiceParameters = ServiceParameters;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [Label = "+Label+", ServiceParameters = "+ServiceParameters+"]";
	    }
}
