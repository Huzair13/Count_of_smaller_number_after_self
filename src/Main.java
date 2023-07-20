import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the szie of the array !!!");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Value !!!");

        int array[]=new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }

        int smallerThanSelf[]=findSmallerThanSelf(array,size);

        System.out.println(Arrays.toString(smallerThanSelf));
    }

    private static int[] findSmallerThanSelf(int[] array, int size) {
        int counter[]=new int[size];
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=i+1;j<size;j++){
                if(array[j]<array[i]){
                    count++;
                }
            }
            counter[i]=count;
        }
        return counter;
    }
}