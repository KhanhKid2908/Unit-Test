import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class testLogin {
    static Scanner s, s1, s2;

    // Success
    public static void testLoginSuccess()
    {
        try 
        {
            s = new Scanner(new File("D:\\Code\\success.txt"));
            s1 = new Scanner(new File("D:\\Code\\pwpass.txt"));
            ArrayList<String> list2 = new ArrayList<String>();
            ArrayList<String> list3 = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (s.hasNext())
            {
                list2.add(s.next());
            }

            while (s1.hasNext()) {
                list3.add(s1.next());
            }

            for (int i = 0; i < list2.size(); i++)
            {
                login.loginAccount(list2.get(i), list3.get(i));
                if(login.msg.equals(" User successfully logged-in.. "))
                {
                    status.add(1);
                }
                else
                {
                    status.add(0);
                }
            }

            // System.out.println(status);

            if (!status.contains(0)) 
            {
                System.out.println("Test case passed!");
            }
            else
            {
                System.out.println("Test case failed!");
            }

            s.close();
            s1.close();
        } 
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Correct username wrong pw
    public static void testLoginWrongPw()
    {
        try 
        {
            s = new Scanner(new File("D:\\Code\\success.txt"));
            s1 = new Scanner(new File("D:\\Code\\pwfailed.txt"));
            ArrayList<String> list2 = new ArrayList<String>();
            ArrayList<String> list3 = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (s.hasNext())
            {
                list2.add(s.next());
            }

            while (s1.hasNext())
            {
                list3.add(s1.next());
            }

            for (int i = 0; i < list2.size(); i++)
            {
                login.loginAccount(list2.get(i), list3.get(i));
                if(login.msg.equals(" Wrong password "))
                {
                    status.add(1);
                }
                else
                {
                    status.add(0);
                }
            }

            // System.out.println(status);

            if (!status.contains(0)) 
            {
                System.out.println("Test case passed!");
            }
            else
            {
                System.out.println("Test case failed!");
            }

            s.close();
        } 
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Correct username null pw
    public static void testLoginNullPw()
    {
        try 
        {
            s = new Scanner(new File("D:\\Code\\success.txt"));
            ArrayList<String> list2 = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (s.hasNext())
            {
                list2.add(s.next());
            }

            for (int i = 0; i < list2.size(); i++)
            {
                login.loginAccount(list2.get(i), null);
                if(login.msg.equals(" Wrong password "))
                {
                    status.add(1);
                }
                else
                {
                    status.add(0);
                }
            }

            // System.out.println(status);

            if (!status.contains(0)) 
            {
                System.out.println("Test case passed!");
            }
            else
            {
                System.out.println("Test case failed!");
            }

            s.close();
        } 
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Wrong username correct pw
    public static void testLoginWrongdUnCorrectPw()
    {
        try 
        {
            s = new Scanner(new File("D:\\Code\\failed.txt"));
            s1 = new Scanner(new File("D:\\Code\\pwpass.txt"));
            ArrayList<String> list2 = new ArrayList<String>();
            ArrayList<String> list3 = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (s.hasNext()){
                list2.add(s.next());
            }

            while (s1.hasNext()) {
                list3.add(s1.next());
            }

            for (int i = 0; i < list2.size(); i++) {
                login.loginAccount(list2.get(i), list3.get(i));
                if(login.msg.equals(" In valid username "))
                {
                    status.add(1);
                }
                else
                {
                    status.add(0);
                }
            }

            // System.out.println(status);

            if (!status.contains(0)) 
            {
                System.out.println("Test case passed!");
            }
            else
            {
                System.out.println("Test case failed!");
            }

            s.close();
            s1.close();
        } 
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Wrong username wrong pw
    public static void testLoginWrongdUnPw()
    {
        try 
        {
            s = new Scanner(new File("D:\\Code\\failed.txt"));
            s1 = new Scanner(new File("D:\\Code\\pwfailed.txt"));
            ArrayList<String> list2 = new ArrayList<String>();
            ArrayList<String> list3 = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (s.hasNext()){
                list2.add(s.next());
            }

            while (s1.hasNext()) {
                list3.add(s1.next());
            }

            for (int i = 0; i < list2.size(); i++) {
                login.loginAccount(list2.get(i), list3.get(i));
                if(login.msg.equals(" In valid username "))
                {
                    status.add(1);
                }
                else
                {
                    status.add(0);
                }
            }

            // System.out.println(status);

            if (!status.contains(0)) 
            {
                System.out.println("Test case passed!");
            }
            else
            {
                System.out.println("Test case failed!");
            }

            s.close();
            s1.close();
        } 
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Wrong username null pw
    public static void testLoginWrongdUnNullPw()
    {
        try 
        {
            s = new Scanner(new File("D:\\Code\\failed.txt"));
            ArrayList<String> list2 = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (s.hasNext()){
                list2.add(s.next());
            }

            for (int i = 0; i < list2.size(); i++) {
                login.loginAccount(list2.get(i), null);
                if(login.msg.equals(" In valid username "))
                {
                    status.add(1);
                }
                else
                {
                    status.add(0);
                }
            }

            // System.out.println(status);

            if (!status.contains(0)) 
            {
                System.out.println("Test case passed!");
            }
            else
            {
                System.out.println("Test case failed!");
            }

            s.close();
        } 
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Null username correct pw
    public static void testLoginNullUnCorrectPw()
    {
        try 
        {
            s = new Scanner(new File("D:\\Code\\pwpass.txt"));
            ArrayList<String> list2 = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (s.hasNext()){
                list2.add(s.next());
            }

            for (int i = 0; i < list2.size(); i++) {
                login.loginAccount(null, list2.get(i));
                if(login.msg.equals(" In valid username "))
                {
                    status.add(1);
                }
                else
                {
                    status.add(0);
                }
            }

            // System.out.println(status);

            if (!status.contains(0)) 
            {
                System.out.println("Test case passed!");
            }
            else
            {
                System.out.println("Test case failed!");
            }

            s.close();
        } 
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Null username wrong pw
    public static void testLoginNullUnWrongPw()
    {
        try 
        {
            s = new Scanner(new File("D:\\Code\\pwfailed.txt"));
            ArrayList<String> list2 = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (s.hasNext()){
                list2.add(s.next());
            }

            for (int i = 0; i < list2.size(); i++) {
                login.loginAccount(null, list2.get(i));
                if(login.msg.equals(" In valid username "))
                {
                    status.add(1);
                }
                else
                {
                    status.add(0);
                }
            }

            // System.out.println(status);

            if (!status.contains(0)) 
            {
                System.out.println("Test case passed!");
            }
            else
            {
                System.out.println("Test case failed!");
            }

            s.close();
        } 
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Null username null pw
    public static void testLoginNullUnPw()
    {
        ArrayList<Integer> status = new ArrayList<Integer>();

        login.loginAccount(null, null);
        if(login.msg.equals(" In valid username "))
        {
            status.add(1);
        }
        else
        {
            status.add(0);
            }

        // System.out.println(status);

        if (!status.contains(0)) 
        {
            System.out.println("Test case passed!");
        }
        else
        {
            System.out.println("Test case failed!");
        }

        s.close();
    }

    public static void main(String[] args) {
        testLoginSuccess();
        testLoginWrongPw();
        testLoginNullPw();
        testLoginWrongdUnCorrectPw();
        testLoginWrongdUnPw();
        testLoginWrongdUnNullPw();
        testLoginNullUnCorrectPw();
        testLoginNullUnWrongPw();
        testLoginNullUnPw();
    }
}