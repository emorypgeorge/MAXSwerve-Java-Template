package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ConveyorSubsystemConstants;

//Every subsystem must extend SubsystemBase to work correctly
public class ConveyorSubsystem extends SubsystemBase{

    //All constants should be stored and updated in the ConveyorSubsystemConstants class in the Constants.java file

    //Motor controller for intake motor
    //Need to specify the CAN ID for the motor controller and motor type (brushless for NEOs)
    SparkMax conveyorMotor = new SparkMax(ConveyorSubsystemConstants.conveyorMotorCanId, MotorType.kBrushless);

    ///////////////////Methods that can be used for Conveyor Subsystems////////////////////////

    //Make conveyor motor spin forward to move rings up the conveyor toward the launcher
    public void up(){
        conveyorMotor.set(ConveyorSubsystemConstants.upConveyorSpeed);
    }

    //Make conveyor motor spin backward to move rings down the conveyor away from the launcher
    public void down(){
        conveyorMotor.set(ConveyorSubsystemConstants.downConveyorSpeed);
    }

    //Make motor stop
    public void stop(){
        conveyorMotor.stopMotor();
    }    
}