package easyEligibilitySummary;

public class OtherInfo {
	private String Message;

    private String Value;

    private String Key;

    private OtherInfo[] OtherInfo;

    public String getMessage ()
    {
        return Message;
    }

    public void setMessage (String Message)
    {
        this.Message = Message;
    }

    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    public String getKey ()
    {
        return Key;
    }

    public void setKey (String Key)
    {
        this.Key = Key;
    }

    public OtherInfo[] getOtherInfo ()
    {
        return OtherInfo;
    }

    public void setOtherInfo (OtherInfo[] OtherInfo)
    {
        this.OtherInfo = OtherInfo;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Message = "+Message+", Value = "+Value+", Key = "+Key+", OtherInfo = "+OtherInfo+"]";
    }

}
