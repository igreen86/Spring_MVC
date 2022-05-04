package ru.zelenov.springcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {

  @GetMapping("/hello_page")
  public String helloPage() {
    return "first/hello";
  }

  @GetMapping("goodbye_page")
  public String goodbyePage() {
    return "first/goodbye";
  }
}
