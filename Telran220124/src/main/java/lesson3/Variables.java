package lesson3;

public class Variables {
    public static int staticVar = 10;
    public int instanceVar = 11;

    public static void main(String[] args) {
        int localVar = 12;
        staticVar = staticVar +1;
        Variables variables = new Variables();
        int instanceVar = variables.instanceVar + 1;
        localVar = localVar +1;
        System.out.println( "static: " + staticVar);
        System.out.println("instanceVar: " + instanceVar);
        System.out.println("Local: " + localVar);
    }
}
