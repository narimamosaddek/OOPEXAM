package oopExam;

/*
 * Regular Class is a blueprint from which individual objects are created.
 * Inside a regular class, variable can be declared or initialized.
 * Method only implemented inside regular class, but not declared or defined.
 * Contains only non abstract methods or implemented method, doesn't contain abstract methods.
 * Default methods are Not allowed in regular class.
 * Implements and extends keyword is used for inheritance.
 * A regular class can inherit only one (regular class or one abstract class) by extends keyword.
 * A regular class can't inherit an Interface by extends keyword.
 * A Regular class can inherit Interface by Implement keyword.
 * A regular class can inherit more than one Interface.
 * A regular class cannot inherit a regular class or abstract class by implements keyword.
 */

public class Iphone1 extends AppleWatch implements Phone {

	public float version;
	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;

	public int getPrice() {
		return price;
	}

	public String getInfo() {
		return info;
	}

	public char getUser() {
		return user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	public Iphone1() {
	}

	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
	}

	public void regularClassInfo() {
		System.out.println("Regular class can be instantiated but Interface and Abstract Class cannot be instantiated"
				+ "\nBut by the help of a concrete class, an Interface or an Abstract class be instantiated"
				+ "\nA regular class can inherit only one (regular class or one abstract class) by extends keyword but cannot inherit an Interface by extends keyword"
				+ "\nA regular class can inherit more than one Interface by Implement keyword"
				+ "\nA regular class cannot inherit a regular class or abstract class by implements keyword");
	}

	public void youtube() {
		System.out.println(
				"The original operating system for the original iPhone 1, iPhone OS 1 featured  a dedicated YouTube app called 'YouTube of mobile'");
	}

	@Override
	public void pagerInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void wakitokiInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void watchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void digitalWatchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

}
