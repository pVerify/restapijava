package easyEligibilitySummary;

public class Dependent {
    private DependentInfo DependentInfo;

    private String Relationship;

    public DependentInfo getDependentInfo ()
    {
        return DependentInfo;
    }

    public void setDependentInfo (DependentInfo DependentInfo)
    {
        this.DependentInfo = DependentInfo;
    }

    public String getRelationship ()
    {
        return Relationship;
    }

    public void setRelationship (String Relationship)
    {
        this.Relationship = Relationship;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DependentInfo = "+DependentInfo+", Relationship = "+Relationship+"]";
    }

}
