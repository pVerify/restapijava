package getEligibilitySingelValueAPIKeys;

public class SingelValueResponse {
	
	 private boolean supportsMedicare;

	    private String key;

	    public boolean getSupportsMedicare ()
	    {
	        return supportsMedicare;
	    }

	    public void setSupportsMedicare (boolean supportsMedicare)
	    {
	        this.supportsMedicare = supportsMedicare;
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
	        return "ClassPojo [supportsMedicare = "+supportsMedicare+", key = "+key+"]";
	    }

}
