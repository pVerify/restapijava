package getEligibilitySingelValueAPIKeys;

import com.google.gson.Gson;


public class StringToJsonSingelValue {
	

private SingelValueResponse[] singelValueResponse;
	
	public void convert(String jString) {
		Gson gElig = new Gson();
		
		
		singelValueResponse = gElig.fromJson(jString, SingelValueResponse[].class);
		

		
	}
	
	public SingelValueResponse[] getSingelValueResponse() {
		return singelValueResponse;
	}

}
