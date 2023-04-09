package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.system.testy;

@Autonomous(name="subsystem autonomous",group="tests")

public class subsystemTestAuto extends LinearOpMode {
    @Override
    public void runOpMode() {
        // initializes and hardware-maps robot
        testy robot = new testy(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            robot.drivetrain.drive("foward", 10, .5);
            robot.drivetrain.drive("backward", 10, .5);
            robot.drivetrain.drive("left", 10, .5);
            robot.drivetrain.drive("right", 10, .5);
            robot.drivetrain.drive("diagonal fr", 10, .5);
            robot.drivetrain.drive("diagonal bl", 10, .5);
            robot.drivetrain.drive("diagonal fl", 10, .5);
            robot.drivetrain.drive("diagonal br", 10, .5);
        }
    }
}
