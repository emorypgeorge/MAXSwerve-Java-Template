package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

//Every subsystem must extend SubsystemBase to work correctly
public class IntakeSubsystem extends SubsystemBase{

    //Motor controller for intake motor
    //Need to specify the CAN ID for the motor controller and motor type (brushless for NEOs)
    SparkMax intakeMotor = new SparkMax(0, MotorType.kBrushless);

    ///////////////////Methods that can be used for IntakeSubsystems////////////////////////
    
    //NOTE: Motor speeds range from 0(not moving) to 1 (max speed)
    // Setting a speed at 0.5 would be 50% of the max speed
    // Making a speed - reverses the direction in which the motor spins

    //Make intake motor spin forward (pick up ring)
    public void in(){
        intakeMotor.set(1);
    }

    //Make intake motor spin backward (spit ring out)
    public void out(){
        intakeMotor.set(-0.6);
    }

    //Make motor stop
    public void stop(){
        intakeMotor.set(0);
    }    
}