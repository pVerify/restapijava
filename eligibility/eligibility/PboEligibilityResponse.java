//
// Translated by CS2J (http://www.cs2j.com): 2/8/2019 10:28:57 AM
//

package eligibility;


import java.util.List;

import eligibility.PayersInfo;
import eligibility.PboDemographicInfo;
import eligibility.PboElement;
import eligibility.PboElgResponseExtensionProperties;
import eligibility.PboEligibilityPeriod;
import eligibility.PboNetworkSection;
import eligibility.PboServiceType;

public class PboEligibilityResponse   
{
    private int __ElgRequestID;
    public int getElgRequestID() {
        return __ElgRequestID;
    }

    public void setElgRequestID(int value) {
        __ElgRequestID = value;
    }

    private String __EDIErrorMessage;
    public String getEDIErrorMessage() {
        return __EDIErrorMessage;
    }

    public void setEDIErrorMessage(String value) {
        __EDIErrorMessage = value;
    }

    private String __VerificationStatus;
    public String getVerificationStatus() {
        return __VerificationStatus;
    }

    public void setVerificationStatus(String value) {
        __VerificationStatus = value;
    }

    private String __VerificationMessage;
    public String getVerificationMessage() {
        return __VerificationMessage;
    }

    public void setVerificationMessage(String value) {
        __VerificationMessage = value;
    }

    private String __IsPayerBackOffice;
    public String getIsPayerBackOffice() {
        return __IsPayerBackOffice;
    }

    public void setIsPayerBackOffice(String value) {
        __IsPayerBackOffice = value;
    }

    private String __Status;
    public String getStatus() {
        return __Status;
    }

    public void setStatus(String value) {
        __Status = value;
    }

    private String __PayerName;
    public String getPayerName() {
        return __PayerName;
    }

    public void setPayerName(String value) {
        __PayerName = value;
    }

    private String __VerificationType;
    public String getVerificationType() {
        return __VerificationType;
    }

    public void setVerificationType(String value) {
        __VerificationType = value;
    }

    private String __DOS;
    public String getDOS() {
        return __DOS;
    }

    public void setDOS(String value) {
        __DOS = value;
    }

    private String __Plan;
    public String getPlan() {
        return __Plan;
    }

    public void setPlan(String value) {
        __Plan = value;
    }

    private String __ExceptionNotes;
    public String getExceptionNotes() {
        return __ExceptionNotes;
    }

    public void setExceptionNotes(String value) {
        __ExceptionNotes = value;
    }

    private String __AdditionalInformation;
    public String getAdditionalInformation() {
        return __AdditionalInformation;
    }

    public void setAdditionalInformation(String value) {
        __AdditionalInformation = value;
    }

    private String __OtherMessage;
    public String getOtherMessage() {
        return __OtherMessage;
    }

    public void setOtherMessage(String value) {
        __OtherMessage = value;
    }

    private String __ReportURL;
    public String getReportURL() {
        return __ReportURL;
    }

    public void setReportURL(String value) {
        __ReportURL = value;
    }

    private PboEligibilityPeriod __EligibilityPeriod;
    public PboEligibilityPeriod getEligibilityPeriod() {
        return __EligibilityPeriod;
    }

    public void setEligibilityPeriod(PboEligibilityPeriod value) {
        __EligibilityPeriod = value;
    }

    private PboDemographicInfo __DemographicInfo;
    public PboDemographicInfo getDemographicInfo() {
        return __DemographicInfo;
    }

    public void setDemographicInfo(PboDemographicInfo value) {
        __DemographicInfo = value;
    }

    private List<PboNetworkSection> __NetworkSections;
    public List<PboNetworkSection> getNetworkSections() {
        return __NetworkSections;
    }

    public void setNetworkSections(List<PboNetworkSection> value) {
        __NetworkSections = value;
    }

    private PboServiceType __HealthBenefitPlanCoverageServiceType;
    public PboServiceType getHealthBenefitPlanCoverageServiceType() {
        return __HealthBenefitPlanCoverageServiceType;
    }

    public void setHealthBenefitPlanCoverageServiceType(PboServiceType value) {
        __HealthBenefitPlanCoverageServiceType = value;
    }

    private List<PboServiceType> __ServicesTypes;
    public List<PboServiceType> getServicesTypes() {
        return __ServicesTypes;
    }

    public void setServicesTypes(List<PboServiceType> value) {
        __ServicesTypes = value;
    }

    private List<PboElement> __CustomFields;
    public List<PboElement> getCustomFields() {
        return __CustomFields;
    }

    public void setCustomFields(List<PboElement> value) {
        __CustomFields = value;
    }

    //Extended Properties
    private PboElgResponseExtensionProperties __ExtensionProperties;
    public void setExtensionProperties(PboElgResponseExtensionProperties value) {
        __ExtensionProperties = value;
    }

    public PboElgResponseExtensionProperties getExtensionProperties() {
        return __ExtensionProperties;
    }

    private PayersInfo __OtherPayerInfo;
    public PayersInfo getOtherPayerInfo() {
        return __OtherPayerInfo;
    }

    public void setOtherPayerInfo(PayersInfo value) {
        __OtherPayerInfo = value;
    }

}


