import java.util.Scanner;

public class BinarySearch {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[]{5,8,15,20,22};
        int needToFind= sc.nextInt();
        int findIndex= search(array,needToFind);
        System.out.println(findIndex);
    }
    public static  int search( int [] array,int value){
        int startIndex = 0;
        int lastIndex= array.length-1;
        int middle= (startIndex+lastIndex)/2;

        while(startIndex<=lastIndex){
            if(array[middle]==value){
                return middle;
            }
            else if(array[middle]<value){
                startIndex=middle+1;
            }
            else{
                lastIndex=middle-1;
            }
            middle=(startIndex+lastIndex)/2;
        }
        return -1;

    }
}
