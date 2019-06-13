package easyEligibilitySummary;

import java.io.IOException;



public class easyEligibilitySummaryDriver {
	

	public static final String URL = "https://api.pverify.com/API/EasyEligibilitySummary"; 

public static void main(String[] args) throws IOException{
	EEligSummary summary = new EEligSummary();
	summary.setJson(URL);
	EEligSummaryResponse response = summary.getJson().getEEligSummaryResponse();

	System.out.println("Summary: " + response.toString());

	
	}

}
