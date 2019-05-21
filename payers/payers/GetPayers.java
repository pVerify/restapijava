package payers;
import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class GetPayers {
	OkHttpClient client = new OkHttpClient();
	MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
	RequestBody body = RequestBody.create(mediaType, "username=pverify_demo&password=pverify%40949&grant_type=password");
	private String payer;
	private StringToJsonPayers json = new StringToJsonPayers();
	
	
public void setJson(String url, String token) throws IOException {
	Request request = new Request.Builder()
	  .url(url)
	  .get()
	  .addHeader("content-type", "application/json")
	  .addHeader("authorization", "Bearer " + token)
	  .addHeader("client-user-name", "pverify_demo")
	  .addHeader("client-password", "pverify@949")
	  .addHeader("cache-control", "no-cache")
	  .addHeader("postman-token", "fa82e2d5-4acc-df1f-bccb-6838df4e0704")
	  .build();
	try(Response response = client.newCall(request).execute()){
		payer = response.body().string();
		json.convert(payer);
		
		
	}
	
}

public StringToJsonPayers getJson() {
	return json;
}

}
