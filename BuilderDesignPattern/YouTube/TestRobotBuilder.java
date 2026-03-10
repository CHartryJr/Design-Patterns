package BuilderDesignPattern.YouTube;

public class TestRobotBuilder {
	
	public static void main(String[] args){
		
		// Get a RobotBuilder of type OldRobotBuilder
		
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		
		// Pass the OldRobotBuilder specification to the engineer
		
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		
		// Tell the engineer to make the Robot using the specifications
		// of the OldRobotBuilder class
		
		robotEngineer.makeRobot();
		
		// The engineer returns the right robot based off of the spec
		// sent to it on line 11
		
		Robot Robot = robotEngineer.getRobot();
		
		System.out.println("Robot Built");
		System.out.println("Robot Head Type: " + Robot.getRobotHead());
		System.out.println("Robot Torso Type: " + Robot.getRobotTorso());
		System.out.println("Robot Arm Type: " + Robot.getRobotArms());
		System.out.println("Robot Leg Type: " + Robot.getRobotLegs());


		OldRobotBuilder2 arb = new OldRobotBuilder2();
		arb.head("Long Head wide Eyes")
		.torso("Wide and Strot")
		.arms("wide and bulk")
		.leg("Short");
		
		Robot = arb.buildRobot();

		System.out.println("New Robot Built");
		System.out.println("Robot Head Type: " + Robot.getRobotHead());
		System.out.println("Robot Torso Type: " + Robot.getRobotTorso());
		System.out.println("Robot Arm Type: " + Robot.getRobotArms());
		System.out.println("Robot Leg Type: " + Robot.getRobotLegs());

	}
	
}