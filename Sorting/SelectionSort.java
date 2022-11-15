public class SelectionSort {
    public static void main(String[] args) {
        int [] a = new int [] {5,8,4,3,16,9,0};
        for(int i =0; i<a.length-1;i++){
            int smallest =i;
            for(int j=i+1;j<a.length;j++){
                if(a[smallest]>a[j]){
                    smallest=j;
                }
            }
            int temp =a[i];
            a[i]=a[smallest];
            a[smallest]=temp;
        }
        for(int i =0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
