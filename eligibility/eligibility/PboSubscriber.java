//
// Translated by CS2J (http://www.cs2j.com): 2/8/2019 10:28:57 AM
//

package eligibility;


import java.util.List;

import eligibility.PboCommunicationType;
import eligibility.PboDateType;
import eligibility.PboIdentificationType;

public class PboSubscriber   
{
    private String __Address1;
    public String getAddress1() {
        return __Address1;
    }

    public void setAddress1(String value) {
        __Address1 = value;
    }

    private String __Address2;
    public String getAddress2() {
        return __Address2;
    }

    public void setAddress2(String value) {
        __Address2 = value;
    }

    private String __City;
    public String getCity() {
        return __City;
    }

    public void setCity(String value) {
        __City = value;
    }

    private List<PboCommunicationType> __CommunicationNumber;
    public List<PboCommunicationType> getCommunicationNumber() {
        return __CommunicationNumber;
    }

    public void setCommunicationNumber(List<PboCommunicationType> value) {
        __CommunicationNumber = value;
    }

    private List<PboDateType> __Date;
    public List<PboDateType> getDate() {
        return __Date;
    }

    public void setDate(List<PboDateType> value) {
        __Date = value;
    }

    private String __DOB_R;
    public String getDOB_R() {
        return __DOB_R;
    }

    public void setDOB_R(String value) {
        __DOB_R = value;
    }

    private String __Firstname;
    public String getFirstname() {
        return __Firstname;
    }

    public void setFirstname(String value) {
        __Firstname = value;
    }

    private String __Gender_R;
    public String getGender_R() {
        return __Gender_R;
    }

    public void setGender_R(String value) {
        __Gender_R = value;
    }

    private List<PboIdentificationType> __Identification;
    public List<PboIdentificationType> getIdentification() {
        return __Identification;
    }

    public void setIdentification(List<PboIdentificationType> value) {
        __Identification = value;
    }

    private String __Lastname_R;
    public String getLastname_R() {
        return __Lastname_R;
    }

    public void setLastname_R(String value) {
        __Lastname_R = value;
    }

    private String __Middlename;
    public String getMiddlename() {
        return __Middlename;
    }

    public void setMiddlename(String value) {
        __Middlename = value;
    }

    private String __State;
    public String getState() {
        return __State;
    }

    public void setState(String value) {
        __State = value;
    }

    private String __Suffix;
    public String getSuffix() {
        return __Suffix;
    }

    public void setSuffix(String value) {
        __Suffix = value;
    }

    private String __Zip;
    public String getZip() {
        return __Zip;
    }

    public void setZip(String value) {
        __Zip = value;
    }

}


