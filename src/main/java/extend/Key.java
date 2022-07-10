package extend;

public class Key {
    private String id;
    private String name;
    private Class type;

    public Key(String id, String name, Class type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getType() {
        return this.type;
    }

    public void setType(Class type) {
        this.type = type;
    }
}
