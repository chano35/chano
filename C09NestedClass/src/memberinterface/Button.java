/*
 * [중첩 인터페이스]
 * - 클래스 안에 인터페이스를 정의
 * - 클래스에 종속된 인터페이스로 한정
 * ------------------------------------------------
 * [버튼]
 * - 버튼이 클릭되면 리스너를 통해서 통보
 * - 버튼 클릭 : 이벤트
 * - 이벤트 : 등록된 리스너에게 통보
 * - 통보 : 약속된 클래스의 멤버 메소드를 호출(콜백)
 */
package memberinterface;

public class Button {
	interface OnClickListener {
		void onClick();
	}
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		if(this.listener != null) {
			this.listener.onClick();
		}
	}

}