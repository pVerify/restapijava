package estimateCalculation;


import java.io.IOException;


import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class EstimateCalculation {
	OkHttpClient client = new OkHttpClient();

	MediaType mediaType = MediaType.parse("application/json");
	RequestBody body = RequestBody.create(mediaType, "{\r\n \"zipCode\": \"27713\",\r\n    \"cptCodes\":[\"10061\",\"0191T\", \"33300\"],\r\n    \"coPay\":\"20\",\r\n    \"coinsPercentage\":\"30\",\r\n    \"deductibleRemaining\":\"40\",\r\n    \"outofPocketRemaining\": \"\",\r\n    \"isCopayIncludeInDeductible\":false,\r\n    \"isSecondryStatusActive\":false\r\n}");

	private String estimate;
	private StringToJsonEstimate json = new StringToJsonEstimate();
	
	
public void setJson(String url, String token) throws IOException {
	Request request = new Request.Builder()
			  .url(url)
			  .post(body)
			  .addHeader("authorization", "Bearer " + token)
			  .addHeader("content-type", "application/json")
			 
			  .addHeader("client-user-name", "XXX") // Test credentials unavailable for EstimateCalculation
			  .addHeader("client-password", "XXX")
			  
			  .addHeader("cache-control", "no-cache")
			  .addHeader("postman-token", "44118627-b0e2-1193-a902-2e81d23a200b")
			  .build();
	try(Response response = client.newCall(request).execute()){
		System.out.println(response.toString());
		estimate = response.body().string();
		json.convert(estimate);
		
		
	}
	
	
	
}


public StringToJsonEstimate getJson() {
	return json;

}
}
