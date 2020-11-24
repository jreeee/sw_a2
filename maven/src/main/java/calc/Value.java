package calc;

import java.util.Map;

public class Value extends Unary{

  int val;

  public Value(int v){
      this.val =v;
  }

  public int evaluate(Map<String, Integer> m) {
    return val;
  }

  public String toString() {
    return " " + val + " ";
  }
  
  public int rank() {
    return 0;
  }
}
  