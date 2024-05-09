package oopExam;

public class Iphone6 extends Iphone5 {

	public void compass() {
		System.out.println("Compasses are mainly used in navigation to find direction on the earth."
				+ "\nThis works because the Earth itself has a magnetic field which is similar to that of a bar magnet"
				+ "\nThe compass needle aligns with the Earth's magnetic field direction and points north-south.");
	}

	/*
	 * When different methods exist with the same method name but with different
	 * parameters or signature, it is called method overloading. Static Polymorphism
	 * or early binding or method overloading or compile time polymorphism: happens
	 * in compile time. When different methods exist with the same method name with
	 * same parameters or signature but with different syntax or logic, it is called
	 * method overriding. Dynamic Polymorphism or late binding or method overriding
	 * or run time polymorphism: happens in Run time. Static binding in Java occurs
	 * during compile time while dynamic binding occurs during runtime. Overloaded
	 * methods are bonded using static binding at compile time while overridden
	 * methods are bonded using dynamic binding at runtime. Method overloaded is
	 * Final type but Method overriding is not. Method overloaded is Static type but
	 * Method overriding is Not But static method can be implemented in child class
	 * without @Override annotation
	 */

	public int ramPrice;
	public int cameraPrice;
	public String processorPrice;
	public int monitorPrice;

	public void material() {
	}

	public int material(int ramPrice) {
		return 0;
	}

	public int material(int ramPrice, String processorPrice) {
		int total = ramPrice + Integer.parseInt(processorPrice);
		return total;
	}

	public void material(int ramPrice, int cameraPrice, int monitorPrice) {
	}

	public static int material(int ramPrice, int monitorPrice) {
		int total2= ramPrice + monitorPrice;
		return total2;
	}

	public final int material(int ramPrice, int cameraPrice, int monitorPrice, String processorPrice) {
		int total3= ramPrice + cameraPrice + monitorPrice + Integer.parseInt(processorPrice);
		return total3;
	}
}
