package p2;

public class P2_main {
	public static void main(String[] args) {
		 int a=3, b=5, c=6;
		 int intResult;
		 double x=1.5, y=2.3;
		 double doubleResult;
		 
		 intResult = c-a*3;   // -3 (sinnvoll, denn beides Integer)
		 intResult= c/b;  // 1 (die Zahl wird abgeschnitten, weil c und b integer sind)
		 intResult = a+b/c;  // 3 b/c ist eigentlich double aber es wird abgeschnitten und deswegen gibt das alles integer
		 System.out.println(intResult);
		 
		 doubleResult =  c/b; // 1.0 Die Zahl wird abgeschnitten, weil c und b integer aber die Zahl wird als double gespeichert
		 doubleResult = c+a/b; // 6.0 weil alles integer wird die zahl abgeschnitten
		 doubleResult = x+y*b; // 13.0, ist richtiges Ergebnis, also y*b wird zu einer double weil y double ist
		 
		 // Korrektur von (d) und (e)
		 doubleResult= (double) c/b;  // 1.2 top
		 doubleResult = c + (double) a/b; // 6.6 top
		 
		 System.out.println(doubleResult);
		 
	}

}
