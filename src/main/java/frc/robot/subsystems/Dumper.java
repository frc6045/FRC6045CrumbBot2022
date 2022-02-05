// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;


import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
 import com.ctre.phoenix.motorcontrol.FeedbackDevice;
 import com.ctre.phoenix.motorcontrol.NeutralMode;
 import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Dumper extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private WPI_TalonSRX dumpMotorRight;
private WPI_TalonSRX dumpMotorLeft;
private MotorControllerGroup dumpMotorBot;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public Dumper() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
dumpMotorRight = new WPI_TalonSRX(6);
 
    /* Factory default hardware to prevent unexpected behavior */
dumpMotorRight.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
dumpMotorRight.setInverted(false);
dumpMotorRight.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
dumpMotorRight.configNominalOutputForward(0, 30);
dumpMotorRight.configNominalOutputReverse(0, 30);
dumpMotorRight.configPeakOutputForward(1, 30);
dumpMotorRight.configPeakOutputReverse(-1, 30);
        











        

dumpMotorLeft = new WPI_TalonSRX(7);
 
    /* Factory default hardware to prevent unexpected behavior */
dumpMotorLeft.configFactoryDefault();

        /* Invert Motor? and set Break Mode */
dumpMotorLeft.setInverted(true);
dumpMotorLeft.setNeutralMode(NeutralMode.Coast);

        /* Set the peak and nominal outputs */
dumpMotorLeft.configNominalOutputForward(0, 30);
dumpMotorLeft.configNominalOutputReverse(0, 30);
dumpMotorLeft.configPeakOutputForward(1, 30);
dumpMotorLeft.configPeakOutputReverse(-1, 30);
        











        

dumpMotorBot = new MotorControllerGroup(dumpMotorRight, dumpMotorLeft  );
 addChild("DumpMotorBot",dumpMotorBot);
 


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

