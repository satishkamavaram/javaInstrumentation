# javaInstrumentation
- Instrumenting execution time of all methods in a Test class 
- Used Javassist library to manipulate the Test class bytecode
- Output as below :<br>
className : com/satish/javaInstrumentation/Test<br>
modifying bytecode of method : gotoSleep1s<br>
modifying bytecode of method : gotoSleep10s<br>
className : java/lang/InterruptedException<br>
gotoSleep10s method execution started : <br>
gotoSleep10s method execution ended : <br>
 method Executed in ms: 10001<br>
gotoSleep1s method execution started : <br>
gotoSleep1s method execution ended : <br>
 method Executed in ms: 1000<br>
className : java/lang/Shutdown<br>
className : java/lang/Shutdown$Lock<br>
