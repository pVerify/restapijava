package eligibilitySummary;

public class ServiceTypeDetailInfo {
	    private String ServiceTypeName;

	    private ServiceTypeSections[] ServiceTypeSections;

	    public String getServiceTypeName ()
	    {
	        return ServiceTypeName;
	    }

	    public void setServiceTypeName (String ServiceTypeName)
	    {
	        this.ServiceTypeName = ServiceTypeName;
	    }

	    public ServiceTypeSections[] getServiceTypeSections ()
	    {
	        return ServiceTypeSections;
	    }

	    public void setServiceTypeSections (ServiceTypeSections[] ServiceTypeSections)
	    {
	        this.ServiceTypeSections = ServiceTypeSections;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [ServiceTypeName = "+ServiceTypeName+", ServiceTypeSections = "+ServiceTypeSections+"]";
	    }

}
