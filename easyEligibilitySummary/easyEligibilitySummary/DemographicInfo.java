package easyEligibilitySummary;

public class DemographicInfo {
	
	    private Subscriber Subscriber;

	    private Dependent Dependent;

	    public Subscriber getSubscriber ()
	    {
	        return Subscriber;
	    }

	    public void setSubscriber (Subscriber Subscriber)
	    {
	        this.Subscriber = Subscriber;
	    }

	    public Dependent getDependent ()
	    {
	        return Dependent;
	    }

	    public void setDependent (Dependent Dependent)
	    {
	        this.Dependent = Dependent;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [Subscriber = "+Subscriber+", Dependent = "+Dependent+"]";
	    }
}
