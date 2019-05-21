package VerifyEligibility;

import com.google.gson.Gson;



public class StringToJsonVerifyEligibility {
private VerifyEligibilityResponse verifyResponse;
	
	public void convert(String jString) {
		Gson gEstimate = new Gson();
		
		
		verifyResponse = gEstimate.fromJson(jString, VerifyEligibilityResponse.class);
		

		
	}
	
	public VerifyEligibilityResponse getVerifyEligibility() {
		return verifyResponse;
	}


}
