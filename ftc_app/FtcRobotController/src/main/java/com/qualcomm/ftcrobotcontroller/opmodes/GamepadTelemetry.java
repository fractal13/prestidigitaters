/* */

package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import java.lang.String;

/**
 * TeleOp Mode
 * <p>
 * Reads gamepad data and displays it
 */
public class GamepadTelemetry extends OpMode {
	
	/**
	 * Constructor
	 */
	public Gamepad() {
	    // empty
	}

	/*
	 * Code to run when the op mode is initialized goes here
	 * 
	 * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#init()
	 */
	@Override
	public void init() {
	    // empty
	}

	/*
	 * This method will be called repeatedly in a loop
	 * 
	 * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#run()
	 */
	@Override
	public void loop() {
	    String ls = String.format("LS: %d %4.2f %4.2f",
				      gamepad1.left_stick_button,
				      gamepad1.left_stick_x,
				      gamepad1.left_stick_y);
	    String rs = String.format("RS: %d %4.2f %4.2f",
				      gamepad1.right_stick_button,
				      gamepad1.right_stick_x,
				      gamepad1.right_stick_y);
	    String dp = String.format("DP: %d %d %d %d",
				      gamepad1.dpad_up,
				      gamepad1.dpad_down,
				      gamepad1.dpad_left,
				      gamepad1.dpad_right);
	    String bn = String.format("BN: %d %d %d %d",
				      gamepad1.a,
				      gamepad1.b,
				      gamepad1.x,
				      gamepad1.y);
	    String mb = String.format("MB: %d %d %d %d",
				      gamepad1.back,
				      gamepad1.guide,
				      gamepad1.start);
	    String tr = String.format("TR: %d %4.2f %d %4.2f",
				      gamepad1.left_bumper,
				      gamepad1.left_trigger,
				      gamepad1.right_bumper,
				      gamepad1.right_trigger);

	    
	    telemetry.addData("Text", "*** Gamepad1 Data***");
	    telemetry.addData("Text", ls);
	    telemetry.addData("Text", rs);
	    telemetry.addData("Text", dp);
	    telemetry.addData("Text", bn);
	    telemetry.addData("Text", mb);
	    telemetry.addData("Text", tr);
	}

	/*
	 * Code to run when the op mode is first disabled goes here
	 * 
	 * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#stop()
	 */
	@Override
	public void stop() {
	    // empty
	}

}
