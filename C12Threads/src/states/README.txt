[스레드 상태]

1. 스레드 객체 생성(NEW)
  - 스레드 객체가 생성된 상태 (new)
  - start를 하지 않은 상대
  
2. 실행 대기(RUNNABLE)
  - start를 호출한 상태
  - 실행 가능한 상대
  
3. 실행(RUNNING)
  - 실행되고 있는 상태
  
4. 일시정지상태
  - 스레드가 실행할 수 없는 상태
  - WAITING : 대기 상태
  - TIMED_WATTING : 주어진 시간동안 대기 상태
  - BLOCKED : 락이 풀리기를 기다리는 상태
    > 동기화 메소드 (synchronized method)
    > 동기화 블럭 (synchronized block)
    
5. 종료 (TERMINATED)
  - 스레드의 실행이 완전히 종료된 상태