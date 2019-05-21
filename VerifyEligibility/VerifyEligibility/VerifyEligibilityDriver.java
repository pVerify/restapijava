package VerifyEligibility;

import java.io.IOException;

public class VerifyEligibilityDriver {
		
	public static final String URL = "https://api.pverify.com/api/EasyEligibility"; 	
	
	public static void main(String[] args) throws IOException{
	VerifyEligibility verify = new VerifyEligibility();
	verify.setJson(URL);
	VerifyEligibilityResponse response = verify.getJson().getVerifyEligibility();

	System.out.println(response.toString());
	
	}

}
