package client;

import com.diplab.serializableDevice.SerializableDevice124;
import com.diplab.serializableDevice.SerializableDevice129;
import com.diplab.serializableDevice.SerializableDevice131;
import com.diplab.serializableDevice.SerializableDevice135;
import com.diplab.webservice.Device124;
import com.diplab.webservice.Device129;
import com.diplab.webservice.Device131;
import com.diplab.webservice.Device135;

public class TurnOffAnyThing {

	public static void main(String[] args) throws InterruptedException {
		Device131 device131 = SerializableDevice131
				.getInstanceOfSerializableDevice131();
		device131.alertoff();
		device131.off();

		Device129 device129 = SerializableDevice129
				.getInstanceOfSerializableDevice129();
		device129.off();

		Device124 device124 = SerializableDevice124
				.getInstanceOfSerializableDevice124();
		device124.off();
		device124.alertoff();

		Device135 device135 = SerializableDevice135
				.getInstanceOfSerializableDevice135();
		device135.off();
	}
}
