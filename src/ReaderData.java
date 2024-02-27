import java.io.Console;
import java.util.Scanner;

public class ReaderData implements Reader {
    @Override
    public String read() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        return input;
    }
}
