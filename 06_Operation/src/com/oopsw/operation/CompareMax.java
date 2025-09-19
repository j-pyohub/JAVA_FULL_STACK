package com.oopsw.operation;

public class CompareMax {
	int number1;
	int number2;
	int max;
	
	
	
	public CompareMax(int number1, int number2){
		if (number1 > number2){
			max = number1;
			System.out.println(max);
		} else if(number1 <number2){
			max = number2;
			System.out.println(max);
		} else
			System.out.println("두 값이 같아 최대값을 구할 수 없습니다.");
		}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	
	}

