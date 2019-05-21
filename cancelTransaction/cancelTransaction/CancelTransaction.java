package cancelTransaction;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class CancelTransaction {
	OkHttpClient client = new OkHttpClient();

	MediaType mediaType = MediaType.parse("application/json");
	RequestBody body = RequestBody.create(mediaType, "{\r\n\t\"transactionId\":15049658\r\n}\r\n");
	private String cancel;
	private StringToJsonCancel json = new StringToJsonCancel();
	
	
public void setJson(String url, String token) throws IOException {
	Request request = new Request.Builder()
			  .url(url)
			  .post(body)
			  .addHeader("content-type", "application/json")
			  .addHeader("authorization", "Bearer " + token)
			  .addHeader("client-user-name", "pverify_demo")
			  .addHeader("client-password", "pverify@949")
			  .addHeader("cache-control", "no-cache")
			  .addHeader("postman-token", "df37198d-a6a0-c4ca-1a1f-a59b353d1d84")
			  .build();
	try(Response response = client.newCall(request).execute()){
		cancel = response.body().string();
		json.convert(cancel);
		
		
	}
	
}

public StringToJsonCancel getJson() {
	return json;

}
}
