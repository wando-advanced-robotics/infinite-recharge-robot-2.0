package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import frc.robot.Constants;

public class IntakeSystem extends SubsystemBase{
    private final double INTAKE_MOTOR_PERCENT = 0.65;

    private WPI_TalonSRX intakeMotor;

    public IntakeSystem () {
        intakeMotor = new WPI_TalonSRX(Constants.INTAKE_MOTOR);

        intakeMotor.setNeutralMode(NeutralMode.Brake);
    }

    public void intakeIn() {
        intakeMotor.set(ControlMode.PercentOutput, INTAKE_MOTOR_PERCENT);
    }

    public void intakeOut() {
        this.intakeMotor.set(ControlMode.PercentOutput, -INTAKE_MOTOR_PERCENT);
    }
    
    public void intakeStop() {
        this.intakeMotor.set(ControlMode.PercentOutput, 0);
    }

    @Override
	public void periodic() {

    }
    
}
