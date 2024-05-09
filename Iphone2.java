package oopExam;

public class Iphone2 extends Iphone1 {

	public char userOfIphone = 'M';

	public Iphone2() {
	}

	public Iphone2(char Model) {
		super();
		super.setInfo("This is about iPhone2");
	}

	public void iPhone2Info() {
		super.version = 1.8f;
	}

	public void dropBox() {
		System.out.println("DropboxStore, share, and access files across devices."
				+ "\nDash (beta)Quickly find, organize, and share work content."
				+ "ReplayReview and approve videos faster"
				+ "\nDocSendSend documents securely and track activity.");
	}

}
