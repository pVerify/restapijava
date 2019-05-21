package getEligibility;

import com.google.gson.Gson;

import cancelTransaction.CancelResponse;

public class StringToJsonGetEligibility {

private GetEligibilityResponse getEligibilityResponse;
	
	public void convert(String jString) {
		Gson gElig = new Gson();
		
		
		 getEligibilityResponse = gElig.fromJson(jString, GetEligibilityResponse.class);
		

		
	}
	
	public GetEligibilityResponse getEligibilityResponse() {
		return getEligibilityResponse;
	}
	
}
