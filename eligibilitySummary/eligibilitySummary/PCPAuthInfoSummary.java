package eligibilitySummary;

public class PCPAuthInfoSummary {
	private String UtilizationManagementOrganizationName;

    private String PrimaryCareProviderPhoneNumber;

    private String PrimaryCareProviderName;

    private String CapitationFacilityName;

    private String HBPCAuthorizationInfo;

    public String getUtilizationManagementOrganizationName ()
    {
        return UtilizationManagementOrganizationName;
    }

    public void setUtilizationManagementOrganizationName (String UtilizationManagementOrganizationName)
    {
        this.UtilizationManagementOrganizationName = UtilizationManagementOrganizationName;
    }

    public String getPrimaryCareProviderPhoneNumber ()
    {
        return PrimaryCareProviderPhoneNumber;
    }

    public void setPrimaryCareProviderPhoneNumber (String PrimaryCareProviderPhoneNumber)
    {
        this.PrimaryCareProviderPhoneNumber = PrimaryCareProviderPhoneNumber;
    }

    public String getPrimaryCareProviderName ()
    {
        return PrimaryCareProviderName;
    }

    public void setPrimaryCareProviderName (String PrimaryCareProviderName)
    {
        this.PrimaryCareProviderName = PrimaryCareProviderName;
    }

    public String getCapitationFacilityName ()
    {
        return CapitationFacilityName;
    }

    public void setCapitationFacilityName (String CapitationFacilityName)
    {
        this.CapitationFacilityName = CapitationFacilityName;
    }

    public String getHBPCAuthorizationInfo ()
    {
        return HBPCAuthorizationInfo;
    }

    public void setHBPCAuthorizationInfo (String HBPCAuthorizationInfo)
    {
        this.HBPCAuthorizationInfo = HBPCAuthorizationInfo;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [UtilizationManagementOrganizationName = "+UtilizationManagementOrganizationName+", PrimaryCareProviderPhoneNumber = "+PrimaryCareProviderPhoneNumber+", PrimaryCareProviderName = "+PrimaryCareProviderName+", CapitationFacilityName = "+CapitationFacilityName+", HBPCAuthorizationInfo = "+HBPCAuthorizationInfo+"]";
    }
}
