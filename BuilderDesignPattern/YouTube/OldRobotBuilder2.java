package BuilderDesignPattern.YouTube;
// this form takes adavanage of large parameter classes
class OldRobotBuilder2 
{
    private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;

	public OldRobotBuilder2 head(String headtype)
	{
		this.robotHead = headtype;
		return this;
	}

	public OldRobotBuilder2 torso(String bodyType)
	{
		this.robotTorso = bodyType;
		return this;
	}

	public OldRobotBuilder2 arms(String armType)
	{
		this.robotArms = armType;
		return this;
	}

	public OldRobotBuilder2 leg(String legType)
	{
		this.robotLegs = legType;
		return this;
	}

	public Robot buildRobot()
	{
		return new Robot(robotHead,robotTorso,robotArms,robotLegs);
	}
	
}
