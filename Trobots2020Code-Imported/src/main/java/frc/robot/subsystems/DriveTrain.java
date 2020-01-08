package frc.robot.subsystems;

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.ArcadeDrive;
/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  private WPI_TalonFX leftMotor1;
  private WPI_TalonFX leftMotor2;
  private WPI_TalonFX rightMotor1;
  private WPI_TalonFX rightMotor2;

  private SpeedControllerGroup rightMotors;
  private SpeedControllerGroup leftMotors;

  private DifferentialDrive mainDrive;

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public DriveTrain(){
    this.leftMotor1 = new WPI_TalonFX(RobotMap.leftMotor1);
    this.leftMotor2 = new WPI_TalonFX(RobotMap.leftMotor2);
    this.rightMotor1 = new WPI_TalonFX(RobotMap.rightMotor1);
    this.rightMotor2 = new WPI_TalonFX(RobotMap.rightMotor2);


    this.leftMotors = new SpeedControllerGroup(this.leftMotor1, this.leftMotor2);
    this.rightMotors = new SpeedControllerGroup(this.rightMotor1, this.rightMotor2);

    this.mainDrive = new DifferentialDrive(leftMotors, rightMotors);
    this.mainDrive.setDeadband(0.1);





  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new ArcadeDrive());
   
  }

  public void arcDrive(double throttle, double rotation){

    this.mainDrive.arcadeDrive(throttle, rotation);
  
  }
  
}
