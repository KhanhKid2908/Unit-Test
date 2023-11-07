import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class test{
    public static void main(String[] args)
    {
        PrintWriter writer1 = null;
        try {
            writer1 = new PrintWriter(new File("D:\\Code\\testout.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int i = 0; i <= 10; i++)
        {
            Random rand = new Random();
            int randNum = rand.nextInt(10);
            int tmp = 0;
            if (tmp == randNum) {
                randNum = rand.nextInt(10);
            }
            else
            {
                tmp = randNum;
                writer1.println("khanhphuong677001+" + randNum + "@gmail.com");
            }
        }

        writer1.flush();
        writer1.close();
    }
}
