package lambda;

public class 운동 implements 아무거나가능한인터페이스{
    @Override       // 굳이 붙이는 이유 : 재정의한 것 티내기 위해서 (다른사람들이 볼 때 알 수 있음)
    public void 실행() {
        System.out.println("운동을 한다.");
    }
}
