package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;
import com.kauailabs.navx.frc.AHRS;
import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.swervedrive.SwerveDrive;
import frc.robot.wrappers.JoystickWrapper;
import frc.robot.wrappers.TalonFXWrapper;
import frc.robot.wrappers.XboxControllerWrapper;

public class Robot extends TimedRobot {
  private TalonFX motor;

  public Robot() {
    super(0.03);

    motor = new TalonFX(15);
  }
  @Override
  public void robotInit() {
  }
  @Override
  public void teleopInit() {
  }
  @Override
  public void teleopPeriodic() {
    motor.set(0.1);
  }
  @Override
  public void autonomousInit() {
  }
  @Override
  public void autonomousPeriodic() {
  }
  @Override public void testInit() {
  }
  @Override public void testPeriodic() {
  }
}