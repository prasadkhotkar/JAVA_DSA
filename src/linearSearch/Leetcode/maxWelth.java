package linearSearch.Leetcode;

public class maxWelth {
    public static void main(String[] args) {


    }
    public int maxWelth(int[][] accounts)
    {
        int ans=Integer.MIN_VALUE;
        for (int person=0;person<accounts.length;person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if(sum>ans)
            {
                ans=sum;
            }
        }
        return ans;
        }

        /*
        for(int[] ints:accounts)
        {
            int sum=0;
            for (int anInt:ints)
            {
                sum += anInt;
            }


            if(sum>ans)
            {
                ans=sum;
            }
        }
        return ans;

         */
    }

