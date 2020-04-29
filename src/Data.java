import java.util.Scanner;

public class Data {
    private int FirstNumbers;
    private int SecondNumbers;
    private char ChoseOperation;
    private boolean Flag;
    private char ExitKey;
    private char CharExit;

    public int getFirstNumbers() {
        return FirstNumbers;
    }

    public int getSecondNumbers() {
        return SecondNumbers;
    }

    public char getChoseOperation() {
        return ChoseOperation;
    }

    public boolean ExitFlag() {
        return Flag;
    }

    public Data(char getChar) {
        this.ExitKey = getChar;
        this.CharExit = '=';
    }

    public int Validate(int Numeric) {

        if (Numeric > 10 || Numeric < 0) {
            throw new IllegalArgumentException();
        }
        return Numeric;
    }

    public void Running() {


        Scanner scanner = new Scanner(System.in);
        ArabicToRoman Ara = new ArabicToRoman();
        RomanNumeral Numeral = new RomanNumeral();
        String GetString = scanner.nextLine();
        if (GetString.indexOf(ExitKey) != -1) {
            Flag = true;
            return;
        }
        try {

            if ((GetString.charAt(GetString.length() - 1) != CharExit)) {
                throw new RuntimeException();
            }

            GetString = GetString.substring(0, GetString.length() - 1);

            String[] ArraySymbols = GetString.split("[+-/*]");

            boolean RomanNumerals = false;
            for (int i = 0; i < Ara.ArrayRome.length; i++) {
                if (Ara.ArrayRome[i].equals(ArraySymbols[0]) || Ara.ArrayRome[i].equals(ArraySymbols[1])) {
                    RomanNumerals = true;
                }

            }

            if (RomanNumerals) {
                FirstNumbers = Validate(Ara.RometoArab(ArraySymbols[0]));
                SecondNumbers = Validate(Ara.RometoArab(ArraySymbols[1]));
                ChoseOperation = GetString.charAt(ArraySymbols[0].length());
                int Result = (int) OperationSelection.Calculation(getFirstNumbers(), getSecondNumbers(), getChoseOperation());
                System.out.println(Numeral.stringToRoman(Result));


            } else {
                FirstNumbers = Validate(Integer.parseInt(ArraySymbols[0]));
                SecondNumbers = Validate(Integer.parseInt(ArraySymbols[1]));
                ChoseOperation = GetString.charAt(ArraySymbols[0].length());
                System.out.println(OperationSelection.Calculation(getFirstNumbers(), getSecondNumbers(), getChoseOperation()));

            }

        } catch (RuntimeException e) {
            throw new IllegalArgumentException("Data is not valid!!! Good bay!!!");
        }
    }
}
