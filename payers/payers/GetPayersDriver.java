package payers;

import java.io.IOException;

public class GetPayersDriver {
	
	public static final String TOKEN = ""; //Do not include the phrase 'bearer' here, simply paste the token received from running TokensDriver
	public static final String URL = "https://api.pverify.com/Test/API/GetPayers"; // Trial Url
	//public static final String URL = "https://api.pverify.com/API/GetPayers"; //Real Url
	
	public static void main(String[] args) throws IOException{
	GetPayers payers = new GetPayers();
	payers.setJson(URL, TOKEN);
	PayersResponse[] response = payers.getJson().getPayersResponse();
for(PayersResponse payer : response) {
	System.out.println("Payer Name: " + payer.getPayerName() +", Payer Code:  " + payer.getPayerCode());
}

System.out.println(payers.getJson().getPayerCode("administrative services inc"));

	
	}
}
