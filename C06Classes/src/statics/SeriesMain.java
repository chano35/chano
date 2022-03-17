package statics;

public class SeriesMain {

	public static void main(String[] args) {
		Series lg = new Series("LG");
		String lgmodel = lg.makeModel();
		System.out.println("[LG] model : " + lgmodel);
		
		Series ss = new Series("SAMSUNG");
		String ssmodel = ss.makeModel();
		System.out.println("[SS] model : " + ssmodel);
		
		
	}
}