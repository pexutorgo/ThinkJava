public class Time{

	public static void main(String[] args){
	
		int hours = 15;
		int minutes = 3;
		int seconds = 50;
		int secondsPerDay = 24 * 60 * 60;
		int secondsSinceMidnight = (((hours * 60) + minutes) * 60) + seconds;
		int secondsRemaining = secondsPerDay - secondsSinceMidnight;
		double percentageTime = ((double)secondsSinceMidnight / (double)secondsPerDay) *100;
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
		System.out.println(secondsSinceMidnight);
		System.out.println(secondsRemaining);
		System.out.println(percentageTime + "%");
	}

}
