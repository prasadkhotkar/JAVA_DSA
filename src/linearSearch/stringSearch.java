package linearSearch;

public class stringSearch {
    public static void main(String[] args) {
        String name="prasad";
        char target='k';
        System.out.println(search(name,target));
        System.out.println(search2(name,target));
    }

    static boolean search(String name,char target)
    {
       if(name.length()==0)
       {
           return false;
       }
       for (int i=0;i<name.length();i++)
       {
           if (target==name.charAt(i))
           {
               return true;
           }
       }
       return false;
    }

    // using for each
    static boolean search2(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        for(char ch:str.toCharArray())
        {
            if(ch==target)
            {
                return true;
            }
        }
        return false;
    }
}
