package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeSubsystemConstants;;

//Every subsystem must extend SubsystemBase to work correctly
public class IntakeSubsystem extends SubsystemBase{

    //All constants should be stored and updated in the IntakeSubsystemConstants class in the Constants.java file

    //Motor controller for intake motor
    //Need to specify the CAN ID for the motor controller and motor type (brushless for NEOs)
    SparkMax intakeMotor = new SparkMax(IntakeSubsystemConstants.intakeMotorCanId, MotorType.kBrushless);

    ///////////////////Methods that can be used for IntakeSubsystems////////////////////////

    //Make intake motor spin forward (pick up ring)
    public void in(){
        intakeMotor.set(IntakeSubsystemConstants.intakeSpeed);
    }

    //Make intake motor spin backward (spit ring out)
    public void out(){
        intakeMotor.set(IntakeSubsystemConstants.outtakeSpeed);
    }

    //Make motor stop
    public void stop(){
        intakeMotor.stopMotor();
    }    
}