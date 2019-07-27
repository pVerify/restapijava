package getPayerStatus;

import java.io.IOException;

public class GetPayerStatusDriver {

	//No token needed
	public static final String URL = "https://api.pverify.com/API/GetPayerStatus"; 

	public static void main(String[] args) throws IOException{
		GetPayerStatusSummary summary = new GetPayerStatusSummary();
		summary.setJson(URL);
		PayerStatusSummaryResponse[] responses = summary.getJson().getPayerStatusSummaryResponse();

		
		for(PayerStatusSummaryResponse response : responses) {
		System.out.println(response.toString());
		}


		
		}	

	}


