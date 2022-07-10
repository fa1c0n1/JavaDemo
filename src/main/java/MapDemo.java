import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("aaa", "111111aaa");
        map.put("bbb", "111111bbb");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
