package com.diplab.db;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SensorMapper {

	@Results({ @Result(property = "device", column = "DEVICE"),
			@Result(property = "type", column = "TYPE"),
			@Result(property = "data", column = "DATA"),
			@Result(property = "time", column = "TIME") })
	@Options(keyColumn = "RANK", keyProperty = "rank", useGeneratedKeys = true)
	@Insert("INSERT INTO SENSOR (DEVICE ,TYPE ,DATA ,TIME) VALUES (#{device},#{type},#{data},#{time})")
	void insert(Sensor sensor);

	@Select("SELECT * from SENSOR WHERE RANK = #{rank}")
	Sensor selectSensor(int rank);

	@Select("SELECT ISNULL(AVG(DATA), -1)  FROM SENSOR WHERE TYPE = #{type} and Device = #{device} AND DATEDIFF('MINUTE', TIME, NOW() )  < 60")
	float selectAvg(@Param("type") String type, @Param("device") String device);

	@Select("SELECT ISNULL(AVG(DATA), -1)  FROM SENSOR WHERE TYPE = #{type} and Device = #{device} AND DATEDIFF('MINUTE', TIME, NOW() )  < #{min}")
	float selectAvgByTime(@Param("type") String type,
			@Param("device") String device, @Param("min") int min);

	@Select("SELECT ISNULL(MAX(DATA),-1) FROM SENSOR WHERE TYPE = #{type} and Device = #{device} AND DATEDIFF('MINUTE', TIME, NOW() )  < #{min}")
	float selectMaxByTime(@Param("type") String type,
			@Param("device") String device, @Param("min") int min);

	@Delete("DELETE FROM SENSOR WHERE RANK =#{rank}")
	void delete(int rank);

	@Update("UPDATE SENSOR SET DEVICE=#{device}, TYPE=#{type}, DATA=#{data}, TIME=#{time}  WHERE RANK =#{rank}")
	void update(Sensor sensor);

}
