package kg.edu.alatoo.test12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test12Application {

	public static void main(String[] args) {
		SpringApplication.run(Test12Application.class, args);
	}

	@GetMapping("/")

	public String index(){
		return "Hello world! ";
	}
}
