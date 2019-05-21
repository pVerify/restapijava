package authorization;
import java.io.IOException;

//import org.json.JSONObject;

public class TokensDriver {
	public static final String URL = "https://api.pverify.com/Token";    //Real URL
//	public static final String URL = "https://api.pverify.com/Test/Token"; // Trial URL
	
	public static void main(String[] args) throws IOException {
		GetToken token = new GetToken();
		
		token.setJson(URL);
		TokenResponse response = token.getJson().getTokenResponse();
		
		System.out.println("Type: " + response.getToken_type());
		System.out.println("Token: " +response.getAccess_token());  //Use this token to make other calls
		System.out.println("Expires in: " + response.getExpires_in());
		
	}
	
	
	
	
}
