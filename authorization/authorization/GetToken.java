package authorization;
import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class GetToken {

	private OkHttpClient client = new OkHttpClient();
	private MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
	
	private RequestBody body = RequestBody.create(mediaType,
			"username=<name>&password=<pw>&grant_type=password");
	private StringToJsonAuth json = new StringToJsonAuth();
	private String token;

	public void setJson(String url) throws IOException {
		Request request = new Request.Builder().url(url).post(body)
				.addHeader("content-type", "application/x-www-form-urlencoded").addHeader("cache-control", "no-cache")
				.addHeader("postman-token", "a8b54837-13aa-29db-47ea-793130984de5").build();
		try (Response response = client.newCall(request).execute()) {
			token = response.body().string();
			json.convert(token);

		}
	}

	public StringToJsonAuth getJson() {
		return json;
	}

	
}
