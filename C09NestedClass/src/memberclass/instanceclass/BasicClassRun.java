package memberclass.instanceclass;

public class BasicClassRun {

	public static void main(String[] args) {
		BasicClass basic = new BasicClass();
		basic.printBasic();
		
		BasicClass.NestedClass basicNested = basic.new NestedClass();
		basicNested.printNested();
	}

}