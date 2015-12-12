package com.diplab.serviceImp;

import com.diplab.device.RunLIRC;
import com.diplab.service.ACService;

public class ACServiceImpl implements ACService {

	@Override
	public void executeAC() {
		RunLIRC.executeAC();
		return;

	}

}
