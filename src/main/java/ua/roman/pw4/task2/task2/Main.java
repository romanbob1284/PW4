package task2;
import static java.lang.IO.println;

public class Main {
    public static void main() {
        int count = 0;

        int j = 2;
        for (int i = 1; i < 100; i = i + 2) {
            ++count;
            println("Ітерація " + count);

            j = j - 1;
            while(j < 15) {
                j = j + 5;
            }
        }
    }
}