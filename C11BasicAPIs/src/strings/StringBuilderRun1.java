/*
 * StringBuilder: 스트링 생성 처리
 * 1. StringBuilder: 단일 스레드 환경에서 사용할 수 있는 클래스
 * 2. StringBuffer: 멀티 스레드 환경에서 사용할 수 있도록 동기화가 적용된 클래스
 * 3. String: 저장된 문자열을 수정할 수 없다.
 */
package strings;

public class StringBuilderRun1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Programming");
		System.out.println(sb); // Java Programming
		System.out.println("length=" + sb.length()); // length=16
		
		sb.insert(4, '8');
		System.out.println(sb); // Java8 Programming
		
		sb.setCharAt(4, '7');
		System.out.println(sb); // Java7 Programming
		
		sb.replace(5, sb.length(), "Book"); // Java7Book
		System.out.println(sb);
		
		sb.delete(4, 5);
		System.out.println(sb); // JavaBook
		
		String str = sb.toString();
		System.out.println(str);
		
		int pos = sb.indexOf("Book");
		System.out.println("'Book': pos=" + pos); // 'Book': pos=4

		int pox = sb.indexOf("Boox");
		System.out.println("'Boox': pox=" + pox); // 'Boox': pox=-1
		
		// 원본의 내용도 변경
		StringBuilder sbr = sb.reverse();
		System.out.println("reverse:" + sbr); // reverse:kooBavaJ
		System.out.println("source: " + sb);  // source: kooBavaJ

		sb.reverse();
		System.out.println("source: " + sb);  // source: JavaBook
		
		int lastpos = sb.lastIndexOf("Book");
		System.out.println("'Book': lastpos=" + lastpos); // 'Book': lastpos=4
		
		int posa = sb.indexOf("a");		// 앞에서부터 가장 먼저 찾은 문자열 위치를 리턴
		int apos = sb.lastIndexOf("a");	// 뒤에서부터 가장 먼저 찾은 문자열 위치를 리턴
		System.out.println("'a': posa=" + posa); 
		System.out.println("'a': apos=" + apos);
		
		
	}

}