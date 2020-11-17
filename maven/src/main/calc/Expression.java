import java.util.Map;

public interface Expression {
  int evaluate(Map<String, Integer> m);
  String toString(); //(AST)
  int rank(); //(AST(Element))
}