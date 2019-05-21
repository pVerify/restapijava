package eligibilitySummary;

public class DependentInfo {
	private String Lastname_R;

    private String Zip;

    private String CommunicationNumber;

    private String MilitaryPersonnelInfo;

    private String Address2;

    private String DOB_R;

    private Identification[] Identification;

    private String Address1;

    private String City;

    private Date[] Date;

    private String Firstname;

    private String Suffix;

    private String State;

    private String FullName;

    private String Gender_R;

    private String Middlename;

    public String getLastname_R ()
    {
        return Lastname_R;
    }

    public void setLastname_R (String Lastname_R)
    {
        this.Lastname_R = Lastname_R;
    }

    public String getZip ()
    {
        return Zip;
    }

    public void setZip (String Zip)
    {
        this.Zip = Zip;
    }

    public String getCommunicationNumber ()
    {
        return CommunicationNumber;
    }

    public void setCommunicationNumber (String CommunicationNumber)
    {
        this.CommunicationNumber = CommunicationNumber;
    }

    public String getMilitaryPersonnelInfo ()
    {
        return MilitaryPersonnelInfo;
    }

    public void setMilitaryPersonnelInfo (String MilitaryPersonnelInfo)
    {
        this.MilitaryPersonnelInfo = MilitaryPersonnelInfo;
    }

    public String getAddress2 ()
    {
        return Address2;
    }

    public void setAddress2 (String Address2)
    {
        this.Address2 = Address2;
    }

    public String getDOB_R ()
    {
        return DOB_R;
    }

    public void setDOB_R (String DOB_R)
    {
        this.DOB_R = DOB_R;
    }

    public Identification[] getIdentification ()
    {
        return Identification;
    }

    public void setIdentification (Identification[] Identification)
    {
        this.Identification = Identification;
    }

    public String getAddress1 ()
    {
        return Address1;
    }

    public void setAddress1 (String Address1)
    {
        this.Address1 = Address1;
    }

    public String getCity ()
    {
        return City;
    }

    public void setCity (String City)
    {
        this.City = City;
    }

    public Date[] getDate ()
    {
        return Date;
    }

    public void setDate (Date[] Date)
    {
        this.Date = Date;
    }

    public String getFirstname ()
    {
        return Firstname;
    }

    public void setFirstname (String Firstname)
    {
        this.Firstname = Firstname;
    }

    public String getSuffix ()
    {
        return Suffix;
    }

    public void setSuffix (String Suffix)
    {
        this.Suffix = Suffix;
    }

    public String getState ()
    {
        return State;
    }

    public void setState (String State)
    {
        this.State = State;
    }

    public String getFullName ()
    {
        return FullName;
    }

    public void setFullName (String FullName)
    {
        this.FullName = FullName;
    }

    public String getGender_R ()
    {
        return Gender_R;
    }

    public void setGender_R (String Gender_R)
    {
        this.Gender_R = Gender_R;
    }

    public String getMiddlename ()
    {
        return Middlename;
    }

    public void setMiddlename (String Middlename)
    {
        this.Middlename = Middlename;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Lastname_R = "+Lastname_R+", Zip = "+Zip+", CommunicationNumber = "+CommunicationNumber+", MilitaryPersonnelInfo = "+MilitaryPersonnelInfo+", Address2 = "+Address2+", DOB_R = "+DOB_R+", Identification = "+Identification+", Address1 = "+Address1+", City = "+City+", Date = "+Date+", Firstname = "+Firstname+", Suffix = "+Suffix+", State = "+State+", FullName = "+FullName+", Gender_R = "+Gender_R+", Middlename = "+Middlename+"]";
    }
}
