import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "example");
        map.put("2", "example");
        map.put("3", "example");
        map.put("4", "example");
        MapPrinter.printKeys(map);
        MapPrinter.printValues(map);
        MapPrinter.printPairs(map);
    
    }
}