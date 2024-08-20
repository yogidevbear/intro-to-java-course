package com.cbfacademy.shapes;

import java.util.ArrayList;

abstract class Shape {
  protected String name;

  abstract double getArea();
  
  public String getName() {
    return this.name;
  };
}

