public enum RomanNums {                                     //Храним и в случае чего преобразовываем римские цифры в арабские

    I,
    II,
    III,
    IV,
    V,
    VI,
    VII,
    VIII,
    IX,
    X;

    public static String getArabian(String input){
        for (int i = 0; i < RomanNums.values().length; i++) {
            if (RomanNums.values()[i].toString().equals(input)) return String.valueOf(i+1);
        }
        return null;
    }
}