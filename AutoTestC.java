package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="AutoTestC", group="11846")
public class AutoTestC extends LinearOpMode {


    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();

    private Robot myself = new Robot();

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        myself.initHW(hardwareMap);
        waitForStart();

        runtime.reset();

//      myself.DriveByInches(200);
//      myself.DriveByInches(-200);

//      myself.Drive(1);
//      myself.wait(1000);
//      myself.StopDrive();
//
//      myself.ArcRight(1, 0.2,1000);
//      myself.ArcLeft(1, 0.2, 2000);
//      myself.ArcRight(1, 0.2,1000);


        myself.ArcRight(1, 0.4,4000);

        myself.Drive(1);
        myself.wait(3000);
        myself.StopDrive();
        
        myself.ArcLeft(1, 0.4,4000);


    }}
