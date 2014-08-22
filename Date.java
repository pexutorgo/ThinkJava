public class Date{

	public static void main(String[] args){
	
		String day = "Monday";
		int date = 18;
		String month = "August";
		int year = 2014;
		
		printAmerican(day, date, month, year);
		printEuropean(day, date, month, year);
	
	}
	
	private static void printAmerican(String day, int date, String month, int year){
	
		System.out.println(day + ", " + month + " " + date + ", " + year);
	
	}
	
	private static void printEuropean(String day, int date, String month, int year){
	
		System.out.println(day + " " + date + " " + month + ", " + year);
	
	}

}
