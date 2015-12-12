nohup sudo mvn install exec:java -DskipTests -Dexec.mainClass=com.diplab.webservice.Device133 > my.log 2>&1&
echo $! > save_pid.txt

