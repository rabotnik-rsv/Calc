public class RomanNumeral {

    public static final int[] ArabicArray = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400};
    public static final String[] RimArray = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD"};

    public static String stringToRoman(int InputArabic) {
        String RomString = "";

        if ( InputArabic > 3999) {
            System.out.println("Roman number cannot be more than 3999!");
        }
        if(InputArabic < 1 && InputArabic!=0)
        {
            return ("-"+stringToRoman(-1*InputArabic));
        }

        while (InputArabic > 0) {
            int maxFound = 0;
            for (int i = 0; i < ArabicArray.length; i++) {
                if (InputArabic >= ArabicArray[i]) {
                    maxFound = i;
                }
            }
            RomString += RimArray[maxFound];
            InputArabic -= ArabicArray[maxFound];
        }

        return RomString;
    }
}

