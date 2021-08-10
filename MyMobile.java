package week1.day2;

public class MyMobile {

	String makeCall;
	String sendMsg;
	long payBill;

	public void makeCall() {
		System.out.println("Making calls");
	}

	public void sendMsg() {
		System.out.println("Sending msgs");
	}

	private void payBill() {
		System.out.println("Making payments");
	}

	public static void main(String[] args) {

		MyMobile mobObj = new MyMobile();

		mobObj.makeCall();
		mobObj.sendMsg();
		mobObj.payBill();

	}

}
