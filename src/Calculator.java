import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {

    private String expression;
    private int index = -1;
    private String firstDigit;
    private String secondDigit;

    public String getExpression() {
        return expression;
    }

    public int getIndex() {
        return index;
    }

    public String getFirstDigit() {
        return firstDigit;
    }

    public String getSecondDigit() {
        return secondDigit;
    }

    public void ArrayTrim(String input) throws Exception {
        if (input.isEmpty()) throw new Exception("Введите выражение");

        if (input.contains("*")) index = input.indexOf("*");
        if (input.contains("+")) {
            if (index == -1 & !input.substring(input.indexOf("+")+1).contains("+")) index = input.indexOf("+");
            else throw new Exception("Несколько знаков математических действий");
        }
        if (input.contains("/")) {
            if (index == -1  & !input.substring(input.indexOf("/")+1).contains("/")) index = input.indexOf("/");
            else throw new Exception("Несколько знаков математических действий");
        }
        if (input.contains("-")) {
            if (index == -1 & !input.substring(input.indexOf("-")+1).contains("-")) index = input.indexOf("-");
            else throw new Exception("Несколько знаков математических действий");
        }

        if (index != -1) {
            firstDigit = input.substring(0,index).trim();
            secondDigit = input.substring(index+1).trim();
        }
        else throw new Exception("Нет знаков математических действий");
    }       //Разбиваем входящую строку на 2 числа и знак между ними

    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
        cal.expression = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();        //Принимаем одну строку на ввод
        cal.ArrayTrim(cal.expression);
        switch (new Check().check(cal)){
            case 1:
                System.out.println("Ответ: "+new Math(cal).getOutput());
                break;
            case 2:
                cal.firstDigit = RomanNums.getArabian(cal.firstDigit);
                cal.secondDigit = RomanNums.getArabian(cal.secondDigit);
                System.out.println("Ответ: "+RomanNums.getRoman(new Math(cal).getOutput()));
                break;
            case -1:
                throw new Exception("Недопустимые числа");
            case -2:
                throw new Exception("Недопустимый ввод");
            default: throw new Exception("Something wrong");
        }
    }
}
