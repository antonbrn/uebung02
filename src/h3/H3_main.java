package h3;

public class H3_main {

	static int i = 190;
	static int j = 150;
	static int k = 0;
	
	public static void main(String[] args) {
		k = -10;
		if(i > j) {
			if(i < 201) {
				if(j < 101) {
					k = 1;
				}
			} else {
				if(j < 101) {
					k = 2;
				} else {
					k = 3;
				}
			}
		} else {
			if(i < 201 && j < 101) {
				k  = 4; 
			}
		}
		System.out.println(k);	
	}
	
}
