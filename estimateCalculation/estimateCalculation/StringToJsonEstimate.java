package estimateCalculation;

import com.google.gson.Gson;



public class StringToJsonEstimate {
private EstimateCalculationResponse estimateResponse;
	
	public void convert(String jString) {
		Gson gEstimate = new Gson();
		
		
		 estimateResponse = gEstimate.fromJson(jString, EstimateCalculationResponse.class);
		

		
	}
	
	public EstimateCalculationResponse getEstimateCalculation() {
		return estimateResponse;
	}
}
