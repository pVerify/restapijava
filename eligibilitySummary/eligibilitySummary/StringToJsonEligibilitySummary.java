package eligibilitySummary;

import com.google.gson.Gson;

public class StringToJsonEligibilitySummary {
	private EligibilitySummaryResponse EligibilitySummaryResponse = new EligibilitySummaryResponse();

	public void convert(String jString) {
	
		Gson gToken = new Gson();
		
		EligibilitySummaryResponse = gToken.fromJson(jString, EligibilitySummaryResponse.class);
		
	}

	public EligibilitySummaryResponse getEligibilitySummaryResponse() {
		return EligibilitySummaryResponse;
	}
	
}
