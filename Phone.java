package oopExam;

/*
 * Interface is a Blueprint of Class.
 * Interface names starts with UpperCase 
 * They follow Camel case or Snake case pattern.
 * An interface is a collection of methods that are defined (declared) but not implemented.
 * Interface cannot be instantiated (cannot create object).
 * Interface doesn't have method body like classes.
 * Inside Interface, variable can not be declared, we must have to initialize.
 * The variables inside Interface are final and static in nature.
 * This is not mandatory to put abstract keyword with the abstract method inside Interface.
 * An Interface can't inherit a regular class or an abstract class by extends keyword.
 * An Interface can inherit more than one Interface (separated by comma) by extends keyword.
 * From 1.8 version JAVA implemented static and default type methods in interface.
 * Default and Static type methods are implemented inside Interface.
 */

public interface Phone extends Pager, Wakitoki {
	public static final int phoneBill = 1000;
	// Interfaces cannot have constructors

	public void interfaceInfo();

	public abstract void call();

	public void message();

	public void camera();

	public default void battery() {
		System.out.println("Battery is a Default type method from Java 1.8 version");
	}

	public static void wireless() {
		System.out.println("Wireless is Static type method from Java 1.8 version");
	}

}
