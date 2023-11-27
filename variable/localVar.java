public class Example {
    public void myMethod() {
        int localVar = 10;
        System.out.println(localVar);
    }
    
    public static void main(String[] args) {
        Example example = new Example();
        example.myMethod();
        
        // System.out.println(localVar);
    }
}