public class MyFibThing implements FibonacciLike {
    //Fields
    int amountofNumbersInSequence = 0;
    int number1 = 0;
    int number2 = 0;



    public MyFibThing(int amountofNumbersInSequence, int number1, int number2) {
        this.amountofNumbersInSequence = amountofNumbersInSequence;
        this.number1 = number1;
        this.number2 = number2;


    }
    public void calculate() {



        System.out.println(number1);
        System.out.println(number2);
        for(int i = 0; i < amountofNumbersInSequence; i = i + 1) {

            int FibResult = number1 + number2;
            number1 = number2;
            number2 = FibResult;
            System.out.println(FibResult);

        }

        // Gets: 4 , 5 , 6


        // amountofNumbersInSequence currently is 4
        // number1 currently is 5
        // number2 currently is 6
        // Prints: 5, 6, 11, 17
    }
}
