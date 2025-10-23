//사용자의 정보를 이름 또는 또는 나이 또는 포인트를 처음입력

import lombok.Builder;
import lombok.ToString;

//@Builder
@ToString
class User{
        private int age;
        private String name;
        private int point;

        private User() {
        }

        //@builder 안 쓸 때는, 이렇게 직접 만듦
        public static User builder() { //builder만 static -> 사용 순서 가장 먼저
            return new User();
        }
        public User name(String name){
            this.name = name;
            return this;
        }
        public User age(int age){
            this.age = age;
            return this;
        }
        public User point(int point){
            this.point = point;
            return this;
        }
        public User build(){
            return this;
        }

}

public class ObjectTest {
    public static void main(String[] args) {
        User u1 = User.builder().name("홍길동").point(100).build();
        System.out.println(u1);
    }

}
