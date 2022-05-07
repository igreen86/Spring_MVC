package ru.zelenov.springcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

import static java.util.Objects.nonNull;

@Controller
@RequestMapping("/first")
public class FirstController {

  @GetMapping("/hello_page")
  public String helloPage(HttpServletRequest request) {
    final String name = request.getParameter("name");
    final String surname = request.getParameter("surname");
    if (nonNull(name) && nonNull(surname)) {
      System.out.println(name + " " + surname);
    }
    return "first/hello";
  }

  @GetMapping("/goodbye_page")
  public String goodbyePage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {
    model.addAttribute("message", name + " " + surname);
    return "first/goodbye";
  }
}
