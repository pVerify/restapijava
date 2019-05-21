package eligibilitySummary;

public class MiscellaneousInfoSummary {
	
	    private String RemainingSpendDown;

	    private String IsNPIInNetwork;

	    public String getRemainingSpendDown ()
	    {
	        return RemainingSpendDown;
	    }

	    public void setRemainingSpendDown (String RemainingSpendDown)
	    {
	        this.RemainingSpendDown = RemainingSpendDown;
	    }

	    public String getIsNPIInNetwork ()
	    {
	        return IsNPIInNetwork;
	    }

	    public void setIsNPIInNetwork (String IsNPIInNetwork)
	    {
	        this.IsNPIInNetwork = IsNPIInNetwork;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [RemainingSpendDown = "+RemainingSpendDown+", IsNPIInNetwork = "+IsNPIInNetwork+"]";
	    }
}
