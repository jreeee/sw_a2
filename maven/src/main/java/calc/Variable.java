package calc;

public class Variable extends Unary{

  String var;

  public Variable(String v){
      this.var = v;
  }
  
  public int rank() {
    return 0;
  }
}
