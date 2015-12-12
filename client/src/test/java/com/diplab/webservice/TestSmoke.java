package com.diplab.webservice;

public class TestSmoke {
	public static void main(String[] args) {
		Device127 device127Service = new Device127Service().getDevice127Port();
		Device129 device129Service = new Device129Service().getDevice129Port();
		Device135 device135Service = new Device135Service().getDevice135Port();
		Device137 device137Service = new Device137Service().getDevice137Port();
		while (true) {
			try {
				System.out
						.format("127\t%10f\n", device127Service.getSmokePpm());
				System.out
						.format("129\t%10f\n", device129Service.getSmokePpm());
				System.out
						.format("135\t%10f\n", device135Service.getSmokePpm());
				System.out
						.format("137\t%10f\n", device137Service.getSmokePpm());
				System.out.println("========");
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
