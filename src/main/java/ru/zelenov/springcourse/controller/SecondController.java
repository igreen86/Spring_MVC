package ru.zelenov.springcourse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
  @GetMapping("/exit")
  public ResponseEntity<String> exit() {
    return ResponseEntity.ok("No more links");
  }
}
