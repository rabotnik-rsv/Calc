public class OperationSelection {


    public static double Calculation(int FirstNumber, int SecondNumber, char MathOperation){
        int result = 0;
        switch (MathOperation){
            case '+': result = FirstNumber + SecondNumber; break;
            case '-': result = FirstNumber - SecondNumber; break;
            case '*': result = FirstNumber * SecondNumber; break;
            case '/': result = FirstNumber / SecondNumber; break;
            default:throw  new IllegalArgumentException("Unrecognized operation");
        }
        return result;
    }

}