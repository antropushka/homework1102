package myHomework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {

    public static void main(String[] args) {

        int num1 = Months.getNumByName("April");
        System.out.println(num1);
        int num2 = Months.getNumByName("October");
        System.out.println(num2);

        System.out.println(Months.getNameByNum(12));
        System.out.println(Months.getNameByNum(3));


    }
}
