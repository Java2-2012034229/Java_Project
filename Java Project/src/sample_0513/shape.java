package sample_0513;

abstract public class shape {
	protected int x, y;
	
	public shape(){ x=0; y=0;}
	
	public shape(int _x,int _y){
		x= _x; this.y = _y;
	}
	abstract public void move(int _x, int _y);//{
	//	this.x+=_x; y+=_y;
	//}
	public void infor() { System.out.println("C x : " +x+ " y: "+y);}
	public void iii() {System.out.println(x+" "+y);}
}
