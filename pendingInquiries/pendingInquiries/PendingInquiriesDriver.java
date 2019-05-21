package pendingInquiries;

import java.io.IOException;



public class PendingInquiriesDriver {
	public static final String TOKEN = ""; //Do not include the phrase 'bearer' here, simply paste the token received from running the tokens driver
	public static final String URL = "https://api.pverify.com/Test/API/GetPendingInquiries?DOS=MM-DD-YYYY"; //Add date of service here // Trial URL
	//public static final String URL = "https://api.pverify.com/API/GetPendingInquiries?DOS=MM-DD-YYYY"; //Add date of service here //Real URL
	
	public static void main(String[] args) throws IOException{
	GetPendingInquiries inquiries = new GetPendingInquiries();
	inquiries.setJson(URL, TOKEN);
	PendingInquiriesResponse[] response = inquiries.getJson().getPendingResponse();
	if(response.length > 0) {
for(PendingInquiriesResponse pending : response) {
	System.out.println("Status: " + pending.getStatus());
	System.out.println("TransactionID: " + pending.getTransactionId());
	System.out.println("MemberID: " + pending.getMemberId());
	System.out.println("Patient First Name: " + pending.getPatientFirstName());
	System.out.println("Patient Last Name: " + pending.getPatientLastName());
	System.out.println("PatientDOB: " + pending.getPatientDOB());
	System.out.println("Provider Last Name: " + pending.getProviderLastName());
	System.out.println("IsDependentVerification: " + pending.getIsDependentVerification());
	System.out.println("DOS_StartDate: " + pending.getDOS_StartDate());
	
}
}else {
	System.out.println("No Pending Inquiries Found");
}



	
	}

}
