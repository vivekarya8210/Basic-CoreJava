///Functional interface contain only one Abstarct method  but you can take n number of default method and static method in Functional Interface on java-8 onwards

package com.nt.pack2;

@FunctionalInterface
public interface Interf {

	public void m1();

	default void m2() {

	}

	public static void m3() {

	}

}
