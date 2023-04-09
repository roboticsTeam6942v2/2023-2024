package org.firstinspires.ftc.teamcode.libraries;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.libraries.subsystem;

public class subsystem {
    HardwareMap hwMap;
    public subsystem(){
        hwMap = null;
    }
    public subsystem(HardwareMap hardwareMap){
        hwMap = hardwareMap;
    }
}
