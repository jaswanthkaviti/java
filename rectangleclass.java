package com.jaswanth;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		
		Rectangle[] rectangles = new Rectangle[3];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0 ; i < rectangles.length ; i++) {
			System.out.println("do you want to enter width and height ?(y/n) ");
			char choice = input.next().charAt(0);//(y/n)
			if(choice == 'y') {
				rectangles[i] = new Rectangle(input.nextDouble() , input.nextDouble());
			}
			else {
				rectangles[i] = new Rectangle();
			}
			
		}
		System.out.println("the rectangles are:");
		
		for(int i=0 ; i< rectangles.length ; i++) {
			
			System.out.println("Rectangle " + (i+1) + ": width: " + rectangles[i].getWidth() + ", height: " +rectangles[i].getHeight());
			
		}
					
	}
	}

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() {
		
		this(1.0,1.0);
	}

	public Rectangle(double width, double height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
		
	}
	public double getArea(){
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2 * (this.width + this.height);
		
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
