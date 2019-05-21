package eligibilitySummary;

import java.io.IOException;



public class getEligibilitySummaryDriver {
	public static final String TOKEN = "";
	public static final String URL = "https://api.pverify.com/API/EligibilitySummary"; 

public static void main(String[] args) throws IOException{
	EligibilitySummary summary = new EligibilitySummary();
	summary.setJson(URL, TOKEN);
	EligibilitySummaryResponse response = summary.getJson().getEligibilitySummaryResponse();

	System.out.println("Summary: " + response.toString());


	
	}

}
