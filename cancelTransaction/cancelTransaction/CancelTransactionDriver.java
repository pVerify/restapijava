package cancelTransaction;

import java.io.IOException;


public class CancelTransactionDriver {
	public static final String TOKEN = " "; //Do not include Bearer here, simply paste the token string
	
	public static final String URL = "https://api.pverify.com/Test/API/CancelTransaction"; //Url for trial purposes
	//public static final String URL = "https://api.pverify.com/API/CancelTransaction"; // Official Url
	
	public static void main(String[] args) throws IOException{
	CancelTransaction cancel = new CancelTransaction();
	cancel.setJson(URL, TOKEN);
	CancelResponse response = cancel.getJson().getCancelResponse();
	

	System.out.println("Is Canceled: " + response.getIsCancelled());
	System.out.println("Status: " + response.getCurrentStatus());
	System.out.println("Message: " + response.getMessage());

	}
}
