package eligibilitySummary;
import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class EligibilitySummary {

OkHttpClient client = new OkHttpClient();
MediaType mediaType = MediaType.parse("application/json");
RequestBody body = RequestBody.create(mediaType, "{\r\n      \"payerCode\": \"00001\",\r\n   \"provider\": {\r\n        \"firstName\": \"\",\r\n        \"middleName\": \"\",\r\n        \"lastName\": \" test name\",\r\n        \"npi\": \"[npi]\"\r\n    \r\n   },\r\n      \"subscriber\": {\r\n        \"firstName\": \"\",\r\n        \"middleName\": \"\",\r\n        \"lastName\": \"\",\r\n        \"dob\": \"\",        \r\n        \"memberID\": \"[memberID]\"\r\n    },\r\n    \"dependent\": {\r\n        \"patient\": {\r\n            \"firstName\": \"\",\r\n            \"middleName\": \"\",\r\n            \"lastName\": \"\",\r\n            \"dob\": \"06/17/1974\",\r\n            \"gender\": \"\"\r\n        },\r\n        \"relationWithSubscriber\": \"\"\r\n    },\r\n    \"isSubscriberPatient\": \"False\",\r\n    \"doS_StartDate\": \"05/08/2019\",\r\n    \"doS_EndDate\": \"05/08/2019\",\r\n    \"serviceCodes\": [\r\n        \"30\"\r\n    ],\r\n   \r\n     \"requestSource\": \"RestAPI\",\r\n\t \"PracticeType\":\"PhysicalTherapy\",\r\n     \"referenceId\":\"Pat MRN\",\r\n     \"Location\":\"Any location Name\",\r\n     \"IncludeTextResponse\":false\r\n}");
private StringToJsonEligibilitySummary json = new StringToJsonEligibilitySummary();
private String inquirySummary;


public void setJson(String url, String token) throws IOException{
Request request = new Request.Builder()
  .url(url)
  .post(body)
  .addHeader("Authorization", "Bearer " + token)
  .addHeader("Client-User-Name", "XXX")
  .addHeader("Content-Type", "application/json")
  .addHeader("User-Agent", "PostmanRuntime/7.11.0")
  .addHeader("Accept", "*/*")
  .addHeader("Host", "api.pverify.com")
  .addHeader("accept-encoding", "gzip, deflate")
  .addHeader("content-length", "933")
  .addHeader("Connection", "keep-alive")
  .addHeader("cache-control", "no-cache")
  .addHeader("Postman-Token", "637561bb-a169-4f7f-8aef-419adbd67a8b")
  .build();

try(Response response = client.newCall(request).execute();){
	inquirySummary = response.body().string();
	System.out.println(inquirySummary);
	json.convert(inquirySummary);
}
}
public StringToJsonEligibilitySummary getJson() {
	return json;
}

}

