[보조 스트림]

1. 보조 스트림은 다른 스트림과 연결되어 여러 가지 편리한 기능을 제공해 주는 스트림
2. 필터(filter) 스트림
3. 자체적으로 입출력 기능을 수행할 수 없다.
4. 입력소스 또는 출력소스와 연결해서 입출력을 수행
5. 보조 스트림의 기능
   - 문자변환
   - 입출력 성능 향상
   - 기본 데이터 타입 입출력
   - 객체 입출력
6. 구조
   - 입력 스트림 -> 보조스트림(필터) -> 프로그램 -> 보조스트림(필터) -> 출력 스트림   

7. 문자 변환 보조 스트림
   - InputStreamReader
   - OutputStreamReader
   
8. 성능 향상 보조 스트림
   - BufferedInputStream
   - BufferedReader
   - BufferedOutputStream
   - BufferedWriter

9. 기본 타입 입출력 보조 스트림
   - DataInputStream
   - DataOutputStream
   
10. 프린터 보조 스트림
   - PrintStream
   - PrinterWriter
   
11. 객체 입출력 보조 스트림
   - ObjectInputStream
   - ObjectOutputStream