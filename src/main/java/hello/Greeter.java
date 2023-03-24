package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Greeter {

  @RequestMapping("/")
  public String sayHello() {
    return "Hello world!";
  }

  @RequestMapping("/health")
  public String healthCheck() {
    return "OK!";
  }

  @RequestMapping("/app")
  public String sayHey() {
    return "Yep!! working";
  }
}