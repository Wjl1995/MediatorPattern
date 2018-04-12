package DangdangNet;

public abstract class Notice {
	
	protected String message;
	
	public void noticeDangdang(Notice notice)
	{
		DangdangNet.getInstance().executeNotice(notice);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
