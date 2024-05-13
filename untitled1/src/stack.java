public class stack {
    int top;
    int[] arr;
    public stack() {
         arr= new int[10];
    }
    public void push(int x) {
        arr[top] = x;
        top = top + 1;


    }
    public int pop() {
        int temp = arr[top];
        arr[top-1]= 0;
        top = top - 1;
        return temp;
    }
    public int peek() {
        return arr[top];
    }
    public boolean isEmpty() {
        if(top ==-1){
            return true;
        }
        return false;
    }
    public void display() {
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
    }
}
