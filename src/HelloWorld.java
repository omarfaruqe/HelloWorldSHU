public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World");
        System.out.println("স্বাগতম");

        HelloWorld helloWorld = new HelloWorld();
        int resultOfSum = helloWorld.sumTwoNumbers(4, 5);
        int resultOfDivision = helloWorld.division(6, 7);

        System.out.println("Sum Result: " + resultOfSum + 
            "\nDiv Result: " + resultOfDivision);
    }
    public int sumTwoNumbers(int firstNumber, int secondNumber){
        int result;
        result = firstNumber + secondNumber;
        return result;
    }
    public int division(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
}
