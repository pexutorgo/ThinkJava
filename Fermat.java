public class Fermat{
	
	private static void checkFermat(int a, int b, int c, int n){
		
		int x = raiseToPow(a,n) + raiseToPow(b, n);
		if(x == raiseToPow(c,n) && n != 2){
			System.out.println("Fermat was wrong!");
		}else{
			System.out.println("Fermat was right, probably");
		}
		checkFermat(a,b,c,n++);
		
	}
	
	private static int raiseToPow(int num, int power){
	
		double x = Math.pow((double)num, (double)power);
		return (int)x;
	}
	
	public static void main(String[] args){
		
		checkFermat(3,4,5,2);
		
	}

}
