package interpret.expression;

public class OrExpression implements Expression {

	Expression expr1 = null;
	Expression expr2 = null;
	
	public OrExpression(Expression expr1, Expression expr2) {
		
		this.expr1 = expr1;
		this.expr2 =expr2;
	}

	@Override
	public boolean interpret(String context) {
		
		return expr1.interpret(context) || expr2.interpret(context);
	}
	
	

}
