package peer;

public class DoggoCompetition {
	public static String place(int x) {
		String result = "";
		for (int i = 1; i < 101; i++) {
			if (i != x) {
				String loser = Integer.toString(i);
				if (( i>10 && i<21)) {
					result += loser +"th ";
				}
				else if (loser.endsWith("1")) {
					result += loser + "st ";
				} else if (loser.endsWith("2")) {
					result += loser + "nd ";
				} else if (loser.endsWith("3")) {
					result += loser + "rd ";
				} else {
					result += loser + "th ";
				}
			} else {
			}
			if (i % 10 == 0) {
				result += "\n";
			}
		}
		return result;
	}

	public static void Dogs(int winner) {
		
		
		for(int y=1; y<=100; y++) {
			if (y == winner) {
			}
			else {
			System.out.println(y);
			}
			
		}
	}

}
