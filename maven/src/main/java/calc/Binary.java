package calc;

public abstract class Binary implements Expression {
  
  Expression l,r;

  public Binary (Expression rhs, Expression lhs) {
  this.l = rhs;
  this.r = lhs; 
  }
  // public String toString() {
  //   if (l instanceof Associative && (r.rank() < l.rank())) {
  //     return r.toString() + l.toString();
  //   }
  //   else {
  //     return  "(" + r.toString() + ")" + l.toString();
  //   }
  // }
  //Klammerung geht irgendwie noch nicht
}
