package Demo;


public class Fakult�t {

	public int fakult�t(int zahl) {
		
		if(zahl > 1) {
			return zahl * fakult�t(zahl - 1);
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
