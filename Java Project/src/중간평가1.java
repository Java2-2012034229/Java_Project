
public class 중간평가1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<8;i++){
			for(j=1;j<7;j++){

				if(i<=2&&j>=5){
					break;
				}
				if(i>=3&&i<=5){
					if(j>=4&&j<=5){
						continue;
					}
						
				}
				if(i==7){
					if(j>=4&&j<=5){
						System.out.print("    ");
						continue;
					}
						
					
				}
				
				System.out.print(j+"0"+i+" ");
				
			}
			System.out.println(" ");
		}
			

	}

}
