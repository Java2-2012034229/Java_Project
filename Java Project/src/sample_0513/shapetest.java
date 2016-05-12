package sample_0513;

public class shapetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//shape s1 = new shape();
		rectangle r1 = new rectangle();
		Circle c1 = new Circle();
		
		//s1.move(99,99);
		r1.move(111, 111);
		c1.move(999, 999);
		info(r1);
		info(c1);
		
	}
	static void info(shape ro){ro.infor(); ro.iii();}//shape ro 는 circle에 r을 볼수없음.
	static void info(rectangle r) {r.infor();}
	static void info(Circle c){c.infor();}

}
