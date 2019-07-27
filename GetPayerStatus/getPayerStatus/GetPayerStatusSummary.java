package getPayerStatus;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetPayerStatusSummary {
	OkHttpClient client = new OkHttpClient();
	private String payerStatusSummary;
	private StringToJsonPayerStatusSummary json = new StringToJsonPayerStatusSummary();

	public void setJson(String url) throws IOException{
	Request request = new Request.Builder()
	  .url(url)
	  .get()
	  .build();

	try(Response response = client.newCall(request).execute()){
		payerStatusSummary = response.body().string();
		//System.out.println(eEligSummary);
		json.convert(payerStatusSummary);
	}

}
	
	
	public StringToJsonPayerStatusSummary getJson() {
		// TODO Auto-generated method stub
		return json;
	}
}
