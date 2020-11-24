package calc;

import java.util.Map;

public class Variable extends Unary{

  String var;

  public Variable(String v){
      this.var = v;
  }

  public int evaluate(Map<String, Integer> m) {
    return m.get(var);
  }

  public String toString() {
    return " " + var + " ";
  }

  public int rank() {
    return 0;
  }
}
