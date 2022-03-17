
//[입장료 계산]
//성인 6500
//경로 1000
//학생 4500
//유아 2000
//단체 : DC : 10인이산 10%, 20인이상 20%, ... 90인이상 90%

public class ExerciseIF01 {
	
	final static int FEE_ADULT = 6500;
	final static int FEE_SENIOR = 1000;
	final static int FEE_STUDENT = 4500;
	final static int FEE_INFANCY = 2000;
	
	
	int adult;
	int senior;
	int student;
	int infancy;
	int group;
	float dc;
	int total;
	float amt;
	
	public void calc () {
		this.total += this.adult * ExerciseIF01.FEE_ADULT;
		this.total += this.senior * ExerciseIF01.FEE_SENIOR;
		this.total += this.student * ExerciseIF01.FEE_STUDENT;
		this.total += this.infancy * ExerciseIF01.FEE_INFANCY;
		
		if(this.group >= 90) {
			this.dc = 0.9F;
		}else if (this.group >= 10) {
			this.dc = (int)(this.group /10) /10.0F;
			
		}
		this.amt = this.total - (this.total * this.dc);
		
		
	}
	
	public void print() {
		System.out.println("[입장료]");
		System.out.printf("\t 성인 : %d, %d\n", this.adult, this.adult * ExerciseIF01.FEE_ADULT);
		System.out.printf("\t 경로 : %d, %d\n", this.senior, this.senior * ExerciseIF01.FEE_SENIOR);
		System.out.printf("\t 학생 : %d, %d\n", this.student, this.student * ExerciseIF01.FEE_STUDENT);
		System.out.printf("\t 유아 : %d, %d\n", this.infancy, this.infancy * ExerciseIF01.FEE_INFANCY);
		System.out.printf("\t 단체 : %d\n", this.group);
		System.out.printf("\t 할인 : %f\n", this.dc);
		System.out.printf("=======================");
		System.out.printf("\t 금액 : %d\n", this.total);
		System.out.printf("\t 합계 : %f\n", this.amt);
	}
	
	public static void main (String ar[]) {
		ExerciseIF01 enter = new ExerciseIF01(1,2,3,4);
		enter.print();
	}
	
	public ExerciseIF01(int adult, int senior, int student, int infancy) {
		this.adult = adult;
		this.senior = senior;
		this.student = student;
		this.infancy = infancy;
		this.group = adult + senior + student + infancy;
		calc();
	}

}













