package main;
public class Bytetype2 {
	public static void main(String[] args) {
		byte minus = -128;
		byte plus = 127;
		
		System.out.println("> minus(-128) : " + minus);
		System.out.println("> plus(127) : " + plus);
		
		byte plusone = (byte)(plus + 1);
		System.out.println("> plusone(127+1) : " + plusone);
		
		byte minusone = (byte)(minus-1);
		System.out.println("> minusone(-128-1):" + minusone);
		
		byte minusplus = (byte)(minus+1);
		System.out.println("> minusplus(-128+1):" + minusplus);
		
	}

}
