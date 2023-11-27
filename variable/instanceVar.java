public class Example {
    int instanceVar = 17;
    
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        
        obj1.instanceVar = 1;
        obj2.instanceVar = 7;
        
        System.out.println(obj1.instanceVar);
        System.out.println(obj2.instanceVar);
    }
}