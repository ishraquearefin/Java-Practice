public class BubbleSort {
    public static void main(String[] args) {
        int [] a = new int [] {5,8,4,3,16,9,0};
        for(int i =0; i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i =0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
