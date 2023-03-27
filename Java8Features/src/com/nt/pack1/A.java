package com.nt.pack1;

@FunctionalInterface
interface A {

	public void m1();

}

interface B extends A {

	//////// public void m1(); ///if you write this method here it is also valid

	//// public void m2(); ///100% invalid.........

}