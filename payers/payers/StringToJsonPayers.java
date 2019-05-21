package payers;

import com.google.gson.Gson;

public class StringToJsonPayers {
	private PayersResponse[] payersResponse;
	
	public void convert(String jString) {
		Gson gPayer = new Gson();
		
		
		 payersResponse = gPayer.fromJson(jString, PayersResponse[].class);
		

		
	}
	
	public PayersResponse[] getPayersResponse() {
		return payersResponse;
	}
	
	public String getPayerCode(String Name) {
		for(int i = 0 ; i < payersResponse.length; i++) {
			if(Name.equalsIgnoreCase(payersResponse[i].getPayerName())) {
				return "Payer Name: "+ Name + ", Payer Code: " + payersResponse[i].getPayerCode();
			}
			
		}
		return "Payer Not Found";
	}

}
