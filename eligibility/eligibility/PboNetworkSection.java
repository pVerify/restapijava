//
// Translated by CS2J (http://www.cs2j.com): 2/8/2019 10:28:57 AM
//

package eligibility;


import java.util.List;

import eligibility.PboElement;

public class PboNetworkSection   
{
    private String __Identifier;
    public String getIdentifier() {
        return __Identifier;
    }

    public void setIdentifier(String value) {
        __Identifier = value;
    }

    private String __Label;
    public String getLabel() {
        return __Label;
    }

    public void setLabel(String value) {
        __Label = value;
    }

    private List<PboElement> __InNetworkParameters;
    public List<PboElement> getInNetworkParameters() {
        return __InNetworkParameters;
    }

    public void setInNetworkParameters(List<PboElement> value) {
        __InNetworkParameters = value;
    }

    private List<PboElement> __OutNetworkParameters;
    public List<PboElement> getOutNetworkParameters() {
        return __OutNetworkParameters;
    }

    public void setOutNetworkParameters(List<PboElement> value) {
        __OutNetworkParameters = value;
    }

}


