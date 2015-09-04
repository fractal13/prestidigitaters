/* Copyright (c) 2014 Qualcomm Technologies Inc

All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted (subject to the limitations in the disclaimer below) provided that
the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list
of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.

Neither the name of Qualcomm Technologies Inc nor the names of its contributors
may be used to endorse or promote products derived from this software without
specific prior written permission.

NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. */

package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.Servo;
// import com.qualcomm.robotcore.util.Range;

/**
 * TeleOp Mode
 * <p>
 * Enables control of the robot via the gamepad
 */
public class AutonomousSquare extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor motorRight1;
        DcMotor motorRight2;
        DcMotor motorLeft1;
        DcMotor motorLeft2;

        motorRight1 = hardwareMap.dcMotor.get("motor_2");
        motorRight2 = hardwareMap.dcMotor.get("motor_3");
        motorLeft1 = hardwareMap.dcMotor.get("motor_1");
        motorLeft2 = hardwareMap.dcMotor.get("motor_4");
        motorLeft1.setDirection(DcMotor.Direction.REVERSE);
        motorLeft2.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        for (int i = 0; i < 4; i++) {
            motorRight1.setPower(1.0);
            motorRight2.setPower(1.0);
            motorLeft1.setPower(1.0);
            motorLeft2.setPower(1.0);
            sleep(1000);

            motorLeft1.setPower(0.5);
            motorLeft2.setPower(0.5);
            motorRight2.setPower(-0.5);
            motorRight1.setPower(-0.5);
            sleep(1000);
        }

        motorLeft1.setPowerFloat();
        motorLeft2.setPowerFloat();
        motorRight1.setPowerFloat();
        motorRight2.setPowerFloat();
    }

}
