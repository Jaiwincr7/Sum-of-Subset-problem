import java.util.*;
class Main {
     static boolean setsum(int a[], int n, int sum)
    {
        if (sum == 0) {
            return true;
        }
        if (n < 0 || sum < 0) {
            return false;
        }
        boolean in,out;
        in = setsum(a, n - 1, sum - a[n]);
        out = setsum(a, n - 1, sum);
        return in || out;
    }
 
    public static void main(String[] args)
    {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter the size of the list :-");
        int t=n.nextInt();
        System.out.println("Enter the value for the list");
        int a[] = new int[t];
        for(int i=0;i<t;i++){
            a[i]=n.nextInt();
        }
        System.out.println("Enter the sum to be displayed:-");
        int s=n.nextInt();
        boolean value=setsum(a, t-1, s);
       if (value) {
            System.out.print("Sum exists in the list");
        }
        else {
            System.out.print("Sum does not exists in the list");
        }
    }
}
