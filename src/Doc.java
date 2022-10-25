public class Doc {
    public static void block(String a){
        System.out.println("--Вывести на экран в одну строку два первых блока по 4 цифры:");
        String a1=a.substring(0,4);
        String a2=a.substring(9,13);
        System.out.println(a1+a2);
    }
    public static void zamena(String a){
        System.out.println("--Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *):");
        StringBuilder sb1 =new StringBuilder(a);
        sb1.replace(5,8,"***");
        sb1.replace(14,17,"***");
        sb1.replace(19,20,"*");
        sb1.replace(21,22,"*");
        System.out.println(sb1);

        char[]a1=a.toCharArray();
        for (int i=0; i<a.length();i++){
            if (a1[i]>='A'&& a1[i]<='z')
                a1[i]='*';}
        System.out.println(a1);
    }
    public static void lettersDown(String a){
        System.out.println("--Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре:");
      StringBuilder down =new StringBuilder(a.toLowerCase());
        down.delete(0,5);
        down.replace(3,9,"/");
        down.replace(7,9,"/");
        down.replace(9,10,"/");
        System.out.println(down);
    }
    public static void lettersUp(String a){
        System.out.println("--Вывести на экран буквы из номера документа в формате Letters:yyy/yyy/y/y " +
                            "\nв верхнем регистре(реализовать с помощью класса StringBuilder):");
        StringBuilder up =new StringBuilder(a.toUpperCase());
        up.delete(0,5);
        up.replace(3,9,"/");
        up.replace(7,9,"/");
        up.replace(9,10,"/");
        System.out.println("Letters: "+up);
    }
    public static void equals(String a){
        System.out.println("--Проверить содержит ли номер документа последовательность abc и вывети сообщение " +
                            "\nсодержит или нет(причем, abc и ABC считается одинаковой последовательностью).");
        if (a.contains("ADC")||a.contains("abc")){
            System.out.println("Содержит");}
        else System.out.println("Не содержит");
    }
    public static void start(String a){
        System.out.println("--Проверить начинается ли номер документа с последовательности 555:");
        String a1="555";
        if (a.startsWith(a1)){
            System.out.println("да");}
        else System.out.println("Нет");
    }
    public static void end(String a){
        System.out.println("--Проверить заканчивается ли номер документа на последовательность 1a2b:");
        String a1="1a2b";
        if (a.endsWith(a1)){
            System.out.println("да");}
        else System.out.println("Нет");
    }
    public static void dop2(String c) {
        System.out.println("--Найти самое короткое слово в строке и вывести его на экран.\n" +
                "--Найти самое длинное слово в строке и вывести его на экран.");
        String[] c1 = c.split(" ");
        String max = "";
        String min = "";
        int minS=c.length();
        int maxS=0;
        for (String d : c1) {
            if (d.length() > maxS) {
                max = d;
                maxS=d.length();
            }
            if (d.length() <minS)  {
                min = d;
                minS=d.length();
            }
        }
        System.out.println("Самое длинное слово: "+max);
        System.out.println("Самое короткое слово: "+min);
    }
    public static void dop3(String b){
        System.out.println("--Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки:");
        char[]b1=b.toCharArray();
        for (int i=0; i<b.length();i++){
            String b2= String.valueOf(b1[i]);
            System.out.print(b2.repeat(2));
        }
    }
}