public class Missing {
   
void missingElement(int arr[])
{
int maxValue=0;
int minValue=arr[0];


for(int i=0; i<arr.length; i++)
{
    if (arr[i]>maxValue)
    maxValue=arr[i];// FIND MAX OR MIN VALUE IN ARRAY 
    if(arr[i]<minValue)
    minValue=arr[i]; // MIN VALUE OF ARRAY 
}
for(int i=minValue; i<maxValue; i++)
{
    int count =0; 

    for(int j=0; j<arr.length; j++)
    {
        if (arr[j]==i)
        count++;
    }
    if(count==0)
    System.out.println("MISSING ELEMENT IS HERE "+i);
}
}


    public static void main(String[] args) {
        int arr[]={5,9,8,7,6,1};
        Missing call=new Missing();
        call.missingElement(arr);
    }
}
