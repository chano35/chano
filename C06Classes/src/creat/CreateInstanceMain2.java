package creat;

public class CreateInstanceMain2 {

	public static void main(String[] args) {
		System.out.println("CreateInstanceMain2");
		
		if(args.length < 3) {
			return;
		}
		
		String config = args[0];
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		int z = 0;
		
		if(config.equals("plus")) {
			z = x + y;	
		}
		else if(config.equals("minus")) {
			z = x - y;
		}
		
		CreateInstance2 ci = new CreateInstance2(x, y, z);
		ci.print();
	}

}
