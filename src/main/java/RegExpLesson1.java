public class RegExpLesson1 {
    public static void main(String[] args) {
        /*
            \\d - одна цифра (0-9)
            \\w - одна буква
            \\w = [a-zA-Z]

            + - один или более, \\d+ - любое число цифр
            * - ноль или более, \\d* - любое число цифр или ничего ("")
            ? - ноль или один символов до. -?\\d* значит 0 или 1 минусов до набора цифр

            (x|y|z) - одна строка из множества строк. (-|\\+)?\\d*") или минус или плюс или ничего перед цифрами

            [abc] = (a|b|c)
            [a-zA-Z] - все английские буквы
            [0-9] = \\d
            [a-zA-Z]+ или [a-zA-Z]* - любое количество английских букв
            [^abc] - все символы кроме [abc]
            [^a-z] - все символы кроме маленьких a-z
            . - любой символ
            \\. - перевод спец символа . в точку

            {2} - два символа до, (\\d{2}) ровно две цифры
            {2,} - два или более символа, (\\d{2,}) от двух до бесконечности цифр
            {2,4} - от двух до 4, (\\d{2,4}) от двух до четырех цифр
        */

        String a = "-13232";
        String b = "89543";
        String c = "+3232";
        //System.out.println(a.matches("-?\\d+"));
        /*System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));*/

        String d = "1e1rfef33ErrE3EqqQ1d43843";
        //System.out.println(d.matches("[a-zA-Z31]+\\d+")); // до набора цифр буквы или 3 или 1

        String e = "hello";
        //System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        String url3 = "zaycev.net";
        /*System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url3.matches("http://www\\..+\\.(com|ru)"));*/

        String f = "1235545";
        //System.out.println(f.matches("\\d{2,}"));
    }
}
