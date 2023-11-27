public class Example {
    int globalVar = 17;
    
    public void myMethod() {
        System.out.println(globalVar);
    }
    
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example.globalVar);
    }
}