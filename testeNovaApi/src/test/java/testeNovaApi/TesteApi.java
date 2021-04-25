package testeNovaApi;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;



public class TesteApi {
	
	@Test
	public void cadastro() {
		String url = "https://postman-echo.com/post";
		String corpo = "{\"method\": \"POST\"}";
		
		//Given (Dado que) = CONDIÇÃO
		given().contentType("TEXT").body(corpo).
		//When (Quando) = AÇÃO
		when().post(url).
		//Then (Então) = RESULTADO
		then().statusCode(200);
		
		
	}
	

}
