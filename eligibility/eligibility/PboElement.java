//
// Translated by CS2J (http://www.cs2j.com): 2/8/2019 10:28:57 AM
//

package eligibility;

import java.util.List;

import eligibility.PboElement;

public class PboElement   
{
    private String __Key;
    public String getKey() {
        return __Key;
    }

    public void setKey(String value) {
        __Key = value;
    }

    private String __Value;
    public String getValue() {
        return __Value;
    }

    public void setValue(String value) {
        __Value = value;
    }

    private List<String> __Message;
    public List<String> getMessage() {
        return __Message;
    }

    public void setMessage(List<String> value) {
        __Message = value;
    }

    private List<PboElement> __OtherInfo;
    public List<PboElement> getOtherInfo() {
        return __OtherInfo;
    }

    public void setOtherInfo(List<PboElement> value) {
        __OtherInfo = value;
    }

}


