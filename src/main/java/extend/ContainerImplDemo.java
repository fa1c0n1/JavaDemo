package extend;

import java.util.*;

public class ContainerImplDemo {

        final Map<Key, InternalFactory> factories;
        final Map<Class<?>, Set<String>> factoryNamesByType;

        ContainerImplDemo( Map<Key, InternalFactory> factories ) {
            this.factories = factories;
            Map<Class<?>, Set<String>> map = new HashMap<Class<?>, Set<String>>();
            for ( Key key : factories.keySet() ) {
                Set<String> names = map.get(key.getType());
                if (names == null) {
                    names = new HashSet<String>();
                    map.put(key.getType(), names);
                }
                names.add(key.getName());
            }

            for ( Map.Entry<Class<?>, Set<String>> entry : map.entrySet() ) {
                entry.setValue(Collections.unmodifiableSet(entry.getValue()));
            }

            this.factoryNamesByType = Collections.unmodifiableMap(map);
        }

    public Map<Key, InternalFactory> getFactories() {
        return factories;
    }

    public Map<Class<?>, Set<String>> getFactoryNamesByType() {
        return factoryNamesByType;
    }

    public static void main(String[] args) {
        Map<Key, InternalFactory> factories = new HashMap<Key, InternalFactory>();
        factories.put(new Key("1111", "key1111", List.class), new InternalFactory("factory1"));
        factories.put(new Key("2222", "key2222", List.class), new InternalFactory("factory2"));
        factories.put(new Key("3333", "key3333", List.class), new InternalFactory("factory3"));
        ContainerImplDemo containerImpl = new ContainerImplDemo(factories);
        Map<Class<?>, Set<String>> factoryNamesByType = containerImpl.getFactoryNamesByType();
        System.out.println(factoryNamesByType);
        System.out.println(containerImpl.getFactories());

    }
}
