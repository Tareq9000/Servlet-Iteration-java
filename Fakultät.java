package Demo;


public class Fakultät {

	public int fakultät(int zahl) {
		
		if(zahl > 1) {
			return zahl * fakultät(zahl - 1);
		}
		else {
			return 1;
		}
	}
	
	
	public int summe(int zahl) {
		
		if(zahl > 1) {
			return zahl + summe(zahl - 1);
		}
		else {
			return 1;
		}
	}
}
