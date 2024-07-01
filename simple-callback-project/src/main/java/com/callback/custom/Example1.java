package com.callback.custom;

import com.callback.custom.evaluator.NumbersEvaluator;
import com.callback.custom.expression.AddExpressionEvaluator;
import com.callback.custom.expression.ExpressionEvaluator;
import com.callback.custom.printer.DecoratedValuePrinter;
import com.callback.custom.printer.StandardValuePrinter;
import com.callback.custom.printer.ValuePrinter;

public class Example1 {

	public static void main(String[] args) {
		new Example1().run();
	}

	private void run() {

		// ExpressionEvaluator expressionEvaluator = new AddExpressionEvaluator();
		// ExpressionEvaluator expressionEvaluator = new DecoratedValuePrinter();
		ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator() {

			@Override
			public int evaluate(int a, int b) {
				return a * b;
			}
		};

		ValuePrinter valuePrinter = new StandardValuePrinter();
		// ValuePrinter valuePrinter = new DecoratedValuePrinter();

		NumbersEvaluator numberEvaluator = new NumbersEvaluator();
		numberEvaluator.evaluate(4, expressionEvaluator, valuePrinter);
	}

}
