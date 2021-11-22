package com.dsapractice;

import org.springframework.util.PatternMatchUtils;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Formatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DollarAmountCalc {
    public static void main(String[] args) throws ParseException {
        String str = "#1 Tickets $50,000 Received $40. Expenses $800 . Cheque$2,00,000.";
        //String[] strDollarAmount = str.split("\\$");
        Matcher res = Pattern.compile("^$[0-9|,]+").matcher(str);
        //Valid Ip address -->NetCracker  129.102.128.90 --> valid or invalid
        // \\d{2,3}\\.\\d{2,3}\\.\\d{2,3}\\.\\d{2,3}
        //BigDecimal amount = BigDecimal.ZERO;
        long am = 0;
        NumberFormat f = NumberFormat.getCurrencyInstance(new Locale("us"));
        while (res.find()) am += f.parse(res.group()).longValue();

//        for (int i = 1; i < strDollarAmount.length; i++) {
//            String[] strA = strDollarAmount[i].trim().split(" ");
//            //System.out.println("strAray -->" + strA[0].replace(",", "").replace(".", ""));
//            BigDecimal decimal = new BigDecimal(String.valueOf(strA[0].replace(",", "").replace(".", "")));
//            //System.out.println("decimal -->" + decimal.toString());
//            amount = amount.add(decimal);
//        }
        System.out.println("total amount -->" + am);
    }
}
