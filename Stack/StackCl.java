// there is no dynamic resizing as we are not using arraylist
public class StackCl {
    int[] arr;
    int cap;
    int top=-1;
    public StackCl(int c)
    {
        cap=c;
        arr=new int[cap];
    }
    void push(int x)
    {
        if(top==cap-1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            arr[top]=x;
        }
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            int res=arr[top];
            top--;
            return res;
        }
        int res=arr[top];
        top--;
        return res;
    }
}
