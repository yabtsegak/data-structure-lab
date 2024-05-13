public class bulbsort {
    public static void main(String[] args) {


    }
    public static char[] bulb(char[] arr) {
        char[] temp ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char n='n';
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (arr[i] == temp[j]) {
                    n=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=n;

                }
            }
        }
    return arr;


    }
}
