public class IamMain {
    public static void main(String[] args) {
        StackCl a = new StackCl(5);
        a.push(10);
        a.push(6);
        a.push(7);
        a.push(8);
        System.out.println(a.pop());
        a.push(11);
        System.out.println(a.pop());
    }
}
