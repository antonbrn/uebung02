package h2;

public class H2_main {
	
	static int i = 3;
	static int j = 4;
	static int k = 1;
	static int min = 0;
	static int max = 0;
	
	public static void main(String[] args) {
		if(i > j) {
			if(i > k) {
				max = i;
			}
			if(j < k) {
				min = j;
			}
		} else {
			if(j > k) {
				max = j;
			}
			if(i < k) {
				min = i;
			}
		}
		if(k > i && k > j) {
			max = k;
		}
		if(k < i && k < j) {
			min = k;
		}
		
		System.out.println("Min: " + min + ", Max: " + max);
	}


}
