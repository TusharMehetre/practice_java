package com.example.string.and.enums;

public class Window {
	
	int height,width; //data member
	CursorType cursorType; //enum Type
	WindowColor windowColor; 
	
	enum CursorType
	{
		ARROW, HAND, TEXT, CROSSHAIR
	}
	enum WindowColor
	{
		BLACK, PINK, RED, GREEN, BLUE
	}
	
	void printDetails()
	{
		System.out.println("Height: "+height);
		System.out.println("Width: "+width);
		System.out.println("Cursor Type: "+cursorType);
		System.out.println("Window Color: "+windowColor);
		System.out.println();
	}

	public static void main(String[] args) {
		Window w1 = new Window();
		w1.height = 700;
		w1.width = 900;
		w1.cursorType = CursorType.ARROW;
		w1.windowColor = WindowColor.BLACK;
		
		Window w2 = new Window();
		w2.height = 400;
		w2.width = 600;
		w2.cursorType = CursorType.CROSSHAIR;
		w2.windowColor = WindowColor.PINK;
		
		System.out.println("Window 1 details: ");
		w1.printDetails();
		
		System.out.println("Window 2 details: ");
		w2.printDetails();
	}

}
