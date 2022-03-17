/*
 * ���� : ���Ǽ� ���� ��ǻ�Ͱ� �߻�
 * double x = Math.random()
 * ���� : 0.0 <= x < 1.0
 * �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
 * [����] 0������ 100�� ������ ������ �߻����Ѽ� ����� �������.
 *  - A : "���� ���л�" �޼����� ���
 *  - B : "�ݾ� ���л�" �޼����� ���
 *  - C, D : "������ ����ϼ���" �޼����� ���
 *  - E : "�� �� ����ϼ���" �޼����� ���
 *  - A ~ E : "�հ�" ���
 *  - F : "����" ���, "�ٽ� �����ϼ���" 
 */
public class IfRandom04 {

		final static int MAX_SCORE = 100; // �ְ�����
		final static int MIN_SCORE = 0;
		final static int MIN_PASS = 60;
		final static int GRADE_A = 95;
		final static int GRADE_B = 90;
		final static int GRADE_C = 80;
		final static int GRADE_D = 70;
		final static int GRADE_E = 60;
		
		public static void main(String[] args) {
			double x = Math.random();
			int score = (int)(x * (MAX_SCORE - MIN_SCORE)) + 1;
					
			System.out.printf("random:(%f)(%d)%n", x, score);
			
			String pass = ""; //�հݿ���
			String msg = ""; //��¸޽���
			char grade = 'x'; //���
			
			if(score >= MIN_PASS && score <=MAX_SCORE) {
				pass = "�հ�";
				if((score >= GRADE_A)) {
					grade = 'A';
					msg = "���� ���л�";
				}
				else if(score >= GRADE_B) {
					grade = 'B';
					msg = "�ݾ� ���л�";
				}
				else if(score >= GRADE_C) {
					grade = 'C';
					msg = "������ ���";
				}
				else if(score >= GRADE_D) {
					grade = 'D';
					msg = "������ ���";
				}
				else if(score >= GRADE_E) {
					grade = 'E';
					msg = "�� �� ����ϼ���";
				}
			}
			else if(score >= MIN_SCORE && score < MIN_PASS) { 
				pass = "����";
				grade = 'F';
				msg = "�ٽ� �����ϼ���";
			}
			else {
				pass = "����";
				grade = 'X';
				msg = "�߸��� �����Դϴ�.";
			}
			
			System.out.printf("[%d][%c]->[%s][%s]\n", score, grade, pass, msg);
		}
}
