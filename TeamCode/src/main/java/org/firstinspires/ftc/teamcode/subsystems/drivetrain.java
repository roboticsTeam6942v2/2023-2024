package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.AxesReference;
import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.Acceleration;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;

import org.firstinspires.ftc.teamcode.libraries.subsystem;

public class drivetrain extends subsystem{
    DcMotor frontLeft,frontRight,backLeft,backRight;
    private BNO055IMU imu;
    private Orientation angles;
    private Acceleration gravity;

    public drivetrain(HardwareMap hwMap) {
        frontLeft = hwMap.get(DcMotor.class, "leftFront");
        frontRight = hwMap.get(DcMotor.class, "leftRear");
        backLeft = hwMap.get(DcMotor.class, "rightFront");
        backRight = hwMap.get(DcMotor.class, "leftRear");

        //initializes gyro
        BNO055IMU.Parameters parameters = new BNO055IMU.Parameters();
        parameters.angleUnit = BNO055IMU.AngleUnit.DEGREES;
        parameters.accelUnit = BNO055IMU.AccelUnit.METERS_PERSEC_PERSEC;
        parameters.calibrationDataFile = "BNO055IMUCalibration.json";
        parameters.loggingEnabled = true;
        parameters.loggingTag = "IMU";
        imu = hwMap.get(BNO055IMU.class, "imu");
        imu.initialize(parameters);

        frontLeft.setDirection(DcMotor.Direction.FORWARD);
        backLeft.setDirection(DcMotor.Direction.FORWARD);
        backRight.setDirection(DcMotor.Direction.REVERSE);
        frontRight.setDirection(DcMotor.Direction.REVERSE);
    }
    public void SP (String m, double p) {
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

    public void STP (String m, int tp) {
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

    public void RTP (String m) {
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

    public void SAR (String m) {
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

    public void RWE (String m) {
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

    public void RUE (String m) {
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
        int motor_ratio=40;
        int gear_ratio=1;
        // assuming its a hall effect encoder then *28 accounts for the rises and falls for the channels
        return (int) Math.round(((motor_ratio*gear_ratio * 28)/(diameter*Math.PI))*inches);
    }

    public void drive (String direction, double inches, double speed){
        SAR("dt");
        switch(direction){
            case"f":
                STP("dt",inTT(inches));
                SP("dt",speed);
                RTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                SP("dt",0);
            case"b":
                STP("dt",inTT(-inches));
                SP("dt",speed);
                RTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                SP("dt",0);
            case"l":
                STP("fl",inTT(-inches));
                STP("fr",inTT(inches));
                STP("bl",inTT(inches));
                STP("br",inTT(-inches));
                SP("dt",speed);
                RTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                SP("dt",0);
            case"r":
                STP("fl",inTT(inches));
                STP("fr",inTT(-inches));
                STP("bl",inTT(-inches));
                STP("br",inTT(inches));
                SP("dt",speed);
                RTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                SP("dt",0);
            case"fr":
                STP("fl",inTT(inches));
                STP("fr",inTT(0));
                STP("bl",inTT(0));
                STP("br",inTT(inches));
                SP("dt",speed);
                RTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                SP("dt",0);
            case"bl":
                STP("fl",inTT(-inches));
                STP("fr",inTT(0));
                STP("bl",inTT(0));
                STP("br",inTT(-inches));
                SP("dt",speed);
                RTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                SP("dt",0);
            case"fl":
                STP("fl",inTT(0));
                STP("fr",inTT(inches));
                STP("bl",inTT(inches));
                STP("br",inTT(0));
                SP("dt",speed);
                RTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                SP("dt",0);
            case"br":
                STP("fl",inTT(0));
                STP("fr",inTT(-inches));
                STP("bl",inTT(-inches));
                STP("br",inTT(0));
                SP("dt",speed);
                RTP("dt");
                while (frontLeft.isBusy() && frontRight.isBusy() && backLeft.isBusy() && backRight.isBusy()){}
                SP("dt",0);
        }
    }

    public double[] getAngles(){
        angles = imu.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.DEGREES);
        double[] anglearray = {angles.firstAngle, angles.secondAngle, angles.thirdAngle};
        return anglearray;
    }
    public double getHeading(){
        angles = imu.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.DEGREES);
        return angles.firstAngle;
    }
}
