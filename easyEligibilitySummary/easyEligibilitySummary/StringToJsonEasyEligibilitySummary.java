package easyEligibilitySummary;

import com.google.gson.Gson;



public class StringToJsonEasyEligibilitySummary {
	
	private EEligSummaryResponse EEligSummaryResponse = new EEligSummaryResponse();

	public void convert(String jString) {
	
		Gson gToken = new Gson();
		
		EEligSummaryResponse = gToken.fromJson(jString, EEligSummaryResponse.class);
		
	}

	public EEligSummaryResponse getEEligSummaryResponse() {
		return EEligSummaryResponse;
	}

}
