import java.io.*;
import java.util.*;
public class P32{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int [][]a=new int[2][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
a[i][j]=sc.nextInt();
}
}

System.out.println("The given array is:");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("The reverse of the array is:");
for(int i=1;i>=0;i--)
{
for(int j=1;j>=0;j--)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}