import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class login {
    public static Scanner s, s1;
    public static String msg;

    public static void loginAccount(String userName, String password)
    {
        try {
            s = new Scanner(new File("D:\\Code\\testout.txt"));
            s1 = new Scanner(new File("D:\\Code\\pwpass.txt"));
            ArrayList<String> list = new ArrayList<String>();
            ArrayList<String> list2 = new ArrayList<String>();

            while (s.hasNext()){
                list.add(s.next());
            }

            while (s1.hasNext()){
                list2.add(s1.next());
            }

            s1.close();
            s.close();

            try (Scanner scanner = new Scanner(System.in)) 
            {
                // userName = scanner.nextLine();
                // password = scanner.nextLine();

                if (list.contains(userName)) 
                {
                    if (password != null && password.equals(list2.get(list.indexOf(userName)))) {
                        String successMsg = " User successfully logged-in.. ";
                        msg = successMsg;
                        // System.out.println(msg);
                    }
                    else
                    {
                        String errMsg1 = " Wrong password ";
                        msg = errMsg1;
                        // System.out.println(msg);
                    }
                } 
                else
                {
                    String errMsg2 = " In valid username ";
                    msg = errMsg2;
                    // System.out.println(msg);
                }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // public static void main(String[] args) {
    //     loginAccount("khanhphuong677001@gmail.com", null);
    // }
}