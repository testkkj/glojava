package extra.chap11_03_reflect;

import example.chap11_06_03.Action;

public class SendAction implements Action {

	String data;

	@Override
	public void execute() {
		System.out.println(data+"데이터 보냅니다.");
		
	}
	
	public SendAction(String data) {
		this.data = data;
	}

}
