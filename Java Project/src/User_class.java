import java.util.Scanner;

public class User_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu=0;
		Pr_class prc=new Pr_class();
		do{
			System.out.println("1. am");
			System.out.println("2. As");
			System.out.println("3. Quit");
			System.out.print("Input Menu : ");
			Scanner input= new Scanner(System.in);
			menu = input.nextInt();
			switch(menu){
				case 1:
					prc.f1(); 
					break;
				case 2:
					prc.f2();
					break;
			}
			
			
		}while(menu!=3);

	}

}
