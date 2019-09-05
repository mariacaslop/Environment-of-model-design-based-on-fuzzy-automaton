package es.ucm.modelling.fuzzyautomaton.validation.tool;

import java.util.Collection;
import java.util.List;

public class ExpressionValidation {
	
	
	  Scope scope;
	  Expression expr;
	  
	  public ExpressionValidation() throws ParseException{
		  
		  scope = new Scope();
		   
	  }
	  
	  public String valExpression(String expression) throws ParseException {
		 
		 String errorMsg=""; 
		  
		 try {
			 expr = Parser.parse(expression, scope); 
		 }
		 
		 catch (ParseException e) {
			 errorMsg= e.getMessage();
		    }

		 return errorMsg;
	  }
	  
	  public void setVariable(String variable) {
		  
		  Variable a = scope.create(variable);

	  }
	  
     
}
