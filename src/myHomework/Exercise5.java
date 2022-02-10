package myHomework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Exercise5 {


    public static void main(String[] args) { //знаю, что не работает, запуталась конкретно
        String text5 = "Слова с тремя и более буквами \"с\", состоящие из 9 букв: искусство, массажист, ренессанс, " +
                "бессистемность, экспрессионист";
        Pattern p5 = Pattern.compile("\\b[c|C]?\\w*[c|C]+\\w*[c|C]+\\w*[c|C]?\\w?\\b");
        Matcher m5 = p5.matcher(text5);

        int result = 0;
        while (m5.find()) {
            result++;
        }

        System.out.println("Найдено:"+result+ printResult(result));
    }

    public static String printResult (int result) {
        if (result == 1) {
            return "\tслово";
        }
        if (result >=2 && result <= 4) {
            return "\tслова";
        }
        return "\tслов";
    }

}

