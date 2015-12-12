package com.diplab.device;

public class RunLIRC {

	static enum Function {
		KEY_PLAY, KEY_F10, KEY_F11, KEY_F12, KEY_F13, KEY_F14, KEY_F15, KEY_F16, KEY_F17, KEY_F18, KEY_F19, KEY_F20, KEY_FN_F2, KEY_FN_F3, KEY_FN_F4, KEY_FN_F5, KEY_FN_F8, KEY_FN_F10, KEY_FN_F12, KEY_FN_ESC, KEY_AGAIN, KEY_POWER, cooler
	}

	public static void ACstateAgain() {
		exec(Function.KEY_AGAIN);
	}

	public static void blast() {
		runIrsend("/home/pi/lircd2.conf", "KEY_POWER");
	}

	public static void cooler() {
		runIrsend("cooler", "cooler");
	}

	public static void executeAC() {
		exec(Function.KEY_PLAY);
	}

	public static void setACtemperature20() {
		exec(Function.KEY_F10);
	}

	public static void setACtemperature21() {
		exec(Function.KEY_F11);
	}

	public static void setACtemperature22() {
		exec(Function.KEY_F12);
	}

	public static void setACtemperature23() {
		exec(Function.KEY_F13);
	}

	public static void setACtemperature24() {
		exec(Function.KEY_F14);
	}

	public static void setACtemperature25() {
		exec(Function.KEY_F15);
	}

	public static void setACtemperature26() {
		exec(Function.KEY_F16);
	}

	public static void setACtemperature27() {
		exec(Function.KEY_F17);
	}

	public static void setACtemperature28() {
		exec(Function.KEY_F18);
	}

	public static void setACtemperature29() {
		exec(Function.KEY_F19);
	}

	public static void setACtemperature30() {
		exec(Function.KEY_F20);
	}

	public static void setACtime10() {
		exec(Function.KEY_FN_F10);
	}

	public static void setACtime12() {
		exec(Function.KEY_FN_F12);
	}

	public static void setACtime2() {
		exec(Function.KEY_FN_F2);
	}

	public static void setACtime3() {
		exec(Function.KEY_FN_F3);
	}

	public static void setACtime4() {
		exec(Function.KEY_FN_F4);
	}

	public static void setACtime5() {
		exec(Function.KEY_FN_F5);
	}

	public static void setACtime8() {
		exec(Function.KEY_FN_F8);
	}

	public static void setACtimeclear() {
		exec(Function.KEY_FN_ESC);
	}

	private static void runIrsend(String name, String command) {
		try {
			Runtime runtime = Runtime.getRuntime();
			Process process = runtime.exec(new String[] { "/usr/bin/irsend",
					"SEND_ONCE", name, command });
			int exitValue = process.waitFor();
			System.out.println("exit value: " + exitValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void exec(Function fn) {
		runIrsend("/home/pi/lircd.conf", fn.name());
	}

}
