package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Robot {
    private final double InchesPerSecond = .33;
    private boolean moving;

    RobotHardware myself = new RobotHardware();

    public void initHW(HardwareMap ahw){
        myself.init(ahw);
    }

    public void initRobot(){

        moving = false;
    }

    public void Drive(double p) {
        myself.leftFrontDrive.setPower(-p);
        myself.rightFrontDrive.setPower(-p);
        myself.leftBackDrive.setPower(-p);
        myself.rightBackDrive.setPower(-p);
    }

    public void StopDrive() {
        myself.leftFrontDrive.setPower(0);
        myself.rightFrontDrive.setPower(0);
        myself.leftBackDrive.setPower(0);
        myself.rightBackDrive.setPower(0);
    }

    public void SpinRight(double p) {
        myself.leftFrontDrive.setPower(p);
        myself.rightFrontDrive.setPower(-p);
        myself.leftBackDrive.setPower(p);
        myself.rightBackDrive.setPower(-p);
    }

    public void SpinLeft(double p) {
        myself.leftFrontDrive.setPower(-p);
        myself.rightFrontDrive.setPower(p);
        myself.leftBackDrive.setPower(-p);
        myself.rightBackDrive.setPower(p);
    }

    public void RightDrive(double p) {
        myself.leftFrontDrive.setPower(p);
        myself.rightFrontDrive.setPower(0);
        myself.leftBackDrive.setPower(p);
        myself.rightBackDrive.setPower(0);
    }

    public void LeftDrive(double p) {
        myself.leftFrontDrive.setPower(0);
        myself.rightFrontDrive.setPower(p);
        myself.leftBackDrive.setPower(0);
        myself.rightBackDrive.setPower(p);
    }

    public void wait(int sleeptime) {
        ElapsedTime timer =  new ElapsedTime();
        timer.reset();
        while (timer.milliseconds() < sleeptime) {

        }
    }

    public void ArcRight(double p, double deg, int runTime){
        final double mP = p - deg;
        myself.leftFrontDrive.setPower(-mP);
        myself.rightFrontDrive.setPower(-p);
        myself.leftBackDrive.setPower(-mP);
        myself.rightBackDrive.setPower(-p);
        wait(runTime);
        StopDrive();

    }

    public void ArcLeft(double p, double deg, int runTime){
        final double mP = p - deg;
        myself.leftFrontDrive.setPower(-p);
        myself.rightFrontDrive.setPower(-mP);
        myself.leftBackDrive.setPower(-p);
        myself.rightBackDrive.setPower(-mP);
        wait(runTime);
        StopDrive();
    }

    public void DriveByInches( int inches) {
        moving = true;
        double power = 1;
        double waitTime = 0.00;
        if (inches > 0) {
            power = power * -1;
            waitTime = inches * InchesPerSecond;
            myself.leftFrontDrive.setPower(power);
            myself.leftBackDrive.setPower(power);
            myself.rightFrontDrive.setPower(power);
            myself.rightBackDrive.setPower(power);
        } else {
            waitTime = -inches * InchesPerSecond;
            myself.leftFrontDrive.setPower(power);
            myself.leftBackDrive.setPower(power);
            myself.rightFrontDrive.setPower(power);
            myself.rightBackDrive.setPower(power);
        }
        ElapsedTime timer =  new ElapsedTime();
        timer.reset();
        while (timer.milliseconds() < (waitTime* 100)) {

        }
        myself.leftFrontDrive.setPower(0);
        myself.leftBackDrive.setPower(0);
        myself.rightFrontDrive.setPower(0);
        myself.rightBackDrive.setPower(0);
        moving = false;

    }
}