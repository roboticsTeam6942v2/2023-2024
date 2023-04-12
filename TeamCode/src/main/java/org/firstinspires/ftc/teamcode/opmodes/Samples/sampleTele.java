package org.firstinspires.ftc.teamcode.opmodes.Samples;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.system.testy;

@TeleOp(name="subsystem teleop",group="tests")
public class sampleTele extends LinearOpMode {
    @Override
    public void runOpMode() {
        // initializes and hardware-maps robot ps.you can name the robot anything
        testy robot = new testy(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            // make manual lift controls
            robot.lift.STP(Math.round(robot.lift.gCP() + (gamepad1.right_trigger*5) - (gamepad1.left_trigger*5)));
            robot.lift.RTP();
            robot.lift.SP(1);

            robot.lift.determinePosition();

            // allow you to increase and decrease lift to predetermined levels
            if(gamepad1.y){robot.lift.addPrePosition();}
            if(gamepad1.a){robot.lift.subPrePosition();}

        }
    }
}
