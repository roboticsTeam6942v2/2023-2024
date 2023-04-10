package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.libraries.subsystem;

public class lift extends subsystem {

    static DcMotor lift;

    static int[] LEVEL_HEIGHT = {10, 1300, 1700, 2000};
    private static int level = 0;

    public lift(HardwareMap hwMap) {
        lift = hwMap.get(DcMotor.class, "liftMotor");
        lift.setDirection(DcMotor.Direction.FORWARD);
        lift.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        STP(0);
        SP(1);
        RTP();
//         lift.setTargetPositionTolerance(200);
    }

    public static void STP(int tp) {lift.setTargetPosition(tp);}
    public static void SP(double p) {lift.setPower(p);}
    public static void RTP() {lift.setMode(DcMotor.RunMode.RUN_TO_POSITION);}
    public static void SAR() {lift.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);}
    public static void RWE() {lift.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);}
    public static void RUE() {lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);}

    public static void addPosition() {
        if(level < 3) {
            level++;
            STP(LEVEL_HEIGHT[level]);
            SP(1);
            RTP();
        }
    }

    public static void subPosition() {
        if(level > 0) {
            level--;
            STP(LEVEL_HEIGHT[level]);
            SP(1);
            RTP();
        }
    }

    public static int gCP() {
        return lift.getCurrentPosition();
    }

    public static void keepWithinLimits(){
        if (gCP()<10) {STP(10);RTP();SP(1);}
        if (gCP()<2000) {STP(2000);RTP();SP(1);}
    }
}
