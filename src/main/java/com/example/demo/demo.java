package main.java.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class demo {
	@RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "index2.html";
    }
	public static void main(String[] args) {
		SpringApplication.run(demo.class, args);
	}
}




