package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.LauncherSubsystemConstants;

//Every subsystem must extend SubsystemBase to work correctly
public class LauncherSubsystem extends SubsystemBase{

    //All constants should be stored and updated in the IntakeSubsystemConstants class in the Constants.java file

    //Motor controller for intake motor
    //Need to specify the CAN ID for the motor controller and motor type (brushless for NEOs)
    SparkMax leftLauncherMotor = new SparkMax(LauncherSubsystemConstants.launcherLeftMotorCanId, MotorType.kBrushless);
    SparkMax rightLauncherMotor = new SparkMax(LauncherSubsystemConstants.launcherRightMotorCanId, MotorType.kBrushless);

    ///////////////////Methods that can be used for Launcher Subsystems////////////////////////
    
    //Long shot - requires max speed
    public void longShot(){
        leftLauncherMotor.set(LauncherSubsystemConstants.fastLauncherSpeed);
        rightLauncherMotor.set(-LauncherSubsystemConstants.fastLauncherSpeed);
    }

    //Short shot - requires less speed
    public void shortShot(){
        leftLauncherMotor.set(LauncherSubsystemConstants.slowLauncherSpeed);
        rightLauncherMotor.set(-LauncherSubsystemConstants.slowLauncherSpeed);
    }

    //Make motors stop
    public void stop(){
        leftLauncherMotor.stopMotor();
        rightLauncherMotor.stopMotor();
    }
}