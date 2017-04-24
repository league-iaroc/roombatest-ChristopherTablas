package level3;

import processing.core.PApplet;



public class Challenge extends Head {
	static int speed = 500;
	Roomba roomba;

	void goStraight(int howLong) {
	
	driveDirect(speed, speed);
	sleep(howLong);
		
	}
	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	
		goStraight(2200);
		
		driveDirect(10,speed);
		sleep(620);
		
		goStraight(2000);
		
		driveDirect(speed,10);
		sleep(620);
		
		goStraight(2200);
		
		driveDirect(10,speed);
		sleep(620);
		
		goStraight(2000);
		
		driveDirect(speed,10);
		sleep(600);
		
		goStraight(2000);
	}

	
	
	public void loop() {
		
	}
}
