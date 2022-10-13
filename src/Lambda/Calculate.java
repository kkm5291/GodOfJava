package Lambda;
/*
람다는 메서드가 하나만 존재하는 인터페이스에 대해서 사용이 가능하다.
메서드가 하나만 존재하는 인터페이스에서 @FunctionalInterface로 선언할 수 있으며, 이 인터페이스는 람다식으로 표현 할 수 있다.
 */
public interface Calculate {
    int operation(int x, int y);
}
