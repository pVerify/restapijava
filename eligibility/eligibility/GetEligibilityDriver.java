package eligibility;
import java.io.IOException;

public class GetEligibilityDriver {
	
	public static final String URL = "https://api.pverify.com/Test/API/GetEligibilityResponse/2428"; // Trial URL
	//public static final String URL = "https://api.pverify.com/Test/API/GetEligibilityResponse/2428"; // Real URL
	
	
	public static void main(String[] args) throws IOException {
		GetEligibility eligibility = new GetEligibility();
		eligibility.setJson(URL, "2428", "T" + 
				""); //Insert token here
		PboEligibilityResponse response = eligibility.getJson().getEligibilityResponse();
		System.out.println(response.getPayerName());
		System.out.println(response);
		System.out.println(response.getDOS());
		
	}
}
