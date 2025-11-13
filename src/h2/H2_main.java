package h2;

public class H2_main {
	public static void main(String[] args) {
		boolean x=true, y=true;
		boolean a=false, b=false, c=false;
		int input= 11;
		
		
		if (input==10 || input==11) {
			x=true;								// || heißt "oder"
		}else {x=false;}
		
		if (input==11 || input == 1) {
			y=true;
		}else {y=false;}
		
		if(x && y) {						// hier also wenn x und y gleichzeitig wahr sind
			a=true;
		}else {a=false;}
		
		if(x || x!=y) {
			b=true;
		}else {b=false;}
		
		if(!y) {
			c=true;
		}else {c=false;}
		
		System.out.println("x ist "+x);
		System.out.println("y ist "+y);
		System.out.println("a ist "+a);
		System.out.println("b ist "+b);
		System.out.println("c ist "+c);
	}

}
