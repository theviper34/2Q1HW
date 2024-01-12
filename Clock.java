public class Clock {
	
	private int hours;
	private int minutes;
	private int seconds;
	private int milliseconds;
	
	public void tick () {
		milliseconds = milliseconds + 1;
		
		seconds = seconds + milliseconds / 1000;
		
		milliseconds = milliseconds % 1000;

		minutes = minutes + seconds / 60;
		
		seconds = seconds % 60;

		hours = hours + minutes / 60;
		
		minutes = minutes % 60;

		hours = hours % 24;
}
	public void show(){
		System.out.println("The current time is: ");
		System.out.print(hours);
		System.out.print(':');
		System.out.print(minutes);
		System.out.print(':');
		System.out.print(seconds);
		System.out.print(':');
		System.out.print(milliseconds);
		System.out.print("\n");


		//Its better to use printf in case, but we still havent learned it yet.
		//System.out.printf("%d:%d:%d:%02d\n",hours,minutes,seconds,milliseconds);
	}
	
	public void setMidNight() {
        hours = 0;
        minutes = 0;
        seconds = 0;
        milliseconds = 0;
        //System.out.println("Its Midnight.");
    }
	
	public void setMidDay() {
        hours = 12;
        minutes = 0;
        seconds = 0;
        milliseconds = 0;
		//System.out.println("Its MidDay.");

    }
} 