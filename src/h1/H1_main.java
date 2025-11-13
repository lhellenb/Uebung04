package h1;

public class H1_main {
	public static void main(String[] args) {
		int zone= 7;
		double price=11.4;
		
		price=0;
		
		switch(zone) {
		case 5: 
			price=0.7;
		case 4:
		case 3:
			price += 0.5;
		case 2:
			price += 0.35;
		case 1: 
			price += 2.0;
			break;
		default:
			price=4.0;
			break;
		}
		
		System.out.println(price);
	}
	

}
