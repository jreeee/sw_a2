package calc;

import java.util.Map;

public class Multiplication extends Binary{
 
  public Multiplication(Expression lhs, Expression rhs) {
    super(rhs, lhs);
  }
  public int evaluate(Map<String, Integer> m) {
    return r.evaluate(m) * l.evaluate(m)  ;
  }
  public String toString() {
    return " * ";
  }
  public int rank() {
    return 2;
  }
}
