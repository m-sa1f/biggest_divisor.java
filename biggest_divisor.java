import java.util.Scanner;

public class biggest_divisor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // For no. of inputs
        int n = scan.nextInt();


        // int f = scan.nextInt();
        // int s = scan.nextInt();

        // int divisor = 0;
        // int i = 1;
        // int sum = Math.max(f,s);
        // while(i<sum){

        //     if(f%i==0 && s%i==0){
        //         divisor = i;
        //     }
        //     i++;
        // }
        // System.out.println(divisor);


        // int i = 1;
        // while(i<=n){
        //     int a = scan.nextInt();
        //     int j = 1;
        //     while(j<=a){
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }
        // int i = 1;
        // while(i<=n){
        //     int j = n;
        //     while(j>i){
        //         System.out.print(j);
        //         j--;
        //     }
        //     System.out.print("*");
        //     j = 1;
        //     while(j<i){
        //         System.out.print(j);
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        if (n<=2){
            System.out.println("-1");
        }
    // cout<<"-1";

  else if (n % 2 == 0)
  {
    // Calculating for even case
    int var = 1 * n * n / 4;
    System.out.print(var -1+" ");
    // cout<<var - 1<<" ";
    System.out.print(var +1);
    // cout<<var + 1;
  }
  else if (n % 2 != 0)
  {
    //Calculating for odd case
    int var = 1 * n * n + 1;
    // cout<<var / 2 - 1<<" ";
    System.out.print(var/2 -1+" ");
    // cout<<var / 2;
    System.out.print(var/2);
  }
    }
}