# javaInstrumentation
- Instrumenting execution time of all methods in a Test class 
- Used Javassist library to manipulate the Test class bytecode
- Output as below :
className : com/satish/javaInstrumentation/Test
modifying bytecode of method : gotoSleep1s
modifying bytecode of method : gotoSleep10s
className : java/lang/InterruptedException
gotoSleep10s method execution started : 
gotoSleep10s method execution ended : 
 method Executed in ms: 10001
gotoSleep1s method execution started : 
gotoSleep1s method execution ended : 
 method Executed in ms: 1000
className : java/lang/Shutdown
className : java/lang/Shutdown$Lock
