package studio7;

public class shapesaintfun {

	public static void main(String[] args) {
	/*	rectangle r = new rectangle(4, 3);
		rectangle r2 = new rectangle(2,2);
		System.out.println(r2.perimeter());
		System.out.println(r.area());
		System.out.println(r.isBigger(r2)); */
		die d=new die(4);
		System.out.println(d.roll());
		fraction f = new fraction(1,2);
		fraction f2 = new fraction(2,3);
		System.out.println(f.adds(f2));
	}
}
class fraction{
	private int numerator;
	private int denominator;

	public fraction(int iniNumerator, int iniDenominator) {
		numerator= iniNumerator;
		denominator=iniDenominator;
		
	}
	public int getNum() {
		return numerator;
	}
	public int getDenom() {
		return denominator;
	}
	public String adds(fraction f) {
		if(denominator == f.getDenom())
		{
			return numerator + f.getNum() + "/" + denominator;
		}
		int denomSum = denominator*f.getDenom();
		int num1 = numerator*f.getDenom();
		int num2 = f.getNum()*denominator;
		return num1 + num2 + "/" + denomSum;
	}
	
	
	
	
}
class rectangle {
	private int width;
	private int length;
	public rectangle(int initWidth, int initLength) {
		width = initWidth;
		length = initLength; 
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public int perimeter() {
		return (2*length) + (2*width);
	}
	public int area() {
		return length*width;
	}
	public boolean isSquare() {
		if(length == width) {
			return true;
		} return false;
	}
	public boolean isBigger(rectangle r) {
		if(area() > r.area()) {
			return true;
		} return false;
	}
	
}

class die {
	private int n;
	public die(int initN) {
		n = initN;
	}
	public int roll() {
		return (int)(Math.random()*n)+1;
	}
}
