import java.util.Scanner;
import java.util.Arrays;

public class Main
{
public static void main(String []args)
{
Scanner input = new Scanner(System.in);

System.out.print("\nEnter the length of Array: ");
int length = input.nextInt();

int []arr = new int[length];

System.out.print("\nEnter the element of array: ");
for(int count=0;count<length;count++)
arr[count] = input.nextInt();

 qSort(arr,0,length-1);

System.out.println(Arrays.toString(arr));

}

public static void qSort(int []arr,int start,int end)
{
if(start < end){
int pIndex = partition(arr,start,end);
qSort(arr,start,pIndex-1);//Left sub-array of partition
qSort(arr,pIndex+1,end);//Right sub-array of partition
}
}

public static int partition(int []arr,int start,int end)
{
int pivot = arr[end];
int pIndex = start;


for(int i=start;i<end;i++)
{
if(arr[i]<=pivot)
{
//swap(arr[i],arr[pIndex])
int temp = arr[i];
arr[i] = arr[pIndex];
arr[pIndex] = temp;

pIndex=pIndex+1;
}
}
//swap(arr[pIndex],arr[end]);
int temp2 = arr[pIndex];
arr[pIndex]= arr[end];
arr[end]=temp2;
return pIndex;
}



}
