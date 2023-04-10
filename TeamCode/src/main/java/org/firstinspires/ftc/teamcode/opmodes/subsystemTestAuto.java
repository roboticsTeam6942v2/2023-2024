package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.system.testy;

@Autonomous(name="subsystem autonomous",group="tests")

public class subsystemTestAuto extends LinearOpMode {
    String stage = "declaring";
    @Override
    public void runOpMode() {
        // initializes and hardware-maps robot
        testy robot = new testy(hardwareMap);
        stage = "initializing";

        waitForStart();

        while (opModeIsActive()) {
            stage = "running";
            // test drive()
            robot.drivetrain.drive("f", 10, .5);
            robot.drivetrain.drive("b", 10, .5);
            robot.drivetrain.drive("l", 10, .5);
            robot.drivetrain.drive("r", 10, .5);
            robot.drivetrain.drive("fr", 10, .5);
            robot.drivetrain.drive("bl", 10, .5);
            robot.drivetrain.drive("fl", 10, .5);
            robot.drivetrain.drive("br", 10, .5);

            stage = "rotating";
            // test possible rotation code
            robot.drivetrain.rotate(-90, .5);


            stage = "end of autonomous";
            while (stage.equals("end of autonomous")) {
                sleep(1);
            }
        }
    }
}
