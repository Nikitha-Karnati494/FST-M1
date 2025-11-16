package examples;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecificationGit {
	
	RequestSpecification reqSpec;
	ResponseSpecification resSpec;
	String sshkey="ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIF002a0q7O/bdc+bxNp2Qid0bQ6xMtaGJv+npio07oYC";
	static int keyId;
	
	@BeforeClass
	public void setUp() {
		reqSpec = new RequestSpecBuilder().
				setBaseUri("https://api.github.com").
				addHeader("Authorization", "Bearer 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").
				addHeader("Content-Type","application/json").
				build();
		
		resSpec = new ResponseSpecBuilder().
				expectBody("title",Matchers.equalTo("TestKey")).
				expectResponseTime(Matchers.lessThanOrEqualTo(5000L)).
				expectBody("key", Matchers.equalTo(sshkey)).
				build();
	}
	
	@Test(priority=1)
	public void postRequestGit() {
		Map<String, String> reqBody = new HashMap<>(); 
		reqBody.put("title","TestKey");
		reqBody.put("key", sshkey);
		
		Response response = 
			given().
			spec(reqSpec).body(reqBody).
			log().all().
			when().
			post("/user/keys");
		
		response.prettyPrint();
		
		keyId = response.then().extract().path("id");
		System.out.println("key id is: "+keyId);
		response.then().statusCode(201).spec(resSpec);
	}
	
	@Test(priority=2)
	public void GetRequestGit() {
		given().spec(reqSpec).pathParam("keyId",keyId).
		when().get("/user/keys/{keyId}").
		then().statusCode(200).spec(resSpec);
	}
	
	@Test(priority=3)
	public void DeleteRequestGit() {
		given().spec(reqSpec).pathParam("keyId", keyId).
		when().delete("/user/keys/{keyId}").
		then().statusCode(204).time(Matchers.lessThanOrEqualTo(3000L));
	}

}
