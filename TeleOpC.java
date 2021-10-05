
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="TeleOpC", group="11846")
public class TeleOpC extends OpMode{
    Robot myrobot = new Robot();
    double left = 0.00;
    double right = 0.00;
    double slide = 0.00;
    double trigger = 0.00;

    @Override
    public void init() {
        myrobot.initHW(hardwareMap);

    }

    @Override
    public void loop() {

        if(gamepad1.right_bumper) {
            left = gamepad1.left_stick_y/2;
            right = gamepad1.right_stick_y/2;

            myrobot.LeftDrive(left);
            myrobot.RightDrive(right);
        } else {
            left = gamepad1.left_stick_y;
            right = gamepad1.right_stick_y;

            myrobot.LeftDrive(left);
            myrobot.RightDrive(right);
        }
    }
}