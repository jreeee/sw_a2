package calc;

import java.util.Map;

public class Subtraction extends Binary{

  public Subtraction() {
    
  }
  public int evaluate(Map<String, Integer> m) {
     return r.evaluate(m) - l.evaluate(m)  ;
  }
  public int rank() {
    return 1;
  }
}
