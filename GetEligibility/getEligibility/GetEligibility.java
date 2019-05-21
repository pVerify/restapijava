package getEligibility;

import java.io.IOException;

import cancelTransaction.StringToJsonCancel;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class GetEligibility {
	
	
	OkHttpClient client = new OkHttpClient();

	private String getEligibility;
	private StringToJsonGetEligibility json = new StringToJsonGetEligibility();
	
	
public void setJson(String url, String token) throws IOException {
	Request request = new Request.Builder()
			  .url(url)
			  .get()
			  .addHeader("Authorization", "Bearer " + token)
			  .addHeader("Client-User-Name", "")
			  .build();
	try(Response response = client.newCall(request).execute()){
		getEligibility = response.body().string();
		json.convert(getEligibility);
		
		
	}
	
}

public StringToJsonGetEligibility getJson() {
	return json;

}

}
