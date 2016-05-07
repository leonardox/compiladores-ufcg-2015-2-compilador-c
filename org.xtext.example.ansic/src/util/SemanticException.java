package util;

public class SemanticException extends IllegalArgumentException {
	
	public SemanticException(String message) {
		super("Error at " + Lexer.curLine + "\n" + message);
	}

}
