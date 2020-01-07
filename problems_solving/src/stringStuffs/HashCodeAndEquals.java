package stringStuffs;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** challenge to check performance when hashcode and equals are not well overriden
equals returning true and false */
public class HashCodeAndEquals {

    private String name;


    @Override
    public boolean equals(Object o) {

        return false; // if return true, the map will onl contain the last added element.
        // If false then it will the map will contain all entries.
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        HashCodeAndEquals that = (HashCodeAndEquals) o;
//        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public static void main(String args[]){

        Map<HashCodeAndEquals, Integer> map =  new HashMap<>();
        map.put(new HashCodeAndEquals("Ferdis"), 33);
        map.put(new HashCodeAndEquals("Papa"), 22);
        map.put(new HashCodeAndEquals("Kaka"), 11);

        map.keySet().forEach(System.out::println);


    }

    public HashCodeAndEquals(String name) {
        this.name = name;
    }
}
