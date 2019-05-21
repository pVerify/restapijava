package getEligibility;

import java.io.IOException;

import eligibilitySummary.EligibilitySummary;
import eligibilitySummary.EligibilitySummaryResponse;

public class GetEligibilityDriver {

	public static final String TOKEN = "";
	public static final String URL = "https://api.pverify.com/API/GetEligibility/Status/4857601"; 

public static void main(String[] args) throws IOException{
	GetEligibility summary = new GetEligibility();
	summary.setJson(URL, TOKEN);
	GetEligibilityResponse response = summary.getJson().getEligibilityResponse();

	System.out.println(response.toString());


	
	}	

}
