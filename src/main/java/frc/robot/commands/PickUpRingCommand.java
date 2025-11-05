package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ConveyorSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

public class PickUpRingCommand extends Command {

    // Subsystem dependencies - what subsystems does this command require?
    private final IntakeSubsystem intake;
    private final ConveyorSubsystem conveyor;

    // Constructor to set up subsystem dependencies - will pass in the subsystems from RobotContainer
    public PickUpRingCommand(IntakeSubsystem intake, ConveyorSubsystem conveyor) {
        this.intake = intake;
        this.conveyor = conveyor;
    }

    @Override
    //What should happen when the command begins (AKA when the button is first pressed)?
    public void initialize() {
        intake.in();
        conveyor.up();
    }

    @Override
    //What should happen when the command ends (AKA when the button is released)?
    public void end(boolean interrupted) {
        intake.stop();
        conveyor.stop();
    }

    @Override
    //Returns false to keep the command running until interrupted (button released)
    public boolean isFinished() {
        return false;
    }
}
