package estimateCalculation;

import java.io.IOException;

public class EstimateCalculationDriver {
	
	public static final String TOKEN = "3W0MFAlGvNIMl7SNgec1zYKA5aUS2uYOkzHz_OFm92YlrAC5SobIrGoyPDACh6R0avY9DHJtZk9m5J5t3d37IPadBM4sI0o2rkXr8oRxrsdG3Q-ilWdxPvtQbENbrswznkLC-yTFif9_7LcSNQszLxljP1yeCMNDEUxcKP0oLzOPV_nr7LIiU-eYjuP21Q4xcTAKbGpBAk8ibSrINTKBDWgHw_NHvVreyy9en1Z-ECU"; // Do not include the phrase 'bearer' here, simply paste the token string
	public static final String URL = "https://api.pverify.com/api/EstimateCalculation"; // Real URL (trial api unavailable for EstimateCalculation)
	
	
	public static void main(String[] args) throws IOException{
	EstimateCalculation estimate = new EstimateCalculation();
	estimate.setJson(URL, TOKEN);
	EstimateCalculationResponse response = estimate.getJson().getEstimateCalculation();
	

	System.out.println(response.toString());
	
	}

}
