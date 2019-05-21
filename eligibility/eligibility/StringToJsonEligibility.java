package eligibility;
import com.google.gson.Gson;

public class StringToJsonEligibility {
	private PboEligibilityResponse tokenResponse = new PboEligibilityResponse();

	public void convert(String jString) {
	
		Gson gToken = new Gson();
		
		tokenResponse = gToken.fromJson(jString, PboEligibilityResponse.class);
		
	}

	public PboEligibilityResponse getEligibilityResponse() {
		return tokenResponse;
	}
	
	

}
