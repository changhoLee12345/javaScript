package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

class IntBinaryClass implements IntBinaryOperator {
	@Override
	public int applyAsInt(int left, int right) {
		if (left >= right) {
			return left;
		} else {
			return right;
		}
	}
}

public class OperatorExample {
	static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];
		for (Integer score : scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		IntBinaryClass iclass = new IntBinaryClass();
		int result = maxOrMin(iclass);

		result = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				if (left >= right) {
					return right;
				} else {
					return left;
				}
			}
		});
		result = maxOrMin((left, right) -> {
			if (left >= right) {
				return right;
			} else {
				return left;
			}
		});
		System.out.println("결과: " + result);
	}
}
