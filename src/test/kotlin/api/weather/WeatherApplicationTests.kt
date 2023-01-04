package api.weather

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

@SpringBootTest
class WeatherApplicationTests {

	@Test
	fun contextLoads() {
	}

	// ao chamar o método de clima passando uma localização
	// devo retornar o status code 501
	@Test
	fun weatherTest(location: String): Boolean {
		val status = ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
		val weather = WeatherController().sky(location)
		return status == weather
	}

	// ao chamar o método de health
	// devo retornar o status code 200
	@Test
	fun health(): Boolean {
		val status = ResponseEntity.status(HttpStatus.OK)
		val health = HealthController().health()
		return status == health
	}

}
