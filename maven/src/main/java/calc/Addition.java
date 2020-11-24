package calc;

import java.util.Map;

public class Addition extends Binary implements Associative {

  public Addition(Expression lhs, Expression rhs) {
    super(rhs, lhs);
  }
  public int evaluate(Map<String, Integer> m) {
    return r.evaluate(m) + l.evaluate(m)  ;
  }
  public String toString() {
    return r.toString() + "+" + l.toString();
  }
  public int rank() {
    return 1;
  }
}
