package ru.zelenov.springcourse.service;

import org.springframework.stereotype.Component;

@Component
public interface CalcService {
  Double add(double a, double b);
  Double subtract(double a, double b);
  Double multiply(double a, double b);
  Double divide(double a, double b);

  String doAction(double a, double b, String action);
}
