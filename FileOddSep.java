import java.io.*;
import java.util.*;
import java.io.IOException;

class FileOddSep
{
  
 public static void main(String[] args)
 {
  try{
  int n;
  Scanner reader=new Scanner(System.in);
  System.out.print("Enter the no.of integers : ");
  n=reader.nextInt();
  int[] arr=new int[n];
  System.out.print("Enter the integers : ");
  for(int i=0;i<n;i++){
    arr[i]=reader.nextInt();
  }
  
  FileWriter fw=new FileWriter("E:\\MCA\\Semester 2\\Java\\Files\\sampodd.txt"); 
  for(int i=0;i<n;i++){
    fw.write(arr[i]+ "\n" );
  }
  fw.close();
  BufferedReader fr = new BufferedReader(new FileReader("E:\\MCA\\Semester 2\\Java\\Files\\sampodd.txt"));
  FileWriter fwe=new FileWriter("E:\\MCA\\Semester 2\\Java\\Files\\samptextevenop.txt");
  FileWriter fwo=new FileWriter("E:\\MCA\\Semester 2\\Java\\Files\\samptextoddop.txt");
    
  String i; 
  while((i=fr.readLine())!= null)
  {
    if(Integer.parseInt(i)%2==0)
    {
        fwe.write(i+" ");
    }
   else
   fwo.write(i+" ");    
  }
fr.close();
fwe.close();
fwo.close();
System.out.print("Copying Done");
 }

 catch(IOException e){
   System.out.println("Exception");
  }
 }

}
