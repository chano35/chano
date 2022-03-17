/*
* 열거형 : 목록
* - 특정한 의미를 갖는 그룹의 개별적인 상수에 이름
* - 열거형 이름은 파일 이름과 동일
*   enum Season(Season.java)
* - 열거형 상수는 관례적으로 모두 대문자   
* - 열거형 상수를 선언할 때 콤마(,)로 구분하고
*   마지막 열거형 상수 뒤에는 콤마를 붙이지 않음
* - 예: 
*   계절(season) :  봄, 여름, 가을, 겨울
*/
package enumeration;


	public enum Season {
		SPRING, // 봄(0)
		SUMMER, // 여름(1)
		AUTUMN, // 가을(2)
		WINTER  // 겨울(3)
}