package VerifyEligibility;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class VerifyEligibility {

OkHttpClient client = new OkHttpClient();

	MediaType mediaType = MediaType.parse("application/json");
	RequestBody body = RequestBody.create(mediaType, "{\r\n\r\n    \"payerCode\": \"00001\",\r\n\r\n    \"provider_lastname\":\"Bressler\",\r\n\r\n    \"provider_npi\": \"1972583656\",\r\n\r\n     \"memberID\": \"W231754003\",\r\n\r\n     \"patient_DOB\":\"12/26/1976\",\r\n\r\n   \r\n\r\n     \"date_Of_Service\": \"08/08/2018\",\r\n\r\n     \"serviceCodes\":\"30,A8\"\r\n\r\n   \r\n\r\n}");

	private String verify;
	private StringToJsonVerifyEligibility json = new StringToJsonVerifyEligibility();
	
	
public void setJson(String url) throws IOException {

	Request request = new Request.Builder()
	  .url(url)
	  .post(body)
	  .addHeader("content-type", "application/json")
	  .addHeader("client-user-name", "XXXX") //User name from Step 1
	  .addHeader("client-password", "XXXX") // Password from Step 1
	  .addHeader("cache-control", "no-cache")
	  .addHeader("postman-token", "20c98e88-656d-3fd4-4173-c71e8892bd49")
	  .build();


	try(Response response = client.newCall(request).execute()){
		System.out.println(response.toString());
		verify = response.body().string();
		json.convert(verify);
		
		
	}
	
	
	
}


public StringToJsonVerifyEligibility getJson() {
	return json;

}


	}


