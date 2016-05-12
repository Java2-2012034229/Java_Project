package sample_0513;

public class Circle extends shape {

	private int r;
	
	public void move(int _x, int _y){
		x= _x+r; y= _y+r;
	}
	public Circle(){r=3;}
	public void iii() {System.out.println(x+" "+y);}
}
