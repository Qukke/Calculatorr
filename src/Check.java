public class Check {
    public int check(Calculator calculator) {                           //Проверяем условия 2,3,4,5 и выполняем условие 6
        try {
            int a = Integer.parseInt(calculator.getFirstDigit());
            int b = Integer.parseInt(calculator.getSecondDigit());
            if (a>0 & a<11 & b>0 & b<11) return 1;
            else return -1;
        } catch (Exception e) {
            for (int i = 0; i < RomanNums.values().length; i++) {
                if (RomanNums.values()[i].toString().equals(calculator.getFirstDigit())) {
                    for (int j = 0; j < RomanNums.values().length; j++) {
                        if (RomanNums.values()[j].toString().equals(calculator.getSecondDigit())) return 2;
                    }
                }
            }
            return -2;
        }
    }
}
