package getPayerStatus;

import com.google.gson.Gson;


public class StringToJsonPayerStatusSummary {

	private PayerStatusSummaryResponse[] PayerStatusSummaryResponse;

	public void convert(String jString) {
	
		Gson gToken = new Gson();
		
		PayerStatusSummaryResponse = gToken.fromJson(jString, PayerStatusSummaryResponse[].class);
		
	}

	public PayerStatusSummaryResponse[] getPayerStatusSummaryResponse() {
		return PayerStatusSummaryResponse;
	}
}
