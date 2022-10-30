public class Calculator
{
    static int Answer;
    public static void addition(int a, int b){
        Answer = a +b;
        System.out.println("Addition of " +a + "and" + b  + "="+ Answer );
    }

    public static void main(String[] args) {
        addition(35,36);
    }
}
