/**
 * Created by Seyeong on 2016-12-11.
 */
import java.util.*;
import java.math.*;


public class qr {
    static int maxProfit, numBest, bestSet[];
    static int include[];
    static int W=16;

    public static boolean promising(int i)
    {
        int j, k, totWeight;
        float bound;

      //  if(weight>=W)
            return false;
    }

    public static void knapsack(int i, int profit, int weight)
    {
        if(weight<=W &&profit>maxProfit)
        {
            maxProfit = profit;
            numBest = i;
            bestSet = include;
        }

    }

    public static boolean greater(int a, int b)
    {
        if(a>b)
            return true;
        else
            return false;
    }

    public static int plus(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args){
        /*void su()
        {
            int a=1, b=2;
            a += b;
        }*/
        System.out.println("Hello world");
        for(int i=0; i<10; i++)
            System.out.println(i);
        int a=5, b=10;
        System.out.println(plus(a,b   ));
        System.out.println(greater(a,b));
    }
}
/*
public static boolean promising(int i   )
{
    int k;
    k=1;
    boolean swtich = true;
    while(k<i && switch)
    {
        if((col[i]==col[k]) || abs(col[i]-col[k])==i-k)
            swtich = false;
        k++;
    }
    return switch;
}

public static void queens(int i)
{
    int j;
    if(promising(i))
        if(i==n)
            System.out.println("col[]1.... col[n]");
    else
        for(j=1; j<=n; j++)
        {
            col[i+1]=j;
            queens(i+1);
        }
}

*/