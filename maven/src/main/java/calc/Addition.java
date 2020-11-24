package calc;

import java.util.Map;

public class Addition extends Binary{

  public int evaluate(Map<String, Integer> m) {
    return r.evaluate(m) + l.evaluate(m)  ;
  }
  public String toString() {
    return "hi";
  }
  public int rank() {
    return 1;
  }
}
