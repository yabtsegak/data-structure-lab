public class array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        delete(a,2);
    }
    public static int[] delete(int[] arr, int key) {
        if(key<0 || key>=arr.length){
            System.out.println("key out of range");
            return arr;

        }
        int j=0;
        int[] newArr = new int[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=key){
                newArr[j] = arr[i];
                j++;


            }
        }
        return newArr;
    }
}
