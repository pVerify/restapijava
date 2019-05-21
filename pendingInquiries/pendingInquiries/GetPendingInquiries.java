package pendingInquiries;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class GetPendingInquiries {
	OkHttpClient client = new OkHttpClient();

	MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
	RequestBody body = RequestBody.create(mediaType, "username=pverify_demo&password=pverify%40949&grant_type=password");
	private String pending;
	private StringToJsonPending json = new StringToJsonPending();
	
	
public void setJson(String url, String token) throws IOException {
	Request request = new Request.Builder()
			  .url(url)
			  .get()
			  .addHeader("content-type", "application/x-www-form-urlencoded")
			  .addHeader("authorization", "Bearer " + token)
			  .addHeader("client-user-name", "XXX")
			  .addHeader("client-password", "XXX")
			  .addHeader("cache-control", "no-cache")
			  .addHeader("postman-token", "aab548a9-152b-59ce-20b1-ad3b435a2565")
			  .build();
	try(Response response = client.newCall(request).execute()){
		pending = response.body().string();
		json.convert(pending);
		
		
	}
	
}

public StringToJsonPending getJson() {
	return json;
}

}
