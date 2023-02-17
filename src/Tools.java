import java.util.Scanner;

public class Tools {
    public static long inputLong(String text) {
        System.out.print(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextLong();
    }

    public static String inputStr(String text) {
        System.out.print(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    public static int inputint(String text) {
        System.out.print(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
