package usevar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

//class var {}
public class Example {
//  var count = 0;

  public static void showAll(int[] ia) {}
  public static String[] getNames() {return null;}
  public static Map<String, List<Map.Entry<String, Integer>>> getMap() { return null; }
  public static void main(String[] args) {
    var x = 4_000_000_000L;
//    Map<String, List<Map.Entry<String, Integer>>> map = getMap();
    var map = getMap();
    var list = new ArrayList<String>();
    var many = getNames();
    var singleDigits = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    int [] ia = {1, 2, 3};
    showAll(ia);
    showAll(new int[]{1, 2, 3});

//    int x2 = 99, y, z = 200, aa[];
//    var x2 = 99, z = 200;

//    var z;
//    z = 99;
    var z = 99;

    int number = 99;
    String name = "Fred";
    boolean b = (Math.random() > 0.5);
    var obj = b ? number : name;
    System.out.println(obj);
//    obj.

    var var = "var";
    Function<String, Integer> fis = (@Deprecated var s) -> s.length();
  }
}
