import java.util.Scanner;
public class AscNumbers 
{
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the limit of array:");
        n = reader.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = reader.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[n-1]);
    }
}
