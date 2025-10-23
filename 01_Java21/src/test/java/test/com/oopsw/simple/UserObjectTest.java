package test.com.oopsw.simple;

import com.oopsw.simple.UserObject;

public class UserObjectTest {
    public static void main(String[] args) {
        UserObject userObject = new UserObject();
       // userObject.setName("pyo");
        System.out.println(userObject.getName());
        userObject = new UserObject("ppyo", 10);
        System.out.println(userObject);

    }
}
