import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= 900 && x <= 90000)
            {
                count++;
            }

            System.out.println(count);

        }
    }
}
