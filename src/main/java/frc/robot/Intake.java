package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

public class Intake {
    private final TalonFX motor;
   
    public Intake() {
        motor = new TalonFX(0);
        motor.clearStickyFaults();
        motor.setNeutralMode(NeutralModeValue.Coast);
   }

   public void slurp() {
        motor.set(RobotConstants.intakeMotorSpeed);
   }

   public void eject() {
        motor.set(-RobotConstants.intakeMotorSpeed);
   }

   public void stop() {
        motor.set(0);
   }
}
