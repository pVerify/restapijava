package cancelTransaction;

import com.google.gson.Gson;



public class StringToJsonCancel {
private CancelResponse cancelResponse;
	
	public void convert(String jString) {
		Gson gPayer = new Gson();
		
		
		 cancelResponse = gPayer.fromJson(jString, CancelResponse.class);
		

		
	}
	
	public CancelResponse getCancelResponse() {
		return cancelResponse;
	}
}
