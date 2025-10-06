import java.util.Scanner;
public class OneDimensonal {
    //DISPLAY METHOD 
void show(int arr[])
{
System.out.println("ELEMENT OF ARRAY ");
for(int i=0; i<arr.length; i++)
{
    System.out.print(arr[i]+"\t");
}
System.out.println();
}
// LINEAR SEARCH METHOD 
int search(int arr[],int element)
{
    for(int i=0; i<=arr.length; i++)
    {
        if (arr[i]==element) {
            return arr[i];
           
        }
    }
    return 0;
}
// BINARY SEARCH 
int  bSearch(int arr[],int element)
{
    int mid;
   int low=0;
   int high=arr.length-1;

  while (low<=high) {
    
     mid=(high+low)/2;
   
        if (arr[mid]==element) {
            return arr[mid];
        }
        else if (element>arr[mid]) {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
    }
    return 0;
}
// BUBBLE SORTING ELEMENT 
void bubbleSort(int arr[])
{
    int j,i;
    for(j=0; j<arr.length-1; j++)
    {
        
    for( i=0; i<arr.length-j-1; i++)
    {
    
        if (arr[i]>arr[i+1])
         {
            int temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
            
        }
    } 
    }
    // Arrays.sort(arr);
}
// MAX VALUE OF ARRAY..
void maxValue(int arr[])
{
    int max=arr[0];
    for(int i=0; i<arr.length; i++)
    {
        if (arr[i]>max) {
            max=arr[i];
            
        }
    }
    System.out.println("max value of array "+max);
    // return 0;
}
// MIN VALUE OF ARRAY 
void minValue(int arr[])
{
    int min=arr[0];
    for(int i=0; i<arr.length; i++)
    {
        if (arr[i]<min) {
            min=arr[i];
            
        }
    }
    System.out.println("MIN VALUE OF ARRAY "+min);
    // return 0;
}
// REVERSE ARRAY ELEMENT 
void reversArray(int arr[])
{
    for(int i=arr.length-1; i>=0; i--)
    {
        System.out.print(" \t"+arr[i]);
    }
    System.out.println();
}
// AVERAGE OF ARRAY 
void avgOfArray(int arr[])
{
    double avg=0,sum=0;
    for(int i=0; i<arr.length; i++)
    {
        sum+=arr[i];
    }
    avg=sum/arr.length;
    System.out.println("AVEREGE OF ARRAY = "+avg);
}
// FIND DUPLICATE VALUES
void duplicateValue(int arr[])
{
    for(int i=0; i<arr.length; i++)
    {
        for(int j=i+1;j<arr.length; j++)
        {
            if (arr[i]==arr[j]) {
                System.out.println("DUPLICATE VALUE IS = "+arr[i]);
            }
        }
    }
}
// SUM OF ARRAY ELEMENT 
void sumOfArray(int arr[])
{
    int sum=0; 
    for(int i=0; i<arr.length; i++)
    {
        sum+=arr[i];
    }
    System.out.println("SUM OF ARRAY ELEMENT IS = "+sum);
}
// CHECK PRIME NUMBER 
void checkPrime(int arr[])
{
    int count;
    for(int i=0; i<arr.length; i++)
    {
        int num=arr[i];
        count=0;
        for(int j=2; j<=num; i++)
        {
            if (num%j==0) {
                count++;
            }
        }
        if (count==1) 
        System.out.println("PRIME NUMBER IS = "+arr[i]);
    }
}
// FIND UNIQUE VALUES 
void uniqueValues(int arr[])
{
    int count;
    for(int i=0; i<arr.length; i++)
    {
        count=0;
        for(int j=0; j<arr.length; j++)
        {
            
            if (arr[i]==arr[j]){
                count++;
            }
        }
        if (count==1)
        System.err.println("UNIQUE VALUE OF ARRAY IS = "+arr[i]);
    }
}
// FREQUENCY OF ELEMENT 
void frequency(int arr[])
{
    boolean brr[]=new boolean[arr.length];
    for(int i=0; i<arr.length; i++)
    {
        if (brr[i]==true) {
            continue;
        }
     int count=1;
        for(int j=i+1; j<arr.length; j++)
        {
            if (arr[i]==arr[j]) {
               
                count++;
                brr[j]=true;
            }
            
        }
       System.out.println("FRQUENCY OF ELEMENT  "+arr[i]+"\t is = "+count);
       
    }       
}
// SECOND LARGEST NUMBER 
void  secondLargest(int arr[])
{
    int maxValue=arr[0];
    int secondLargest=arr[0];
    // FIND MAXIMUM BVALUE OF ARRAY 
    for(int i=0; i<arr.length; i++)
    {
        if (arr[i]>maxValue)
            maxValue=arr[i];
    }
    // FIND SECOND LARGEST NUMBER
    for(int i=0; i<arr.length; i++)
    {
        if (arr[i]>secondLargest && arr[i]!=maxValue) {
            secondLargest=arr[i];
        }
    }
//    return secondLargest;
System.out.println("SECOND LARGEST NUMBER IS = "+secondLargest);
}
// EVEN &  ODD COUNT
void evenOddCount(int arr[])
{
    int oddCount=0,evenCount=0;
    for(int i=0; i<arr.length; i++)
    {
        if (arr[i]%2==0)
        evenCount++;
        else
        oddCount++;
    }
    // return evenCount,oddCount
    System.out.println("EVEN NUMBER OF ARRAY IS "+evenCount);
    System.out.println("ODD NUMBNER OF ARRAY IS "+oddCount);
}
// POSITIVE VALUES & NEGATIVE VALUES 
void positiveAndNegsativFind(int arr[])
{
     int positvecount=0,negativecount=0;
    for(int i=0; i<arr.length; i++)
    {
        if(arr[i]>0)
       // System.out.println("POITIVE NUMBER IS = "+arr[i]);
       positvecount++;
        else
        // System.out.println("NEGATIVE VALUE IS =  "+arr[i]);
        negativecount++;
    }
    System.out.println("POITIVE NUMBER IS = "+positvecount);
    System.out.println("NEGATIVE VALUE IS =  "+negativecount);
}
// MERGE OF TWO ARRAY IN ANOTHER ARRAY
void mergingTwoArray(int arr[],Scanner sc)
{
    System.out.print("ENTER SECOND ARRAY LENGTH = ");
    int size=sc.nextInt();
    int brr[]=new int [size];
    int merge[]=new int[arr.length];
    int c=0;
        for(int i=0; i<arr.length; i++)
        {
           merge[i]=arr[i];
        }
        for(int j=arr.length; j<merge.length; j++)
        {
            merge[j]=brr[c];
             c++;
        }
        for(int i=0; i<merge.length; i++)
        {
            System.out.println("AFTER MERGEING TWO ARRAY IS = "+merge[i]);
        }
    
}
// PALINDROME NUMBER 
void palindorme(int arr[])
{
    for(int i=0; i<arr.length; i++)
    {
        int sum=0;
        int count=0;
        int num=arr[i];
        while (num>0) {
            count=num%10;
            sum*=10+count;
            num/=10;
        }
        if (arr[i]==sum)
        System.out.println("PALINDORME NUMBER IS HERE = "+sum);
    }
}
// FACTORIAL OF EACH ELEMENT 
void factorial(int arr[])
{
    for(int i=0; i<arr.length; i++)
    {
        int fact=0;
        for(int j=1; j<=arr[i]; j++)
        {
            fact*=j;
        }
        System.out.println("FACTORIAL OF "+arr[i]+"IS =  "+fact);
    }
}
// MISSING ELEMENT IN ARRAY 
void missingElement(int arr[])
{
int maxValue=0;
int minValue=arr[0];
// FIND MAX OR MIN VALUE IN ARRAY 
for(int i=0; i<arr.length; i++)
{
    if (arr[i]>maxValue)
    maxValue=arr[i];
    if(arr[i]<minValue)
    minValue=arr[i];
}
for(int i=minValue; i<maxValue; i++)
{
    int count=0;
    for(int j=0; j<arr.length; j++)
    {
        if (arr[j]==i)
        count++;
    }
    if(count==0)
    System.out.println("MISSING ELEMENT IS HERE "+arr[i]);
}

}
public static void main(String[] args) 
{
      Scanner sc=new Scanner(System.in);
      OneDimensonal call= new OneDimensonal();
    int arr[];
    System.out.print("enter the size of array = ");
    int size=sc.nextInt();
     arr=new int[size];
    for(int i=0; i<arr.length; i++)
    {
        System.out.print("ENTER ELEMENT OF ARRA OF THIS INDEX "+i+" = ");
        arr[i]=sc.nextInt();
    }
       int choice;
    do
    {
        System.out.print("1 = DISPLAY    \n 2 = LINEAR SEARCH \n 3 = BINARY SEARCH \n 4 = BUBBLE SORT \n 5 = maxvalueFind \n 6 = minValueOf Array \n 7 = sumOfArrayElement \n 8 = AVERAGE OF ARRAY \n 9 = DUPLICATE VALUE OF ARRAY \n 10 = ARRAY REVERSE \n 11 = UNIQUE VALUE OF ARRAY \n 12 =  FREQUENCY OF ARRAY \n 13 =  SECOND LARGEST \n 14 =  EVEN AND ODD COUNT \n 15 = POSITIVE AND NEGATIVE VALUE COUNT \n 16 =  MERGE TWO ARRAY IN ANOTHER ARRAY \n 17 = FIND PRIME NUMBER \n 18 = FIND PALINDROME NUMBER \n  19 = FACTORIAL OF EACH ELEMENT \n 20 =  MISSING ELEMENT OF ARRAY \n 0 =  EXIT \n ENTER YOUR CHOICE =  ");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                    call.show(arr);
                     break;
            case 2:
                    System.out.println("ENTER SEARCHING ELEMENT ");
                    int element=sc.nextInt();
                    int result=call.search(arr, element);
                    if (element==result) 
                        System.out.println("ELEMENT IS FOUNDED "+result);
                        else
                        System.out.println("ELEMENT IS NOT FOUNDED ..."+element);
                        break;
            case 3:
                    System.out.println("ENTER SEARCHING ELEMENT ");
                    int ele=sc.nextInt();
                    int res=call.bSearch(arr, ele);
                    if (ele==res) 
                        System.out.println("ELEMENT IS FOUNDED "+res);
                        else
                        System.out.println("ELEMENT IS NOT FOUNDED ..."+ele);
                        break;
            case 4:
                    call.bubbleSort(arr);
                    break;
            case 5: 
                    call.maxValue(arr);
                    break;
            case 6: 
                    call.minValue(arr);
                    break;
            case 7:
                    call.sumOfArray(arr);
                    break;
            case 8: 
                    call.avgOfArray(arr);
                    break;
            case 9: 
                    call.duplicateValue(arr);
                    break;
             case 10:
                    call.reversArray(arr);
                    break;
            case 11: 
                    call.uniqueValues(arr);
                    break;
            case 12: 
                    call.frequency(arr);
                    break;
            case 13:   
                    call.secondLargest(arr);
                    break;
            case 14: 
                    call.evenOddCount(arr);
                    break;
            case 15: 
                    call.positiveAndNegsativFind(arr);
                        break;
            case 16: 
                    call.mergingTwoArray(arr, sc);
                    break;
            case 17: 
                    call.checkPrime(arr);
                    break;
            case 18: 
                    call.palindorme(arr);
                    break;
            case 19:
                    call.factorial(arr);
                    break;
            case 20: 
                    call.missingElement(arr);
                    break; 
            case 0:
                    System.out.println("YOUR CHOICE IS OUT OF PROGRAM .. THNK YOU ..");
                    break;
            default:
                    System.out.println("TOUR CHOICE IS INVALID ... \n PLEASE ENTER COORECT CHOICE .");
                break;
        }
    }while (choice!=0);
}
}