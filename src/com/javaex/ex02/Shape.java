package com.javaex.ex02;

public class Shape {
	
	private String fillColor;
	private String linelColor;
	
	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}

	public Shape(String fillColor, String linelColor) {
		this.fillColor = fillColor;
		this.linelColor = linelColor;
		System.out.println("생성자 Shape(2) 실행");
	}

}

