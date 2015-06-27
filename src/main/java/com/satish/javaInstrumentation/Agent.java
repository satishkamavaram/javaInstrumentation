package com.satish.javaInstrumentation;

import java.lang.instrument.Instrumentation;
/**
 * 
 * @author satishkamavaram
 *
 */
public class Agent {
	public static void premain(String agentArgs, Instrumentation inst) {
        inst.addTransformer(new CustomClassFileTransformer());
    }

}
