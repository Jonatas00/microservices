package com.github.jonatas00.microservices.senderapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SenderApiApplication {
  public static void main(String[] args) {
    SpringApplication.run(SenderApiApplication.class, args);
  }
}

@RestController
@RequestMapping("sender")
class Sendercontroller {
  @GetMapping
  public String sender() {
    return "Sender message";
  }
}

