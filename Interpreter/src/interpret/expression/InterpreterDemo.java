package interpret.expression;

public class InterpreterDemo {

	public InterpreterDemo() {
		// TODO Auto-generated constructor stub
	}

	// Rule: Robert and John are male
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	// Rule: Julie is a married women
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("Tim is male? " + isMale.interpret("Tim"));
		System.out.println("Julie is a married women? " + isMarriedWoman.interpret(" Julie"));
	}

}
