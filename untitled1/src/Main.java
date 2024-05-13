
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.println("The number : ");
        int num=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i] == num){
                sum += arr[i];
            }
            if(sum == 0){
                System.out.println("The number is not found");
            }

        }
        System.out.println("The sum of the numbers is: " + sum);


    }
}