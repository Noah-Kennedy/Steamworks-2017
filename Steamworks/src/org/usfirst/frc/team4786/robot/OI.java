package org.usfirst.frc.team4786.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//instantiate buttons, sensors, joysticks, and Xbox controllers here
	private final Joystick leftDriveJoy;
    private final Joystick rightDriveJoy;
	private final DigitalInput limitSwitchGear;
	private final DigitalInput limitSwitchPeg;
	private final DigitalInput limitSwitch1;
	private final DigitalInput limitSwitch2;
	private final DigitalInput limitSwitch3;
	private final DigitalInput limitSwitch4;
	
    public OI(){
    	//Init the objects for all the buttons, sensors, joysticks, and Xbox controllers
    	leftDriveJoy = new Joystick(0);
    	rightDriveJoy = new Joystick(1);
    	
    	//Tie our many buttons, sensors, joysticks, and Xbox controllers to robot commands
    	
    	    	
    	limitSwitchGear = new DigitalInput(RobotMap.limitSwitchGearPort);
    	limitSwitchPeg = new DigitalInput(RobotMap.limitSwitchPegPort);
    	limitSwitch1 = new DigitalInput(RobotMap.limitSwitch1Port);
    	limitSwitch2 = new DigitalInput(RobotMap.limitSwitch2Port);
    	limitSwitch3 = new DigitalInput(RobotMap.limitSwitch3Port);
    	limitSwitch4 = new DigitalInput(RobotMap.limitSwitch4Port);
    
    
    }
	
	public Joystick getLeftDriveJoy() {
	    return leftDriveJoy;
	}
	
	public Joystick getRightDriveJoy() {
	    return rightDriveJoy;
	}
	
	// return DigitalInput value of limit switches
	public DigitalInput getGearLimitSwitch(){
		return limitSwitchGear;
	}
	public DigitalInput getPegLimitSwitch(){
		return limitSwitchPeg;
	}
	public DigitalInput getLimit1Switch(){
		return limitSwitch1;
	}
	public DigitalInput getLimit2Switch(){
		return limitSwitch2;
	}
	public DigitalInput getLimit3Switch(){
		return limitSwitch3;
	}
	public DigitalInput getLimit4Switch(){
		return limitSwitch4;
	}

}