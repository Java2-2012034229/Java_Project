import java.util.*;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
while(true){
			System.out.println("     Menu");
			System.out.println("1.Arithmetic Operation");
			System.out.println("2.Append Strings");
			System.out.println("3.Quit");
			Scanner menu = new Scanner(System.in);
			
			System.out.print("번호를 고르세요:");
			int x=menu.nextInt();
			if(x==3){
				System.out.println("프로그램을 종료합니다.");
				break;}
			
			Process m1 = new Process();
			if(x==1){
			Scanner input =new Scanner(System.in);
			System.out.println("a입력");
			int a=input.nextInt();
			System.out.println("b입력");
			int b=input.nextInt();
			
			
				m1.ari(a, b);
				m1.ari(a, b);
				continue;
				
			}
			if(x==2){
				Scanner input = new Scanner(System.in);
				System.out.println("A문장 입력");
				String A=input.nextLine();
				System.out.println("B문장 입력");
				String B=input.nextLine();
				m1.app(A, B);
				
				
			}

			}
}
				
			
			}
			
	

