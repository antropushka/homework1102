package myHomework;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise56789 {public static void main(String[] args) {

    String text6 = "Более мощные средства для работы с регулярными выражениями предлагают классы Pattern и Matcher";
    String[] words = text6.split(" ");
    String theLongestWord = new String();
    for (String word : words) {
        if (word.length() >= theLongestWord.length()) {
            theLongestWord = word;

        }
    }
    System.out.println(theLongestWord);


    String text7 = "В этом тексте будет много слов, которые заканчиваются и начинаются на \"а\" " +
            "или латинское \"a\" : " + "аббривиатура, авиапочта, авТоОплата, авантюра, aorta, aqua, aura";
    Pattern p7 = Pattern.compile("\\b[a|а]\\S*[a|а]\\b", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE );
    Matcher m7 = p7.matcher(text7);
    while (m7.find()) {
        System.out.print(text7.substring(m7.start(), m7.end()) + " ");
    }

    System.out.println();

    String text8 = "Спасибо, что выбрали нас! Номер карты для оплаты заказа 8745-8741-5555-0201";
    Pattern p8 = Pattern.compile("(\\d{4}\\-){3}\\d{4}");
    Matcher m8 = p8.matcher(text8);
    while (m8.find()) {
        System.out.println(text8.substring(m8.start(), m8.end()));
    }

    String text9 = "Очень хочется спать по ночам, но приходиться уСиленно учить Java!";
    Pattern p9 = Pattern.compile("усиленно", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
    Matcher m9 = p9.matcher(text9);
    while (m9.find()) {
        System.out.println(m9.start());
    }

}
}
