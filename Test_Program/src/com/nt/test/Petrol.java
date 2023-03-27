package com.nt.test;

/*
 * public class Petrol {
 * 
 * void consume() {
 * 
 * 
 * }
 * 
 * } class Car{
 * 
 * private Petrol petrol; private Engine engine;
 * 
 * Car(Engine engine){
 * 
 * this.engine=engine; } void start() {
 * 
 * engine.start();
 * 
 * }
 * 
 * 
 * } class Engine{ private Car car; Engine(Car car){
 * 
 * this.car=car; } void start() {
 * 
 * 
 * Car.Petrol.consume(); }
 * 
 * 
 * 
 * }
 *                                                   o/p  ====Error  Petrol has private access in Car
 */

public class Petrol {

	void consume() {

		System.out.println(" Petrol class consume() method executed successfully ");

	}

}

class Car {

	private Petrol petrol;

	// inner class start
	class Engine {

		private void start() {

			System.out.println("inner class Engine  start() executed");

			petrol.consume();
		}
	}
	// inner class close

	void start() {

		System.out.println("Outer class Car start() method executed ");

		Engine engine = new Engine();
		engine.start();

	}

	public static void main(String[] args) {

	}

}
