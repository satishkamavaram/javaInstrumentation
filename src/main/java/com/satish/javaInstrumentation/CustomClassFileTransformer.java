package com.satish.javaInstrumentation;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

/**
 * 
 * @author satishkamavaram
 *
 */
public class CustomClassFileTransformer implements ClassFileTransformer {

	@Override
	public byte[] transform(ClassLoader loader, String className,
			Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
			byte[] classfileBuffer) throws IllegalClassFormatException {
		
		 byte[] byteCode = classfileBuffer;
		 System.out.println("className : "+className);
		 if(className.equals("com/satish/javaInstrumentation/Test")){
		 try {
	                ClassPool cp = ClassPool.getDefault();
	                CtClass cc = cp.get(cp.getClass().getName());
	               
	                CtMethod[] methods = cc.getDeclaredMethods();
	                if(methods!=null){
	                	for(CtMethod m : methods){
	                		System.out.println("modifying bytecode of method : "+m.getName());
	                		        m.addLocalVariable("totalTime", CtClass.longType);
					                m.insertBefore("totalTime = System.currentTimeMillis();");
					                m.insertAfter("{totalTime = System.currentTimeMillis() - totalTime;"
					                		+ "System.out.println(\" method Executed in ms: \" + totalTime);}");
	                	}
	                }
	                byteCode = cc.toBytecode();
	                cc.detach();
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	}
	        return byteCode;
	
	}

}
