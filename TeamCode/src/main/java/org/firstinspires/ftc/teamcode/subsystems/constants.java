package org.firstinspires.ftc.teamcode.subsystems;

import static java.lang.Math.*;
import static org.firstinspires.ftc.teamcode.subsystems.ease_commands.*;

public class constants {

    // drivetrain info
    final double diameter=4; // wheel diameter
    final int motor_ratio=40; // ratio on motor
    final int gear_ratio=1; // gears on driveshaft, direct drive = 1


    // to calculate distance
    // assuming its a hall effect encoder then *28 accounts for the rises and falls for the channels
    final double conversion_factor= ((motor_ratio*gear_ratio * 28)/(diameter*PI));

    // default power for closed loop methods
    // its kinda like a "scanning" speed
    final double power = .30;

    // PID algorithm values
    final double P = 0; // increase until the robot oscillates
    final double I = 0; // once p is "found" set this to around half
    final double D = 0; // increase this to prevent overshoot
    // basic rules for tuning
    // p means youre going fast the further you are from your target
    // i means if you hit a rough patch or arent getting to speed we increase power over time to get there
    // d means depending on how big of a spike from the rate of change, we slow down to prevent overshoot
    // the larger the spike the more it dampens, so if youve been slow on a bump and i gets high enough to pass the bump
    // then all of a sudden in one loop youve moved 4x the degrees you normally do, d will spike up to slow you down so you dont overshoot



}
