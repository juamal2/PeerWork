package peer;

public class Factorial {
	public static int Num(int x) {
		int y=1;
		while(x/y != y/x) {
			x= x/y;
			y++;
			
			
		}
		
		return x;
		
		
		
		
	}

}
