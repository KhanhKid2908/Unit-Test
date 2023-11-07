import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class registration {

    public static String msg;
    public static Scanner s;

    public static void register(String userName, String password, String cfPassword)
    {
        FileWriter fw, fw1 = null;
        BufferedWriter bw, bw1 = null;
        PrintWriter pw, pw1 = null;

        try
        {
            // read username file and convert into ArrayList
            s = new Scanner(new File("D:\\Code\\success.txt"));
            ArrayList<String> list = new ArrayList<String>();

            while (s.hasNext()){
                list.add(s.next());
            }

            s.close();

            // Open username file
            fw = new FileWriter("D:\\Code\\success.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            // Open password file
            fw1 = new FileWriter("D:\\Code\\pwpass.txt", true);
            bw1 = new BufferedWriter(fw1);
            pw1 = new PrintWriter(bw1);

            if (userName == null || userName.isEmpty() || userName.isBlank())
            {
                String errMsg3 = " Invalid username ";
                msg = errMsg3;
                // System.out.println(msg);
            }
            else if (list.contains(userName))
            {
                String errMsg2 = " Username already exist ";
                msg = errMsg2;
                // System.out.println(msg);
            }
            else if (password == null || password.isEmpty() || password.isBlank())
            {
                String errMsg4 = " Invalid password ";
                msg = errMsg4;
                // System.out.println(msg);
            }
            else if (cfPassword != password)
            {
                String errMsg1 = " Password not the same ";
                msg = errMsg1;
                // System.out.println(msg);
            }
            else
            {
                pw.println(userName);
                pw1.println(password);
                String successMsg2 = " Register successfully.. ";
                msg = successMsg2;
                // System.out.println("add success");
            }

            pw.flush();
            pw1.flush();

            pw.close();
            bw.close();
            fw.close();

            pw1.close();
            bw1.close();
            fw1.close();
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        register("", null, null);
    }
}