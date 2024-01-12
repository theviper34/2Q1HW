public class Program {
	public static void main(String[] args) {
		Clock myClock = new Clock();
		
		myClock.show();
		
        myClock.tick();
        myClock.tick();
        
        myClock.show();
        
        myClock.setMidDay();

        myClock.tick();
        myClock.tick();
        myClock.tick();
        
        myClock.show();
        System.out.println("Its MidDay.");
        
        Clock yourClock = new Clock();

        yourClock.setMidNight();
        yourClock.tick();
        
        yourClock.show();
		System.out.println("Its Midnight.");



	}
}