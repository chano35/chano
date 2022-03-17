package statics;

public class SeriesMain2 {

	public static void main(String[] args) {
		Series lg = new Series("LG");
		lg.makeModel();
		info(lg);
		
		Series ss = new Series("SAMSUNG","SZ");
		ss.makeModel();
		info(ss);
		
	}
	
	static void info(Series series) {
	
		System.out.println(series.getPid());
		System.out.println("model : " + series.getModel());
		System.out.println("nation : " + series.getNation());
		System.out.println("lastno : " + series.getLastno());
		System.out.println();
		
		
	}
}