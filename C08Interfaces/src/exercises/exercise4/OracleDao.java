package exercises.exercise4;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle Select");
	}

	@Override
	public void insert() {
		System.out.println("Oracle Insert");
	}

	@Override
	public void update() {
		System.out.println("Oracle Update");
	}

	@Override
	public void delete() {
		System.out.println("Oracle Delete");
	}
}