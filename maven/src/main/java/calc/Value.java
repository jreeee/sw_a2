package calc;

public class Value extends Unary{

  int val;

  public Value(int v){
      this.val =v;
  }
  
  public int rank() {
    return 0;
  }
}
  