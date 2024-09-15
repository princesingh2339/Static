class A{
    static int a;
    A(){
        a++;
        System.out.println(a);
    }
}
public class Instancestatic {
    public static void main(String[] args) {
        new A(); 
        new A();
        new A();
        new A();
        new A();
        
    }
}
