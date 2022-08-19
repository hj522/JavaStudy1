package chapter20.memo;

public class MemoApplication { //얘를 호출하면 내가 만들었던 view가 보임
	public static void main(String[] args) throws Exception {
		new MemoView().init(new MemoController());
	}
}
