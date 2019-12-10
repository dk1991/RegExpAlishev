import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherExample {
    public static void main(String[] args) {
        String text = "Heloo ewq dadsad eqweqe dadsa my email dsdd dima@mail.ru and ffdfdfd g" +
                "dadsaaddsaaaaad adsdjsda kdj dk hadsk hdsak hdakh dkda shkdajld" +
                "dkjlajd and yours bob@google.com eweq ggt";

        Pattern email = Pattern.compile("(\\w+)@(mail|google)\\.(ru|com)"); // всё что в () это группа в regExp. У первой((\w+)) индекс = 1, 0 - получить всю строку.
        Matcher matcher = email.matcher(text);

        while (matcher.find()) { // ищем очередное соответствие нашему pattern-у
            System.out.println(matcher.group()); // вывести то, что найдено методом find()
            System.out.println(matcher.group(3));
        }
    }
}

