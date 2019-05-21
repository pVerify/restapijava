package eligibility;
import java.io.IOException;
public class EligibilityInquiryDriver {

	public static final String URL = "https://api.pverify.com/Test/API/EligibilityInquiry"; //Trial URL
	//public static final String URL = "https://www.pverify.net/API/EligibilityInquiry"; //Real URL
	
	
	public static final String TOKEN = "yinWJMUwdgJCbXAYGHzX0XLhaeuwuIQncO4l_ARuWrvlImN9VOVxjnZDIp9B_7BfMdesXVilFo_LpMvZGOlq3-mYP2fbv89Ghcy1g-eQjqlWV3bhAGdtYewqtU4sPYHJ4aI2RgB3J5uVr73X97nwbHMacJg7gTmXnBtjj6i2bhMTlO5yMDriGwhv10SLVjMdkAHYjP9pSp2mkTle_qcSu-v9Pof4FVVaSOYzEg-Q0RM"; //Insert token here, do not include the phrase 'Bearer'
	
	
	public static void main(String[] args) throws IOException {
	
		EligibilityInquiry eligibilityInquiry = new EligibilityInquiry();
		eligibilityInquiry.setJson(URL, TOKEN);
		PboEligibilityResponse response = eligibilityInquiry.getJson().getEligibilityResponse();
		System.out.println(response.getPayerName());
		System.out.println(response.getDemographicInfo().getSubscriber().getCommunicationNumber());
		//System.out.println(response.getIsHMOPlan());
		System.out.println(response);
		
		
		

	}

}
