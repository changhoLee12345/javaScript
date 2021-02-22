package com.yedam.operators;

public class BitOperatorExample {
	public static void main(String[] args) {
		int v1 = 45;
		int v2 = 25;

		int result = v1 ^ v2;
		result = -8 >>> 3;
		System.out.println(result);

		int value = 457;
		value = value / 100 * 100;
		System.out.println(value);

		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) / 2.0 * height;
		System.out.println("area: " + area);
		System.out.println("areaRect: " + getAreaRect(lengthTop, lengthBottom, height));

		int x = 10;
		int y = 5;
		System.out.println((x > 7) && (y <= 5));
		System.out.println((x % 3 == 2 || (y % 2 != 1)));

		if (x++ % 2 == 0 || y++ % 3 == 0) {
			System.out.println("true, " + x + ", " + y);
		} else {
			System.out.println("false, " + x + ", " + y);
		}

		double d1 = 5.0;
		double d2 = 0.0;

		double z = d1 / d2;
//		if (Double.isNaN(z)) {
		if (Double.isInfinite(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double resut = z + 10;
			System.out.println("결과: " + resut);
		}
	}

	public static double getAreaRect(int top, int bottom, int height) {
		double area = (double) (top + bottom) / 2 * height;
		return area;
	}
}
