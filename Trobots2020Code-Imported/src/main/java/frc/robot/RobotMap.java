/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  
  //============Drive Train Motors============
  public static int LEFT_MOTOR_1 = 0;
  public static int LEFT_MOTOR_2 = 1;
  public static int RIGHT_MOTOR_1 = 2;
  public static int RIGHT_MOTOR_2 = 3;

  //============Controller Port============
  public static final int DRIVER_CONTROLLER = 0;

  //============Controller sticks============
  public static final int RIGHT_STICK_X = 4;
  public static final int RIGHT_STICK_Y = 5;
  public static final int LEFT_STICK_X = 0;
  public static final int LEFT_STICK_Y = 1;

  
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;


}
