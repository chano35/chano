[Serializable] 객체 직렬화

1. Serializable 인터페이스의 구현 클래스
2. Serializable의 구현 클래스를 상속한 모든 하위 클래스는 객체 직렬화가 된다.
3. 직렬화의 대상 객체의 속성(멤버 필드)
4. static, transient 필드는 대상이 아니다.
5. 생성자, 메소드는 대상이 아니다.
6. serialVersionUID(클래스 식별자)
   - serialVersionUID 값은 정수값으로 serialver.exe로 임의의 번호를 생성해서 쓸 수 있다.
   - 역직렬화를 할 때 클래스 이름이 같더라도 내용이 변경되면 새로운 serialVersionUID가 부여
   - 역직렬화를 할 때 클래스 이름이 같더라도 내용이 변경되면 serialVersionUID가 다르기 때문에 실패
   - 클래스의 내용이 변경되더라 serialVersionUID번호를 같게해서 역직렬화가 가능하게 할 수 있다.
     (변경된 내용에는 값이 지정되지 않음)