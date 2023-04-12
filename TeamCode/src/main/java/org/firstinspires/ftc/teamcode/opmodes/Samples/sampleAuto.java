package org.firstinspires.ftc.teamcode.opmodes.Samples;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.system.testy;

@Autonomous(name="subsystem autonomous",group="tests")

public class sampleAuto extends LinearOpMode {
    String stage = "declaring";
    double initParams;
    @Override
    public void runOpMode() {
        // initializes and hardware-maps robot
        testy robot = new testy(hardwareMap); // calling this hardware maps our subsystems, must be ran in runOpMode
        ElapsedTime timer = new ElapsedTime();
        stage = "initializing";

        waitForStart();
        stage = "initialed, waiting for start...";

        while (opModeIsActive()) {
            stage = "running";

            // go to a predetermined position
            robot.lift.setPrePosition(1);

            // allow you to increase and decrease lift to predetermined levels
            robot.lift.addPrePosition();
            robot.lift.subPrePosition();

            // drive is called with direction inches then speed, its capable of diagonals
            robot.drivetrain.drive("f", 10, .5);
            robot.drivetrain.drive("b", 10, .5);
            robot.drivetrain.drive("l", 10, .5);
            robot.drivetrain.drive("r", 10, .5);
            robot.drivetrain.drive("fr", 10, .5);
            robot.drivetrain.drive("bl", 10, .5);
            robot.drivetrain.drive("fl", 10, .5);
            robot.drivetrain.drive("br", 10, .5);

            stage = "rotating";
            // rotating with just proportions and a booster
            robot.drivetrain.rotateP(-90, .5);
            robot.drivetrain.rotateP(90, .5);

            stage = "strafe left 5 seconds";
            timer.reset();
            // maintainHeading is called in a loop, you must call resetAngle prior to this loop
            robot.drivetrain.resetAngle();
            while (stage.equals("strafe left 5 seconds") && timer.seconds() >= 5) {
                robot.drivetrain.maintainHeading("l");
            }
            stage = "strafe right 5 seconds";
            timer.reset();
            robot.drivetrain.resetAngle();
            while (stage.equals("strafe right 5 seconds") && timer.seconds() >= 5) {
                robot.drivetrain.maintainHeading("l");
            }

            // rotate with proportions, integrals, and derivatives
            // for more details view the constants in org.firstinspires.ftc.teamcode.subsystems.constants
            stage = "rotating with PID";
            robot.drivetrain.rotatePID("l", 45);
            robot.drivetrain.rotatePID("r", 90);
            robot.drivetrain.rotatePID("l", 45);

            // for maintainHeadingPID you must set a double to 0 to initialize it
            // then in the area its being looped to a condition you have to
            // set the var equal to the call of the function with parameters of the direction, then the parameters again
            initParams = 0;
            timer.reset();
            stage = "maintain forward with PID 5 seconds";
            while (stage.equals("maintain forward with PID 5 seconds") && timer.seconds() >= 5) {
                initParams = robot.drivetrain.maintainHeadingPID("f", initParams);
            }

            initParams = 0;
            timer.reset();
            stage = "maintain backwards with PID 5 seconds";
            while (stage.equals("maintain backwards with PID 5 seconds") && timer.seconds() >= 5) {
                initParams = robot.drivetrain.maintainHeadingPID("b", initParams);
            }
            initParams = 0; // i reset the parameter for the closed loop, just in case i forget it later

            // with no parameters maintainHeading will try to stay parallel
            // once again however resetAngles() must be called before this
            stage = "hold in place";
            robot.drivetrain.resetAngle();
            while (stage.equals("hold in place")) {
                robot.drivetrain.maintainHeading();
            }
        }
    }
}
