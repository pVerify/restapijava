package easyEligibilitySummary;

public class Date {
    private String Type;

    private String Date;

    public String getType ()
    {
        return Type;
    }

    public void setType (String Type)
    {
        this.Type = Type;
    }

    public String getDate ()
    {
        return Date;
    }

    public void setDate (String Date)
    {
        this.Date = Date;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Type = "+Type+", Date = "+Date+"]";
    }
}
