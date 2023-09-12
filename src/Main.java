public class Main {
    public static void main(String[] args) {
        int resultOne = add(12, 13);
        System.out.println(resultOne);
        String resultTwo = greeting("Lewis");
        System.out.println(resultTwo);
        int resultThree = add(4, 5, 6, 7);
        System.out.println(resultThree);
        printMe("Yay!");
    }
    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }
    public static String greeting(String name){
        return "Bonjour, " + name + "!";
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        return add(add(add(numOne, numTwo), numThree), numFour);
    }
    public static void printMe(String toBePrinted){
        System.out.println(toBePrinted);
    }
}
