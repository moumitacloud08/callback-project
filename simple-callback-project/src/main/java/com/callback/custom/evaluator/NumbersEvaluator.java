package com.callback.custom.evaluator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.callback.custom.ds.Pair;
import com.callback.custom.expression.ExpressionEvaluator;
import com.callback.custom.printer.ValuePrinter;

public class NumbersEvaluator {

	public void evaluate (int n , ExpressionEvaluator expressionEvaluator, ValuePrinter valuePrinter){
		List<Pair> numberPairs = generatePair(n);

		for (Pair numberPair: numberPairs){
			valuePrinter.print(
					expressionEvaluator.evaluate(numberPair.getA(),numberPair.getB())
			);
		}
	}
	
	private List<Pair> generatePair(int n){
		return IntStream.range(1, n+1).mapToObj(i -> new Pair(i, 2*i)).collect(Collectors.toList());
		
	}

}
