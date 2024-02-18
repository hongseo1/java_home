package test06;

public class ButtnExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnclickListener(new CallLiistener());
		btn.touch();
		btn.setOnclickListener(new MessageListener());
		btn.touch();
	}

}
