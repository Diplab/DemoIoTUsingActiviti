package com.diplab.db;

import static org.junit.Assert.fail;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SensorMapperTest {
	ClassPathXmlApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("BeansForTest.xml");
	}

	@Test
	public void testInsert() {

		SqlSession session = context.getBean(SqlSession.class);
		SensorMapper mapper = session.getMapper(SensorMapper.class);
		Sensor sensor = new Sensor("Device129", "CO2", 500, new Date());
		mapper.insert(sensor);
		session.commit();
		System.out.println(sensor.getRank());
		Assert.assertTrue(sensor.getRank() != 0);
	}

	@Test
	public void testSelectAVG() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		SqlSession session = context.getBean(SqlSession.class);
		SensorMapper mapper = session.getMapper(SensorMapper.class);
		Sensor sensor = new Sensor("Device129", "CO2", 500, new Date());
		mapper.insert(sensor);
		session.commit();

		Sensor sensorGet = mapper.selectSensor(sensor.getRank());
		session.commit();
		Assert.assertNotNull(sensorGet);

		mapper.delete(sensor.getRank());
		session.commit();

		sensorGet = mapper.selectSensor(sensor.getRank());
		session.commit();
		Assert.assertNull(sensorGet);
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	public static void main(String[] args) throws Exception {
		SensorMapperTest test = new SensorMapperTest();
		test.setUp();
		// System.out.println(test.mapper.selectAVG("CO", "Device129"));

	}

}
