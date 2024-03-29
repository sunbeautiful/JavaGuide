package serialize;

import java.io.*;

public class SeriaTest implements Serializable {

    public static void main(String[] args) throws Exception {
        UserSeriaTest user = new UserSeriaTest();
        user.setAge(19);
        user.setSex("M");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("out.txt"));
        outputStream.writeObject(user);

        outputStream.flush();
        outputStream.close();

        System.out.println("--------序列化输出完成");

//        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("out.txt"));
//        UserSeriaTest user1 = (UserSeriaTest)inputStream.readObject();
//
//        System.out.println(user1.getAge());
//        System.out.println(user1.getSex());

    }
}