package com.javaex.ex02;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	
	public Triangle() {
		System.out.println("생성자 Triangle(0) 실행");
	}


	public Triangle(int width, int height) {
		super("검정","검정");
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(2) 실행");
	}
	
	public Triangle(String fillColor,String linelColor, int width, int height) {
		super(fillColor,linelColor);
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(4) 실행");
	}
	
}


