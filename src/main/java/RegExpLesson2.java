import java.util.Arrays;

public class RegExpLesson2 {
    public static void main(String[] args) {
        String s1 = "Hello212122121111there789372927379382hey23323355bye";
        String[] words = s1.split("\\d+");
        System.out.println(Arrays.toString(words));

        String s2 = "Heelo there hey";
        String modif = s2.replace(" ",",");
        System.out.println(modif);

        String s3 = "Heelo323232321there843098430585308hey";
        String modif2 = s3.replaceAll("\\d+","-"); // replaceAll() когда надо менять набор цифр с помощьюу regExp
        System.out.println(modif2);

        String s4 = "Hi Bob and how are you?";
        s4 = s4.replaceFirst(" ",","); // замена только первого вхождения
        System.out.println(s4);
    }
}

