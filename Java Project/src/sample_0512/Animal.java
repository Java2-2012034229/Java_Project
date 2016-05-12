package sample_0512;

public class Animal {

	
		protected double weight;
		protected String picture;
		
		public Animal(double weight, String picture) {
			
			this.weight = weight;
			this.picture = picture;
			System.out.println("Animal cont2");
		}

		public Animal() {weight = 99; picture= "Animal";
		System.out.println("Animal cont");}
		
		void eat(){ 
			System.out.println("eat()가 호출되었음");
		}
		void sleep() {
			System.out.println("sleep()가 호출되었음");
		}

	}

