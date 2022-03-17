/*
 * 시리즈 pid를 배열로 해서 10이상을 만들어
 * 반복문(for, while, do~while)으로 작성하여
 * 시리즈 번호가 반복되는 것을 확인
 */
package statics;

public class SeriesMain3 {
	static final String[] BRANDS= {
			"LG", "SAMSUNG", "HP", "IBM", "APPLE", "NAVER",
			"DAUM", "쿠팡", "티몬", "요기요", "다나와", "지마켓"
	};

	public static void main(String[] args) {
		for(String brand : BRANDS) {
			Series series = new Series(brand);
			series.makeModel();
			info(series);
		}
	}
	
	static void info(Series series) {
	
		System.out.println(series.getPid());
		System.out.println("model : " + series.getModel());
		System.out.println("nation : " + series.getNation());
		System.out.println("lastno : " + series.getLastno());
		System.out.println();
		
		
	}
}