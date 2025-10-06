import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
         int arr[][]=new int[2][];
    arr[0]=new int[3];
    arr[1]=new int[4];
    System.out.println("input  ");
    for(int i=0; i<arr.length; i++)
    {
        for(int j=0; j<arr[i].length; j++)
        {
            System.out.print(i + "& "+j+" = ");
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("second input");
    for(int i=0; i<arr.length; i++)
    {
        for(int j=0; j<arr[i].length; j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }

    System.out.println("output..");
    for(int i=0; i<arr.length; i++)
    {
        for(int j=0; j<arr[i].length; j++)
        {
            System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
    }
    System.out.println("\n second output..");
    for(int i=0; i<arr.length; i++)
    {
        for(int j=0; j<arr[i].length; j++)
        {
            System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
    }
    sc.close();
    }
}
