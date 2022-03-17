package creat;

public class CreateInstanceCommandLine {

	public static void main(String[] args) {
		CreateInstance cmdline = CreateInstance.createInstance(args);
		if(cmdline != null) {
			cmdline.print();
		}
		else {
			System.out.println("잘못된 파라미터를 전달했습니다.(cmdline)");
		}
		
	}

}
