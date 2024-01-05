package interpret.expression;

public class TerminalExpression implements Expression {

	String data;
	
	public TerminalExpression(String d) {

		this.data = d;
	}
	@Override
	public boolean interpret(String context) {
		
		if(context.contains(data)) {
			return true;
		}
		return false;
	}
	
	

}
