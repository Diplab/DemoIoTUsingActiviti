package com.diplab.serviceImp;

import com.diplab.device.RunLIRC;
import com.diplab.service.ACService;

public class ACServiceImpl implements ACService {

	@Override
	public void executeAC() {
		RunLIRC.executeAC();
		return;

	}

	@Override
	public void setACtemperature(int temp) {
		switch (temp) {
		case 20:
			RunLIRC.setACtemperature20();
			break;
		case 21:
			RunLIRC.setACtemperature21();
			break;
		case 22:
			RunLIRC.setACtemperature22();
			break;
		case 23:
			RunLIRC.setACtemperature23();
			break;
		case 24:
			RunLIRC.setACtemperature24();
			break;
		case 25:
			RunLIRC.setACtemperature25();
			break;
		case 26:
			RunLIRC.setACtemperature26();
			break;
		case 27:
			RunLIRC.setACtemperature27();
			break;
		case 28:
			RunLIRC.setACtemperature28();
			break;
		case 29:
			RunLIRC.setACtemperature29();
			break;
		case 30:
			RunLIRC.setACtemperature30();
			break;

		default:
			RunLIRC.ACstateAgain();
			break;
		}
	}

	@Override
	public void setACtime(int hour) {
		switch (hour) {

		case 2:
			RunLIRC.setACtime2();
			break;
		case 3:
			RunLIRC.setACtime3();
			break;
		case 4:
			RunLIRC.setACtime4();
			break;
		case 5:
			RunLIRC.setACtime5();
			break;
		case 8:
			RunLIRC.setACtime8();
			break;
		case 10:
			RunLIRC.setACtime10();
			break;
		case 12:
			RunLIRC.setACtime12();
			break;

		default:
			RunLIRC.setACtimeclear();
			break;
		}
	}

	@Override
	public void blast() {
		RunLIRC.blast();
	}

	@Override
	public void cooler() {
		RunLIRC.cooler();
	}

}
