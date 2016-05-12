package sample_0513;

public class rectangle extends shape {
	private int x1,y1;
	
	public void move(int _x, int _y){ x = x1 + _x; y= y1+_y;}
	
	public rectangle() { x1 = 5; y1=5;}
	

	public void infor() { System.out.println("C x : " +x+ " y: "+y);}
	
	
}
