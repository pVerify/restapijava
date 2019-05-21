package getEligibilitySingelValueAPIKeys;

import java.io.IOException;

public class SingelValueDriver {


		public static final String TOKEN = "";
		public static final String URL = "https://api.pverify.com/API/GetEligibilitySingelValueAPIKeys?Dos=mm-dd-yyyy"; 

	public static void main(String[] args) throws IOException{
		SingelValue summary = new SingelValue();
		summary.setJson(URL, TOKEN);
		SingelValueResponse[] responses = summary.getJson().getSingelValueResponse();

		for(SingelValueResponse response : responses) {
		
		System.out.println(response.toString());

		}

		
		}	

	}


