package ru.zelenov.springcourse.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Expression {
  private double a;
  private double b;
  private String action;
  private String result;
}
