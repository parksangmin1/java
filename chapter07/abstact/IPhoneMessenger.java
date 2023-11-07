package chapter07.abstact;

public class IPhoneMessenger extends GraphicIOS implements Messenger {

	
	public String getMessage() {
		
		return "IPhone";
	}

	
	public void setMessage(String msg) {
		System.out.println("iPhone에서 메시지를 설정합니다 : " + msg);
		
	}
	
	public void clearMessage() {
		System.out.println("좌우를 흔들어 문자열을 지웁니다.");
	}

}
