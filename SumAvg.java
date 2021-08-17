import java.util.Scanner;

    public class SumAvg
    {
        public static void main(String[] args) 
        {
            int n, sum = 0;
            float avg;
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter the limit of array: ");
            n = reader.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements in array: ");
            for(int i = 0; i < n ; i++)
            {
                arr[i] = reader.nextInt();
                sum = sum + arr[i];
            }
            System.out.println("Sum: "+sum);
            avg = (float)sum / n;
            System.out.println("Average: "+avg);
        }
    }
