package people;

public class PeopleRun2 {

	public static void main(String[] args) {
		Brother brother = new Brother("돌쇠");
		Sister sister = new Sister("공주");
		
		brother.work();
		sister.work();
		sister.childbirth(5);
		sister.childbirth(5);
		
		// brother.childbirth(10);
		// sister.hunt();

		brother.hunt();
		
	}

}