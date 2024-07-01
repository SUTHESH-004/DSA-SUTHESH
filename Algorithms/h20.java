import java.util.HashMap;
import java.util.Stack;

public class h20 {
    public static void main(String[] args) {
        String s = "(H2O)2Mg";// h2o2(o2) =h204
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < s.length(); i++) {
            String a = "";
            if (Character.isLetter(s.charAt(i)) && Character.isUpperCase(s.charAt(i))) {
                if (i < (s.length() - 1) && Character.isLowerCase(s.charAt(i + 1))) {
                    a = s.charAt(i) + "" + s.charAt(i + 1);
                }
                if (Character.isLetter(s.charAt(i))) {
                    a = s.charAt(i) + "";
                }
            }
            if (!a.equals(""))
                map.putIfAbsent(a, 0);
        }
        System.out.println(map);

        Stack<String> st = new Stack<String>();
        for (int i = 0; i < n; i++) {
            
        }
    }

}
