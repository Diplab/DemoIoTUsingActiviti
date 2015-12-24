nohup mvn exec:java -DskipTests -Dexec.mainClass=com.diplab.process.PressureTest > my.log 2>&1&
echo $! > save_pid.txt