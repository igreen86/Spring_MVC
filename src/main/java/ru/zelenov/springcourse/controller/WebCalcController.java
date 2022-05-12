package ru.zelenov.springcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.zelenov.springcourse.model.Expression;
import ru.zelenov.springcourse.service.CalcService;

@Controller
public class WebCalcController {

  private final CalcService calcService;

  WebCalcController(CalcService calcService) {

    this.calcService = calcService;
  }

  @GetMapping("/calc")
  public String calcForm(Model model) {
    model.addAttribute("expression", new Expression());
    return "calculator/calculate";
  }

  @PostMapping("/calc")
  public String calcForm(@ModelAttribute Expression expression) {
    return "calculator/calculate";
  }

  @PostMapping("/result")
  public String calcSubmit(@ModelAttribute Expression expression, Model model) {
    model.addAttribute(expression);
    expression.setResult(calcService.doAction(expression.getA(), expression.getB(), expression.getAction()));
    return "calculator/result";
  }
}
