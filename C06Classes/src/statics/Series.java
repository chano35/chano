/*
 * final 필드
 *  - 초기값이 저장되면 최종적인 값이 되어서
 *    프로그램 실행 도중에 수정할 수 없다.
 *  - 선언할 때 초기값을 지정하지 않는 경우
 *    생성자에서 지정을 해야 한다.
 *  - final field는 readonly(읽기 전용)
 *  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *  static final : 상수(constant)
 *  - 변수인데 값을 변경시킬 수 없다.
 *  - 선언할 때 초기값을 지정해야 한다.
 *  - 관행적으로 변수이름은 대문자로 기술한다.
 *  - static(정적), final(수정할 수 없음)
 */
package statics;
 

public class Series {
	static final int MIN_SERIES = 1;
	static final int MAX_SERIES = 10;	//상수
	static int series = 0;
	
	final String nation = "Korea";	// 선언할 때 초기값을 지정하는 경우
	final String lastno;			// 선언할 때 초기값을 지정하지 않는 경우
	
	String pid;		// 제품ID
	String model;	// 모델명
	
	Series (String pid) {
		this.pid = pid;
		this.lastno = "XZ";			//final 필드
	}
	
	Series (String pid, String lastno) {
		this.pid = pid;
		//final이지만 초기값이 아직 지정되지 않았기 때문에 반드시 초기값을 지정 해야 한다.
		this.lastno = lastno;		//final 필드
		//final이고 초기값이 이미 지정되었기 때문에 바꿀 수 없다.
		// this.nation="USA";
	}
	
	String makeModel() {
		String strSeries = String.valueOf(Series.getSeries());
		this.model = pid + "-SERIES-" + strSeries;
		return this.model;
	}

	public static int getSeries() {
		if(++Series.series > Series.MAX_SERIES) {	
			Series.series = MIN_SERIES;
		}
		return Series.series;
	}

	public static void setSeries(int series) {
		Series.series = series;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

/*
	public String setNation() {
		this.nation = nation;
	}
*/
	
	public String getNation() {
		return nation;
	}

	public String getLastno() {
		return lastno;
	}

}
