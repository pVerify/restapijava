package easyEligibilitySummary;

public class PlanCoverageSummary {
	 private String Status;

	    private String GroupName;

	    private String PolicyType;

	    private String ExpiryDate;

	    private String HRAorHSALimitationsRemaining;

	    private String GroupNumber;

	    private String PlanNetworkName;

	    private String PlanName;

	    private String SubscriberRelationship;

	    private String PlanNumber;

	    private String EffectiveDate;

	    private String PlanNetworkID;

	    public String getStatus ()
	    {
	        return Status;
	    }

	    public void setStatus (String Status)
	    {
	        this.Status = Status;
	    }

	    public String getGroupName ()
	    {
	        return GroupName;
	    }

	    public void setGroupName (String GroupName)
	    {
	        this.GroupName = GroupName;
	    }

	    public String getPolicyType ()
	    {
	        return PolicyType;
	    }

	    public void setPolicyType (String PolicyType)
	    {
	        this.PolicyType = PolicyType;
	    }

	    public String getExpiryDate ()
	    {
	        return ExpiryDate;
	    }

	    public void setExpiryDate (String ExpiryDate)
	    {
	        this.ExpiryDate = ExpiryDate;
	    }

	    public String getHRAorHSALimitationsRemaining ()
	    {
	        return HRAorHSALimitationsRemaining;
	    }

	    public void setHRAorHSALimitationsRemaining (String HRAorHSALimitationsRemaining)
	    {
	        this.HRAorHSALimitationsRemaining = HRAorHSALimitationsRemaining;
	    }

	    public String getGroupNumber ()
	    {
	        return GroupNumber;
	    }

	    public void setGroupNumber (String GroupNumber)
	    {
	        this.GroupNumber = GroupNumber;
	    }

	    public String getPlanNetworkName ()
	    {
	        return PlanNetworkName;
	    }

	    public void setPlanNetworkName (String PlanNetworkName)
	    {
	        this.PlanNetworkName = PlanNetworkName;
	    }

	    public String getPlanName ()
	    {
	        return PlanName;
	    }

	    public void setPlanName (String PlanName)
	    {
	        this.PlanName = PlanName;
	    }

	    public String getSubscriberRelationship ()
	    {
	        return SubscriberRelationship;
	    }

	    public void setSubscriberRelationship (String SubscriberRelationship)
	    {
	        this.SubscriberRelationship = SubscriberRelationship;
	    }

	    public String getPlanNumber ()
	    {
	        return PlanNumber;
	    }

	    public void setPlanNumber (String PlanNumber)
	    {
	        this.PlanNumber = PlanNumber;
	    }

	    public String getEffectiveDate ()
	    {
	        return EffectiveDate;
	    }

	    public void setEffectiveDate (String EffectiveDate)
	    {
	        this.EffectiveDate = EffectiveDate;
	    }

	    public String getPlanNetworkID ()
	    {
	        return PlanNetworkID;
	    }

	    public void setPlanNetworkID (String PlanNetworkID)
	    {
	        this.PlanNetworkID = PlanNetworkID;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [Status = "+Status+", GroupName = "+GroupName+", PolicyType = "+PolicyType+", ExpiryDate = "+ExpiryDate+", HRAorHSALimitationsRemaining = "+HRAorHSALimitationsRemaining+", GroupNumber = "+GroupNumber+", PlanNetworkName = "+PlanNetworkName+", PlanName = "+PlanName+", SubscriberRelationship = "+SubscriberRelationship+", PlanNumber = "+PlanNumber+", EffectiveDate = "+EffectiveDate+", PlanNetworkID = "+PlanNetworkID+"]";
	    }
}
