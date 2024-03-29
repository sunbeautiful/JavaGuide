package serialize;


import java.io.Serializable;

public class UserSeriaTest implements Serializable {

    private static final long serialVersionUID = 1L;

    private static String userName = "类123";
    private int age;
    private String sex;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        UserSeriaTest.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}