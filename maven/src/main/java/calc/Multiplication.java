package calc;

import java.util.Map;

public class Multiplication extends Binary{
 
  @Override
  public int evaluate(Map<String, Integer> m) {
    return m.get() 
  }
  public String toString() {
    return " * ";
  }
  public int rank() {
    return 2;
  }
}
