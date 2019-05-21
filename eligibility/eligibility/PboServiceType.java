//
// Translated by CS2J (http://www.cs2j.com): 2/8/2019 10:28:57 AM
//

package eligibility;

import java.util.List;

import eligibility.PboServiceSection;

public class PboServiceType   
{
    private String __ServiceTypeName;
    public String getServiceTypeName() {
        return __ServiceTypeName;
    }

    public void setServiceTypeName(String value) {
        __ServiceTypeName = value;
    }

    private List<PboServiceSection> __ServiceTypeSections;
    public List<PboServiceSection> getServiceTypeSections() {
        return __ServiceTypeSections;
    }

    public void setServiceTypeSections(List<PboServiceSection> value) {
        __ServiceTypeSections = value;
    }

}


