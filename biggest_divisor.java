import java.util.Scanner;

public class biggest_divisor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // For no. of inputs
        int n = scan.nextInt();
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
