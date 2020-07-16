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

    public static String getRoman(int input){
        String output ="";
        if (input>0 & input<40){
            for (int i = 0; i < input / 10; i++) {
                output = output.concat("X");
            }
            for (int i = 0; i < values().length; i++) {
                if (i+1 == input%10) output = output.concat(values()[i].toString());
            }
            return output;
        }
        if (input>39 & input<50){
            output = "XL";
            for (int i = 0; i < values().length; i++) {
                if (i+1 == input%10) output = output.concat(values()[i].toString());
            }
            return output;
        }
        if (input>49 & input<90){
            output = "L";
            input-=50;
            for (int i = 0; i < input / 10; i++) {
                output = output.concat("X");
            }
            for (int i = 0; i < values().length; i++) {
                if (i+1 == input%10) output = output.concat(values()[i].toString());
            }
            return output;
        }
        if (input>89 & input<100){
            output = "XC";
            for (int i = 0; i < values().length; i++) {
                if (i+1 == input%10) output = output.concat(values()[i].toString());
            }
            return output;
        }
        if (input==100) return "C";
        return null;
    }
}