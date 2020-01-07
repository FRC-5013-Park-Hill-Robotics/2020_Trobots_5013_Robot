package frc.robot.subsystems;

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  private WPI_TalonSRX leftMotor1;
  private WPI_TalonSRX leftMotor2;
  private WPI_TalonSRX rightMotor1;
  private WPI_TalonSRX rightMotor2;

  private SpeedControllerGroup rightMotors;
  private SpeedControllerGroup leftMotors;

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    this.leftMotor1 = new WPI_TalonSRX(RobotMap.leftMotor1);
    this.leftMotor2 = new WPI_TalonSRX(RobotMap.leftMotor2);
    this.rightMotor1 = new WPI_TalonSRX(RobotMap.rightMotor1);
    this.rightMotor2 = new WPI_TalonSRX(RobotMap.rightMotor2);


    this.leftMotors = new SpeedControllerGroup(this.leftMotor1, this.leftMotor2);
    this.rightMotors = new SpeedControllerGroup(this.rightMotor1, this.rightMotor2);





  }
}
