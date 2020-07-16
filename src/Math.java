public class Math {
    private int output;
    public Math(Calculator in) throws Exception {                   //Выполняем арифметические операции
        switch (in.getExpression().charAt(in.getIndex())){
            case ('+'):
                output = Integer.parseInt(in.getFirstDigit()) + Integer.parseInt(in.getSecondDigit());
                break;
            case ('-'):
                output = Integer.parseInt(in.getFirstDigit()) - Integer.parseInt(in.getSecondDigit());
                break;
            case('*'):
                output = Integer.parseInt(in.getFirstDigit()) * Integer.parseInt(in.getSecondDigit());
                break;
            case ('/'):
                output = Integer.parseInt(in.getFirstDigit()) / Integer.parseInt(in.getSecondDigit());
                break;
            default: throw new Exception("Something wrong");
        }
    }

    public int getOutput() {
        return output;
    }
}

