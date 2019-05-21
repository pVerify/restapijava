package pendingInquiries;

import com.google.gson.Gson;



public class StringToJsonPending {
private PendingInquiriesResponse[] pendingResponse;
	
	public void convert(String jString) {
		Gson gPayer = new Gson();
		
		
		 pendingResponse = gPayer.fromJson(jString, PendingInquiriesResponse[].class);
		

		
	}
	
	public PendingInquiriesResponse[] getPendingResponse() {
		return pendingResponse;
	}
}
