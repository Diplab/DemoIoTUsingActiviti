nohup sudo mvn install exec:java -DskipTests -Dexec.mainClass=com.diplab.webservice.Device137 > my.log 2>&1&
echo $! > save_pid.txt

