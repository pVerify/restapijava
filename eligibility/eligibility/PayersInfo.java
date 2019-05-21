//
// Translated by CS2J (http://www.cs2j.com): 2/8/2019 10:28:57 AM
//

package eligibility;


public class PayersInfo   
{
    private String __PrimaryPayer;
    public String getPrimaryPayer() {
        return __PrimaryPayer;
    }

    public void setPrimaryPayer(String value) {
        __PrimaryPayer = value;
    }

    //this indicates the primary payer is someone else
    private String __Payer;
    public String getPayer() {
        return __Payer;
    }

    public void setPayer(String value) {
        __Payer = value;
    }

    // this indicates the payer info is either primary or secondary.
    private String __SecondaryPayer;
    public String getSecondaryPayer() {
        return __SecondaryPayer;
    }

    public void setSecondaryPayer(String value) {
        __SecondaryPayer = value;
    }

    // - this indicates there is a secondary payer
    //public string TertiaryPayer{get;set;}// - this indicates there is a tertiary payer
    //public string Vendor {get;set;}  //- this indicates there is a vendor
    private String __PlanSponsor;
    public String getPlanSponsor() {
        return __PlanSponsor;
    }

    public void setPlanSponsor(String value) {
        __PlanSponsor = value;
    }

    // - this indicates a plan sponsor that the payer is notified about.
    private String __IndependentPhysiciansAssociation_IPA;
    public String getIndependentPhysiciansAssociation_IPA() {
        return __IndependentPhysiciansAssociation_IPA;
    }

    public void setIndependentPhysiciansAssociation_IPA(String value) {
        __IndependentPhysiciansAssociation_IPA = value;
    }

    // - this indicates IPA
    //public string ManagedCareOrganization {get;set;} //- this indicates MCO.
    private String __WorkersCompensation;
    public String getWorkersCompensation() {
        return __WorkersCompensation;
    }

    public void setWorkersCompensation(String value) {
        __WorkersCompensation = value;
    }

    // - this indicates for Medicare, the Medicare Workers Comp payer.
    private String __ContractedServiceProvider;
    public String getContractedServiceProvider() {
        return __ContractedServiceProvider;
    }

    public void setContractedServiceProvider(String value) {
        __ContractedServiceProvider = value;
    }

}


