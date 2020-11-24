package calc;

import java.util.Map;

public abstract class Binary implements Expression {
  
  Expression l,r;
  
  public Binary () {
    //idk
  }

  public Binary (Expression rhs, Expression lhs) {
  this.l = rhs;
  this.r = lhs; 
  }

  // public int evaluate(Expression lhs, Expression rhs) {
  //   l.evaluate(lhs) + r.evaluate(rhs);
  // }
  

}
