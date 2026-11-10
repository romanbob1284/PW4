package task1;
import static java.lang.IO.println;

public class Main {
    public static void main() {
        int count = 0;

        int i = 5;
        while(i > 0) {
            i *= 3;
            i *= -2;

            ++count;
            println("Ітерація " + count);
        }
    }
}