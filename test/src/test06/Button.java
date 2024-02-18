package test06;

public class Button {
	OnClickListener listener;
	
	public void setOnclickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}
}
