import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static String getOrder(String input) {

        String[] menu = {"burger","fries","chicken","pizza","sandwich","onionrings" ,"milkshake","coke"};

        StringBuilder sb = new StringBuilder();


        for (String item : menu) {

            if (input.contains(item)){

                Pattern ITEM_NAME_PATTERN =
                        Pattern.compile(item);

                Matcher itemNameMatcher = ITEM_NAME_PATTERN.matcher(input);

                long count = itemNameMatcher.results()
                        .count();


                for (int i = 0; i < count ; i++) {

                    sb.append(item.substring(0,1).toUpperCase()).append(item.substring(1)).append(" ");
                }
            }
        }

        return sb.toString().trim();
    }
}
