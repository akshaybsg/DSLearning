package com.akshayLocal.DSA.programs;

public class Test {
    public static void main(String args[])
    {
        try
        {
            badMethod();
            System.out.println("A");
        }
        catch (Exception e)
        {
            System.out.println("B");
        }
        finally {
            System.out.println("C");
        }
        System.out.println("C");
    }

    public static void badMethod()
    {
        throw new Error();
    }

   /* public static long getTime(String s) {
        long totDur = 0l;
        char[] chArr = s.toCharArray();
        String[] strArr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z" };
        Set<String> hset = new HashSet<>(Arrays.asList(strArr));
        int start =0;
        int end =strArr.length;

        for(int i=0;i<chArr.length;i++)
        {
            String s = Character.toString(chArr[i]);
            for(int j=0;)
            if(hset.contains(s))
            {

            }
        }

        return totDur;

    }*/
}

