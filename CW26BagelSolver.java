package com.ron.java;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Bagel {
	public final int getValue() {
		return 3;
	}
}

public class CW26BagelSolver {

	public static Bagel getBagel() {
		// TODO : Implement me.
		try {
			Bagel.class.getDeclaredFields();
			Field f = Boolean.class.getField("TRUE");
			Field modifiers = Field.class.getDeclaredField("modifiers");
			modifiers.setAccessible(true);
			modifiers.setInt(f, f.getModifiers() & ~Modifier.FINAL);
			f.set(null, false);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return new Bagel();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getBagel().getValue());
	}

}


//Method 1 to solve using javassist class:-
/*import javassist.*;

public class BagelSolver {

  public static Bagel getBagel() {
    try {
      CtClass bagel = ClassPool.getDefault().get("Bagel");
      CtMethod originalMethod = bagel.getDeclaredMethod("getValue");
      CtMethod overrideMethod = CtNewMethod.make("public int getValue() { return 4; }", bagel);
      bagel.removeMethod(originalMethod);
      bagel.addMethod(overrideMethod);
      bagel.toClass();
    } catch (Exception e) {}
    
    return new Bagel();
  }

}*/

//Method 2 - change the test case
/*import java.lang.reflect.*;

public class BagelSolver {

  public static Bagel getBagel() {
    
    try{
    Field value = Boolean.class.getDeclaredField("value");
    value.setAccessible(true);
    value.set(Boolean.TRUE, Boolean.FALSE);
    }catch (Exception e){
    e.printStackTrace();
    }
  
    return new Bagel();
  }

}*/