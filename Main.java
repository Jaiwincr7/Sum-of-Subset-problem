import java.util.*;
class Main {
    static void maxSum(int a[], int t)
    {
        int min = -99999;
        int sum = 0, start = 0, end = 0, s = 0;

        for (int i = 0; i < t; i++) {
            sum += a[i];
            if (min < sum) {
                min = sum;
                start = s; // to get the starting of the array for the maximum subarray
                end = i; // ending value of the array of the subarray
            }
 
            if (sum < 0) {
                sum = 0;
                s = i + 1; // updating Starting and ending according to the maximum sum
            }
        }
        System.out.println("Subset with maximum sum is:-");
        for(int i=start;i<=end;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Maximum contiguous sum is "+ min);
    }
 
    public static void main(String[] args)
    {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter the size of the array :-");
        int t=n.nextInt();
        int a[] = new int[t];
        for(int i=0;i<t;i++){
            a[i]=n.nextInt();
        }
        maxSum(a, t);
    }
}