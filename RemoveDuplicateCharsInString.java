package com.dsapractice;

import java.util.regex.Pattern;

public class RemoveDuplicateCharsInString {
    public static void main(String[] args) {
        String str = "baabcddfff";
        //? --> Matches zero or one occurrence.
//        String pattern = Pattern.compile("(.*?([a-z])\\\\1.*)").matcher(str).group();
//        System.out.println("pattren -->" + pattern);
        /*
        regex is a way to search for a pattern in a string
the regex in my code is : (.)(\\1{1})
explaination:
	() group the returned matched string
	. any single character
	then (.) means group the matched string of any single
character
	\1 escapping character to don't treat 1 as special thing
	\\ escapping the scapping character
	\\1 referes to group 1
	\\1{1} one match of group 1
 then the regex matches any single character that followed by the same single character
         */
        // String outputString = str.replaceAll("(.)(\\1)", "");
        //String outputString1 = str.replaceAll("(.)(?=.*\\1)", "");
        System.out.println("outputString -->" + reduceString(str, "(.)(\\1)"));
        String res = "";
        //mwkommokwm  --> xjivkkvijx  shscbbcshs  gwdyqqydwgzpnlzzlnpzvfeaiiaefvyeqjccjqeymhqhiihqhmhaomkkmoahhddymmyddh  --> 4 EmptyString

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {

            }
        }
        //System.out.println(" -----> "+reduce(str));
    }

    public static String reduceString(String str, String regax) {//baabb
        if (str.length() == 0) return "Empty String";
        else if (str.replaceAll(regax, "").equals(str)) return str;
        return reduceString(str.replaceAll(regax, ""), regax);
    }

}
