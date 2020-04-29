public class ArabicToRoman {
    static String[] ArrayRome =  {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
    static int[] ArrayArabic ={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};


    public int RometoArab(String InputRom) {

        StringBuffer RomanicNumbers = new StringBuffer(InputRom);
        int ArabicsNumbers = 0, i = 0;
        if (RomanicNumbers.length() > 0) {
            while (true) {
                do {
                    if (ArrayRome[i].length() <= RomanicNumbers.length()) {
                        if (ArrayRome[i].equals(RomanicNumbers.substring(0, ArrayRome[i].length()))) {
                            ArabicsNumbers += ArrayArabic[i];
                            RomanicNumbers.delete(0, ArrayRome[i].length());
                            if (RomanicNumbers.length() == 0)
                                return ArabicsNumbers;
                        } else
                            break;
                    } else
                        break;
                } while (true && RomanicNumbers.length() != 0);
                i++;
            }
        }
        return 0;

    }
}
