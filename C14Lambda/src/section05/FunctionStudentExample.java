package section05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionStudentExample {
	private static List<Student> list = Arrays.asList(
			new Student("황진이", 90, 70),
			new Student("뉴턴", 99, 99),
			new Student("수학왕", 100, 100)
	);
	
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.println(function.apply(student));
		}
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list ) {
			System.out.println(function.applyAsInt(student));
		}
	}
	
	public static void main(String[] args) {
		studentName();
		studentScore();
		
		System.out.println("[학생 이름]");
		printString(t -> t.getName());

		System.out.println("[영어 점수]");
		printInt(t -> t.getEnglish());

		System.out.println("[수학 점수]");
		printInt(t -> t.getMath());
	}
	
	public static void studentName() {
		/*
		System.out.println("[학생 이름]");
		printString(t -> t.getName());
		*/
		
		System.out.println("[학생 이름]");
		Function<Student, String> function = (t) -> { 
			return t.getName();
		};
		
		// printString(Function<Student, String> function)
		for(Student student : list) {
			System.out.println(function.apply(student));
		}
	}
	
	// printInt(ToIntFunction<Student> function)
	public static void studentScore() {
		System.out.println("[영어 점수]");
		ToIntFunction<Student> english = t -> t.getEnglish();
		for(Student student : list ) {
			System.out.println(english.applyAsInt(student));
		}

		System.out.println("[수학 점수]");
		ToIntFunction<Student> math = t -> t.getMath();
		for(Student student : list ) {
			System.out.println(math.applyAsInt(student));
		}
	}
}