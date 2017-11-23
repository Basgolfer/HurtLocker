import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        ItemParser itemParser = new ItemParser();
        ArrayList<String> items;
        items = itemParser.putEachItemInStringArrayList();
        for(String item : items) {
            System.out.println(item);
        }


//        Pattern p = Pattern.compile("(name):\\w+;(price):\\d+\\.\\d+;(type):\\w+;(expiration):(\\d+[/]\\d+[/]\\d+)##", Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher(output);
//        boolean b = m.matches();
//        String[] stringArray = output.split("##");
//        for(int i = 0; i < stringArray.length; i++) {
//            String[] anotherArray = stringArray[i].split("[;^%*!@]");
//            //System.out.println(stringArray[i]);
//            //System.out.println();
//            for (int j = 0; j < anotherArray.length; j++) {
//                System.out.println(anotherArray[j]);
//            }
//            System.out.println();
//        }

    }


}
