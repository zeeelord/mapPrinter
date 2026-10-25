import java.util.Map;

public class MapPrinter {

    public static void printKeys(Map<String, String> map) {

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }

    public static void printValues(Map<String, String> map) {

        for (String value : map.values()) {
            System.out.println(value);
        }
    }

    public static void printPairs(Map<String, String> map) {
        //printing keys and values using lmbd operations
        map.forEach(
                (keys, values) -> System.out.println(keys + " : " + values)
        );
    }
}