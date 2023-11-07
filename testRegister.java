import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class testRegister {

    static Scanner username, password, cfPw;

    // Success
    public static void testRegistPass()
    {
        try
        {
            username = new Scanner(new File("D:\\Code\\registPass.txt"));
            password = new Scanner(new File("D:\\Code\\pwpass.txt"));
            ArrayList<String> listUn = new ArrayList<String>();
            ArrayList<String> listPw = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (username.hasNext())
            {
                listUn.add(username.next());
            }

            while (password.hasNext())
            {
                listPw.add(password.next());
            }

            for (int i = 0; i < listUn.size(); i++)
            {
                registration.register(listUn.get(i), listPw.get(i), listPw.get(i));
                if (registration.msg.equals(" Register successfully.. ")) 
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

            username.close();
            password.close();
        }
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Unregisted username wrong confirmpw
    public static void testRegistWrongConfirmPw()
    {
        try
        {
            username = new Scanner(new File("D:\\Code\\registPass.txt"));
            password = new Scanner(new File("D:\\Code\\pwpass.txt"));
            cfPw = new Scanner(new File("D:\\Code\\pwfailed.txt"));
            ArrayList<String> listUn = new ArrayList<String>();
            ArrayList<String> listPw = new ArrayList<String>();
            ArrayList<String> listCfPw = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (username.hasNext())
            {
                listUn.add(username.next());
            }

            while (password.hasNext())
            {
                listPw.add(password.next());
            }

            while (cfPw.hasNext())
            {
                listCfPw.add(cfPw.next());
            }

            for (int i = 0; i < listUn.size(); i++)
            {
                registration.register(listUn.get(i), listPw.get(i), listCfPw.get(i));
                if (registration.msg.equals(" Password not the same ")) 
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

            username.close();
            password.close();
            cfPw.close();
        }
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Unregisted username null pw
    public static void testRegistNullPw()
    {
        try
        {
            username = new Scanner(new File("D:\\Code\\registPass.txt"));
            ArrayList<String> listUn = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (username.hasNext())
            {
                listUn.add(username.next());
            }

            for (int i = 0; i < listUn.size(); i++)
            {
                registration.register(listUn.get(i), null, null);
                if (registration.msg.equals(" Invalid password ")) 
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

            username.close();
        }
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Registed username correct pw
    public static void testRegistRegistedUnCorrectConfirmPw()
    {
        try
        {
            username = new Scanner(new File("D:\\Code\\success.txt"));
            password = new Scanner(new File("D:\\Code\\pwpass.txt"));
            ArrayList<String> listUn = new ArrayList<String>();
            ArrayList<String> listPw = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (username.hasNext())
            {
                listUn.add(username.next());
            }

            while (password.hasNext())
            {
                listPw.add(password.next());
            }

            for (int i = 0; i < listUn.size(); i++)
            {
                registration.register(listUn.get(i), listPw.get(i), listPw.get(i));
                if (registration.msg.equals(" Username already exist ")) 
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

            username.close();
            password.close();
        }
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Registed username wrong confirmpw
    public static void testRegistRegistedUnWrongConfirmPw()
    {
        try
        {
            username = new Scanner(new File("D:\\Code\\success.txt"));
            password = new Scanner(new File("D:\\Code\\pwpass.txt"));
            cfPw = new Scanner(new File("D:\\Code\\pwfailed.txt"));
            ArrayList<String> listUn = new ArrayList<String>();
            ArrayList<String> listPw = new ArrayList<String>();
            ArrayList<String> listCfPw = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (username.hasNext())
            {
                listUn.add(username.next());
            }

            while (password.hasNext())
            {
                listPw.add(password.next());
            }

            while (cfPw.hasNext())
            {
                listCfPw.add(cfPw.next());
            }

            for (int i = 0; i < listUn.size(); i++)
            {
                registration.register(listUn.get(i), listPw.get(i), listCfPw.get(i));
                if (registration.msg.equals(" Username already exist ")) 
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

            username.close();
            password.close();
            cfPw.close();
        }
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Registed username null pw
    public static void testRegistRegistedUnNullPw()
    {
        try
        {
            username = new Scanner(new File("D:\\Code\\success.txt"));
            ArrayList<String> listUn = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (username.hasNext())
            {
                listUn.add(username.next());
            }

            for (int i = 0; i < listUn.size(); i++)
            {
                registration.register(listUn.get(i), null, null);
                if (registration.msg.equals(" Username already exist ")) 
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

            username.close();
        }
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Null username correct pw
    public static void testRegistNullUn()
    {
        try
        {
            password = new Scanner(new File("D:\\Code\\pwpass.txt"));
            ArrayList<String> listPw = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (password.hasNext())
            {
                listPw.add(password.next());
            }

            for (int i = 0; i < listPw.size(); i++)
            {
                registration.register(null, listPw.get(i), listPw.get(i));
                if (registration.msg.equals(" Invalid username ")) 
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

            password.close();
        }
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Null username wrong confirmpw
    public static void testRegistNullUnWrongConfirmPw()
    {
        try
        {
            password = new Scanner(new File("D:\\Code\\pwpass.txt"));
            cfPw = new Scanner(new File("D:\\Code\\pwfailed.txt"));
            ArrayList<String> listPw = new ArrayList<String>();
            ArrayList<String> listCfPw = new ArrayList<String>();
            ArrayList<Integer> status = new ArrayList<Integer>();

            while (password.hasNext())
            {
                listPw.add(password.next());
            }

            while (cfPw.hasNext())
            {
                listCfPw.add(cfPw.next());
            }

            for (int i = 0; i < listPw.size(); i++)
            {
                registration.register(null, listPw.get(i), listCfPw.get(i));
                if (registration.msg.equals(" Invalid username ")) 
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

            password.close();
            cfPw.close();
        }
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Null username null pw
    public static void testRegistNullUnPw()
    {
            ArrayList<Integer> status = new ArrayList<Integer>();

            registration.register(null, null, null);
            if (registration.msg.equals(" Invalid username ")) 
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
    }

    public static void main(String[] args) {
        // testRegistPass();
        testRegistWrongConfirmPw();
        testRegistNullPw();
        testRegistRegistedUnCorrectConfirmPw();
        testRegistRegistedUnWrongConfirmPw();
        testRegistRegistedUnNullPw();
        testRegistNullUn();
        testRegistNullUnWrongConfirmPw();
        testRegistNullUnPw();
    }
}
