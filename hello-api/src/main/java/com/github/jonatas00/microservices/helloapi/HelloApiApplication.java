package com.github.jonatas00.microservices.helloapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloApiApplication {
  public static void main(String[] args) {
    SpringApplication.run(HelloApiApplication.class, args);
  }
}

@RestController
@RequestMapping("hello")
class HelloController {
  @GetMapping
  public String hello() {
    return "Hello, World!";
  }
}