package FirstGradleWithSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class HelloGradleController {
	@GetMapping("/Hello")
    public String helloGradle() {
        return "Hello Gradle!";
    }
	@GetMapping("/anotherHello")
    public String sayHello() {
        return "Hello World!";
    }
}
