public class BottlesOfBeer{
	
	private static void printBottles(int number){
	
		System.out.println(number + " bottles of beer on the wall, " + number + " bottles of beer, ya’ take one down, ya’ pass it around, " + --number + " bottles of beer on the wall.");
		if(number > 0){
			printBottles(number);
		}
	
	}
	
	public static void main(String[] args){
	
		printBottles(99);
	
	}

}
