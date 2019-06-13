package easyEligibilitySummary;

import java.io.IOException;


import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class EEligSummary {
	
	
	
	OkHttpClient client = new OkHttpClient();
	MediaType mediaType = MediaType.parse("application/json");
	RequestBody body = RequestBody.create(mediaType, "{\r\n      \"payerCode\": \"00001\",\r\n      \"payerName\": \"Aetna\",\r\n    \r\n        \"Provider_LastName\": \"[lastname]\",\r\n        \"Provider_NPI\": \"[providernpi]\",\r\n\r\n        \"Patient_First\": \"[firstname]\",\r\n        \"Patient_DOB\": \"[DOB]\",\r\n        \"Patient_Last\": \"[lastname]\",\r\n        \"memberID\": \"[memberid]\",\r\n   \r\n         \"Date_Of_Service\": \"06/11/2019\",\r\n         \"ServiceCodes\": \"30\",\r\n    \r\n       \r\n        \"referenceId\":\"\",\r\n        \"Location\":\"\",\r\n        \r\n         \"PracticeType\":\"PhysicalTherapy\",\r\n        \"IncludeTextResponse\":true\r\n}");	
	private String eEligSummary;
	private StringToJsonEasyEligibilitySummary json = new StringToJsonEasyEligibilitySummary();

	public void setJson(String url) throws IOException{
	Request request = new Request.Builder()
	  .url(url)
	  .post(body)
	  .addHeader("Client-User-Name", "XXX")
	  .addHeader("Client-Password", "XXX")
	  .addHeader("Content-type", "application/json")
	  .build();

	try(Response response = client.newCall(request).execute();){
		eEligSummary = response.body().string();
		//System.out.println(eEligSummary);
		json.convert(eEligSummary);
	}
	}

	
	
	
	
	
	
	

	public StringToJsonEasyEligibilitySummary getJson() {
		// TODO Auto-generated method stub
		return json;
	}



}
