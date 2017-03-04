package level0;

import org.jointheleague.graphical.robot.Robot;

public class robotsquere {

public static void main(String[] args) {
	Robot bob = new Robot();
	bob.setSpeed(10);
	bob.penDown();bob.move(1);
	//bob.move(463);
	//bob.turn(90);
	//bob.move(463);
	//bob.turn(90);
	//bob.move(463);
	//bob.turn(90);
//bob.move(463);
//bob.move(463);
//bob.turn(90);
//bob.move(463);
//bob.turn(90);
//bob.move(463);
for (int i=0; i<50;i=i+1){
bob.move(463);
bob.turn(90);
}
} }
