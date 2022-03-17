/*
 * [Predicate 함수적 인터페이스]
 * - Predicate<T>     : boolean test(T t)
 * - BiPredicate<T,U> : boolean test(T t, U u)
 * - DoublePredicate  : boolean test(double value)
 * - IntPredicate     : boolean test(int value)
 * - LongPredicate    : boolean test(long value)
 */
package section05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", "남자", 91),
			new Student("김순희", "여자", 90),
			new Student("전우치", "남자", 91),
			new Student("박하나", "여자", 95),
			new Student("고길동", "남자", 92),
			new Student("강아지", "동물", 40),
			new Student("고양이", "동물", 50)
	);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		
		return (double)sum / count;
	}

	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println("남자평균점수:" + maleAvg);

		double femaleAvg = avg(
			(Student t) -> { 
				return t.getSex().equals("여자");
		});
		System.out.println("여자평균점수:" + femaleAvg);

		double aniAvg = avg(new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.getSex().equals("동물");
			}
		});
		System.out.println("동물평균점수:" + aniAvg);

	}

}