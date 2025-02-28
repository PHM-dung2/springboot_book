class Member{
    String name;
    String nickname;
    public Member(){}
}

public class UnderstandDI {

    public static void main(String[] args) {
    }

    public static void memberUse1(){
        // 강한 결합 : 직접 생성
        Member m1 = new Member();
    }

    public static void memberUse2( Member m ){
        // 약한 결합 : 생성된 것을 주입받므 - 의존 주입( Dependency Injection )
        Member m2 = m;
    }

}
