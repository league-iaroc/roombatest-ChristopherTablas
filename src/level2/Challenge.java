
package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	static int speed = 500;
	Roomba roomba;
    
	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		
	driveDirect(speed, speed);
	sleep(3570);
	driveDirect(0,550);
	sleep(599);
	driveDirect(speed,speed);
	sleep(4300);
	driveDirect(550,0);
	sleep(599);
	driveDirect(speed,speed);
	}

	public void loop() {
	
	}
}
