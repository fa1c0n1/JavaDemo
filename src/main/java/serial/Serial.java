package serial;

import bean.Person;

import java.io.*;

public class Serial {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("noxmy-x");
        p.setSex("female");
        p.setAge(19);

        try {
            ObjectOutputStream outs = new ObjectOutputStream(new FileOutputStream(new File("/Users/fa1c0n/tmp/person.bin")));
            outs.writeObject(p);

            System.out.println("序列化完成");
            System.out.println("-------------分割线---------------");

            ObjectInputStream ints = new ObjectInputStream(new FileInputStream(new File("/Users/fa1c0n/tmp/person.bin")));
            Object o = ints.readObject();
            System.out.println(o.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
