package ru.zelenov.springcourse.service.impl;

import org.springframework.stereotype.Service;
import ru.zelenov.springcourse.service.CalcService;

@Service
public class CalcServiceImpl implements CalcService {
  @Override
  public Double add(double a, double b) {
    return a + b;
  }

  @Override
  public Double subtract(double a, double b) {
    return a - b;
  }

  @Override
  public Double multiply(double a, double b) {
    return a * b;
  }

  @Override
  public Double divide(double a, double b) {
    return a / b;
  }

  @Override
  public String doAction(double a, double b, String action) {
    if (action.equals("+")) {
      return String.valueOf(add(a, b));
    }
    if (action.equals("-")) {
      return String.valueOf(subtract(a, b));
    }
    if (action.equals("*")) {
      return String.valueOf(multiply(a, b));
    }
    if (action.equals("/")) {
      if (b == 0) {
        return "Division by zero is prohibited!";
      }
      return String.valueOf(divide(a, b));
    }
    return "Wrong action!";
  }
}
