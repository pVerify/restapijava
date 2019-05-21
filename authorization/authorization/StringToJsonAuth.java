package authorization;
import com.google.gson.Gson;

public class StringToJsonAuth {
	private TokenResponse tokenResponse = new TokenResponse();

	public void convert(String jString) {
		Gson gToken = new Gson();
		tokenResponse = gToken.fromJson(jString, TokenResponse.class);
	}

	public TokenResponse getTokenResponse() {
		return tokenResponse;
	}
	
	

}
