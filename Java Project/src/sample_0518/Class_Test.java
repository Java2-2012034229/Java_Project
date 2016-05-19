package sample_0518;

public class Class_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//P_object[] pob = new P_object[3];
		P_object[] pob=new P_object[3];
		
		pob[0] = new P_object();
		pob[1] = new C1_object();
		pob[2] = new C2_object();
		pr_all(pob[0]); pr_all(pob[1]);pr_all(pob[2]);
		
		/*for(P_object temp : pob){
			temp = new P_object();
			pr_all(temp);
			
		}
		change_all(pob[1],7,77);
		pr_all(pob[1]);

		
	}
*/}
	public static void pr_all(P_object temp){temp.pr();}
	public static void change_all(P_object temp, int x, int y){
		temp.change(x,y);
	}

	
}
