package eligibilitySummary;

public class Identification {

	 private String Type;

	    private String Code;

	    private String Name;

	    public String getType()
	    {
	        return Type;
	    }

	    public void setType (String Type)
	    {
	        this.Type = Type;
	    }

	    public String getCode ()
	    {
	        return Code;
	    }

	    public void setCode (String Code)
	    {
	        this.Code = Code;
	    }

	    public String getName ()
	    {
	        return Name;
	    }

	    public void setName (String Name)
	    {
	        this.Name = Name;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [Type = "+Type+", Code = "+Code+", Name = "+Name+"]";
	    }
}
