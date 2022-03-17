import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calctest {

	@Test
	void test() {
		Calc calc = new Calc();
		
		int resultPlus = calc.Plus(5,5);
		int resultMinus = calc.Minus(5,5);
		int resultMul = calc.Mul(5,5);
		int resultDiv = calc.Div(5,0);
		
		System.out.println("resultPlus : " + resultPlus);
        
        System.out.println("resultMinus : " + resultMinus);
        
        System.out.println("resultMul : " + resultMul);
        
        System.out.println("resultDiv : " + resultDiv);
		
	}

}
