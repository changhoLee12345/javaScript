package com.yedam.lambda;

import java.util.function.BinaryOperator;

class Fruit {
	String name;
	int price;

	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
	
}

public class OperatorMinMaxExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> bop;
		Fruit fruit;
		bop = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = bop.apply(new Fruit("A", 100), new Fruit("B", 200));
		System.out.println(fruit);
	}
}
