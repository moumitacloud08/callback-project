"# callback-project" 

 Callback:- Class that implement interface. 
 expressionEvaluator(object of AddExpressionEvaluator) 
 valuePrinter(object of StandardValuePrinter)
 expressionEvaluator and valuePrinter are passed as arguments to evaluate
 
ExpressionEvaluator expressionEvaluator = new AddExpressionEvaluator();
//ExpressionEvaluator expressionEvaluator = new DecoratedValuePrinter();

ValuePrinter valuePrinter = new StandardValuePrinter();
// ValuePrinter valuePrinter = new DecoratedValuePrinter();

callback:- Anonymous class
ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator() {

			@Override
			public int evaluate(int a, int b) {
				return a * b;
			}
		};
