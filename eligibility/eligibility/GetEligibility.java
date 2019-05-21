package eligibility;
import java.io.IOException;



import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class GetEligibility {
	
private OkHttpClient client = new OkHttpClient();
private MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
private RequestBody body = RequestBody.create(mediaType, "username=pverify_demo&password=pverify%40949&grant_type=password");
private String gEligibility;
private StringToJsonEligibility json = new StringToJsonEligibility();

public void setJson(String url, String urlCode, String token ) throws IOException{
Request request = new Request.Builder()
  .url(url.concat(urlCode))
  .get()
  .addHeader("content-type", "application/json")
  .addHeader("authorization", "Bearer " + token)
  .addHeader("client-user-name", "pverify_demo")
  .addHeader("client-password", "pverify@949")
  .addHeader("cache-control", "no-cache")
  .addHeader("postman-token", "3a1204a9-ad9f-a6f1-3218-2a03e407b099")
  .build();
	
	try(Response response = client.newCall(request).execute()){
		gEligibility = response.body().string();
		json.convert(gEligibility);
		
	}

}

public StringToJsonEligibility getJson() {
	return json;
}




}
