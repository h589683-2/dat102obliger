package oppg4;

public class b {
	public static void main(String [] args) {
		int n = 10;
		print(o1(n));
		
	}
	
	public static void print(int[] tab) {
		for(int i = 0; i < tab.length; i++) {
			System.out.println(tab[i] + "\n--------");
		}
		
	}
	
	public static int[] o1(int n) {
		int [] res = new int[n];
		res[0] = 2;
		res[1] = 5;
		
		
		for(int i = 2; i < res.length; i++) {
			res[i] = o2(res[i-1], res[i-2]);
		}
		
		return res;
	}
	
	public static int o2(int a1, int a2) {
		int res = 0;
		
		res = 5 * a2 - 6 * a1 + 2;
		return res;
	}
	
}
