package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.lift;
import org.firstinspires.ftc.teamcode.system.testy;

@TeleOp(name="subsystem teleop",group="tests")
public class subsystemsTestTele extends LinearOpMode {
    @Override
    public void runOpMode() {
        // initializes and hardware-maps robot
        testy robot = new testy(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            // make manual lift controls
            lift.STP(Math.round(lift.gCP() + (gamepad1.right_trigger*5) - (gamepad1.left_trigger*5)));
            lift.RTP();
            lift.SP(1);

            // allow you to increase and decrease lift to predetermined levels
            if(gamepad1.y){lift.addPosition();}
            if(gamepad1.a){lift.subPosition();}

        }
    }
}
