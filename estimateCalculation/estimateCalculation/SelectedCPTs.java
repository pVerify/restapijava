package estimateCalculation;

public class SelectedCPTs
{
    private String unit;

    private String allowedAmount;

    private String procedure;

    public String getUnit ()
    {
        return unit;
    }

    public void setUnit (String unit)
    {
        this.unit = unit;
    }

    public String getAllowedAmount ()
    {
        return allowedAmount;
    }

    public void setAllowedAmount (String allowedAmount)
    {
        this.allowedAmount = allowedAmount;
    }

    public String getProcedure ()
    {
        return procedure;
    }

    public void setProcedure (String procedure)
    {
        this.procedure = procedure;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [unit = "+unit+", allowedAmount = "+allowedAmount+", procedure = "+procedure+"]";
    }
}
