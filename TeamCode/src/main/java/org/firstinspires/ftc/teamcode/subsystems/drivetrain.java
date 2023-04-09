package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.libraries.subsystem;

public class drivetrain extends subsystem{
    DcMotor frontLeft,frontRight,backLeft,backRight;

    public drivetrain(HardwareMap hwMap) {
        frontLeft = hwMap.get(DcMotor.class, "leftFront"); //See configuration Google doc
        frontRight = hwMap.get(DcMotor.class, "leftRear");
        backLeft = hwMap.get(DcMotor.class, "rightFront");
        backRight = hwMap.get(DcMotor.class, "leftRear");

        frontLeft.setDirection(DcMotor.Direction.FORWARD);
        backLeft.setDirection(DcMotor.Direction.FORWARD);
        backRight.setDirection(DcMotor.Direction.REVERSE);
        frontRight.setDirection(DcMotor.Direction.REVERSE);
    }
    public void mSP (String m, double p) {
        switch(m){
            case"fl":frontLeft.setPower(p);break;
            case"fr":frontRight.setPower(p);break;
            case"bl":backLeft.setPower(p);break;
            case"br":backRight.setPower(p);break;
            case"f":frontLeft.setPower(p);frontRight.setPower(p);break;
            case"b":backLeft.setPower(p);backRight.setPower(p);break;
            case"l":frontLeft.setPower(p);backLeft.setPower(p);break;
            case"r":frontRight.setPower(p);backRight.setPower(p);break;
            case"dt":frontLeft.setPower(p);frontRight.setPower(p);backLeft.setPower(p);backRight.setPower(p);break;
        }
    }

    public void mSTP (String m, int tp) {
        switch(m){
            case"fl":frontLeft.setTargetPosition(tp);break;
            case"fr":frontRight.setTargetPosition(tp);break;
            case"bl":backLeft.setTargetPosition(tp);break;
            case"br":backRight.setTargetPosition(tp);break;
            case"f":frontLeft.setTargetPosition(tp);frontRight.setTargetPosition(tp);break;
            case"b":backLeft.setTargetPosition(tp);backRight.setTargetPosition(tp);break;
            case"l":frontLeft.setTargetPosition(tp);backLeft.setTargetPosition(tp);break;
            case"r":frontRight.setTargetPosition(tp);backRight.setTargetPosition(tp);break;
            case"dt":frontLeft.setTargetPosition(tp);frontRight.setTargetPosition(tp);backLeft.setTargetPosition(tp);backRight.setTargetPosition(tp);break;
        }
    }

    public void mRTP (String m) {
        switch(m){
            case"fl":frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);break;
            case"fr":frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);break;
            case"bl":backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);break;
            case"br":backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);break;
            case"f":frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);break;
            case"b":backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);break;
            case"l":frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);break;
            case"r":frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);break;
            case"dt":frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);break;
        }
    }

    public void mSAR (String m) {
        switch(m){
            case"fl":frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);break;
            case"fr":frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);break;
            case"bl":backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);break;
            case"br":backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);break;
            case"f":frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);break;
            case"b":backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);break;
            case"l":frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);break;
            case"r":frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);break;
            case"dt":frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);break;
        }
    }

    public void mRWE (String m) {
        switch(m){
            case"fl":frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);break;
            case"fr":frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);break;
            case"bl":backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);break;
            case"br":backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);break;
            case"f":frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);break;
            case"b":backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);break;
            case"l":frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);break;
            case"r":frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);break;
            case"dt":frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);break;
        }
    }

    public void mRUE (String m) {
        switch(m){
            case"fl":frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);break;
            case"fr":frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);break;
            case"bl":backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);break;
            case"br":backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);break;
            case"f":frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);break;
            case"b":backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);break;
            case"l":frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);break;
            case"r":frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);break;
            case"dt":frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);break;
        }
    }

    public int inTT (double inches){
        // to calculate distance
        double diameter=4;
        int motor_ratio=20;
        int gear_ratio=1;
        // assuming its a hall effect encoder then *28 accounts for the rises and falls for the channels
        return (int) Math.round(((motor_ratio*gear_ratio * 28)/(diameter*Math.PI))*inches);
    }

    public void drive (String direction, double inches, double speed){
        mSAR("dt");
        switch(direction){
            case"forward":
                mSTP("dt",inTT(inches));
                mSP("dt",speed);
                mRTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                mSP("dt",0);
            case"backwards":
                mSTP("dt",inTT(-inches));
                mSP("dt",speed);
                mRTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                mSP("dt",0);
            case"left":
                mSTP("fl",inTT(-inches));
                mSTP("fr",inTT(inches));
                mSTP("bl",inTT(inches));
                mSTP("br",inTT(-inches));
                mSP("dt",speed);
                mRTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                mSP("dt",0);
            case"right":
                mSTP("fl",inTT(inches));
                mSTP("fr",inTT(-inches));
                mSTP("bl",inTT(-inches));
                mSTP("br",inTT(inches));
                mSP("dt",speed);
                mRTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                mSP("dt",0);
            case"diagonal fr":
                mSTP("fl",inTT(inches));
                mSTP("fr",inTT(0));
                mSTP("bl",inTT(0));
                mSTP("br",inTT(inches));
                mSP("dt",speed);
                mRTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                mSP("dt",0);
            case"diagonal bl":
                mSTP("fl",inTT(-inches));
                mSTP("fr",inTT(0));
                mSTP("bl",inTT(0));
                mSTP("br",inTT(-inches));
                mSP("dt",speed);
                mRTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                mSP("dt",0);
            case"diagonal fl":
                mSTP("fl",inTT(0));
                mSTP("fr",inTT(inches));
                mSTP("bl",inTT(inches));
                mSTP("br",inTT(0));
                mSP("dt",speed);
                mRTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                mSP("dt",0);
            case"diagonal br":
                mSTP("fl",inTT(0));
                mSTP("fr",inTT(-inches));
                mSTP("bl",inTT(-inches));
                mSTP("br",inTT(0));
                mSP("dt",speed);
                mRTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                mSP("dt",0);
        }
    }
}
