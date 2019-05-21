package getEligibilitySingelValueAPIKeys;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SingelValue {
	
	OkHttpClient client = new OkHttpClient();

	private String singelValue;
	private StringToJsonSingelValue json = new StringToJsonSingelValue();
	
	
public void setJson(String url, String token) throws IOException {
	Request request = new Request.Builder()
			  .url(url)
			  .get()
			  .addHeader("Authorization", "Bearer " + token)
			  .addHeader("Client-User-Name", "XXX")
			  .addHeader("Content-Type", "application/json")
			  .build();
	try(Response response = client.newCall(request).execute()){
		singelValue = response.body().string();
		json.convert(singelValue);
		
		
	}
	
}

public StringToJsonSingelValue getJson() {
	return json;

}
}
