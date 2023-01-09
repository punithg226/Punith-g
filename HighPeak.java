import java.util.Scanner;
public class HighPeak
{

 public static void main(String[] args)
 {

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of Jobs:");
  int size = sc.nextInt();
  System.out.println("Enter job start time, end time, and earnings");
  if(size>100)
  {
      System.out.println("The number of jobs in the day should be less than 100");
      return ;
  }
  int[][] a = new int[size][3];
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[0].length;j++)
   {
    a[i][j] = sc.nextInt();
   }
  }
 
  int result[] = calculate(a);
  System.out.println("Task:"+result[0]);
  System.out.println("Earnings:"+result[1]);
 

 }

 public static int[] calculate(int[][] a)
 {
  int max = a[0][2];
  int sum = 0;
  int value = 0;
  boolean flag  = false;
  for(int i=0;i<a.length;i++)
  {
 
 for(int j=i+1;j<a[0].length;j++)
 {
 if(a[i][2]==a[j][2])
 {
 flag = true;
 value = a[j][2];
 break;
 }
 }
 if(flag)
 break;
  }
 
  for(int i=0;i<a.length;i++)
  {
 sum+=a[i][2];
  }
 
  if(flag)
  {
  max = value*2;
  }
  else
  {
 for(int i=0;i<a.length;i++)
 {
 if(max<a[i][2])
 max = a[i][2];
 }
  }
 
  int[] result = new int[2];
  if(flag)
 result[0] = a.length - 2;
  else
 result[0] = a.length - 1;
 
  result[1] = sum-max;
 
  return result;
 
 }
}