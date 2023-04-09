package org.firstinspires.ftc.teamcode.system;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.subsystems.lift;
import org.firstinspires.ftc.teamcode.subsystems.drivetrain;

public class testy {
    public drivetrain drivetrain;
    public lift lift;

    public testy(HardwareMap hwMap){
        drivetrain = new drivetrain(hwMap);
        lift = new lift(hwMap);
    }
}
