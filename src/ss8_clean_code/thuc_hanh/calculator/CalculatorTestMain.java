package ss8_clean_code.thuc_hanh.calculator;

public class CalculatorTestMain {
    public static void main(String[] args) {
        testCalculateAdd();
        testCalculateSub();
        testCalculateMul();
        testCalculateDiv();
        testCalculateDivByZero();
        testCalculateWrongOperator();
    }

    static void testCalculateAdd() {
        int result = Calculator.calculate(1, 1, '+');
        System.out.println("Add Test: " + (result == 2 ? "PASS" : "FAIL"));
    }

    static void testCalculateSub() {
        int result = Calculator.calculate(2, 1, '-');
        System.out.println("Sub Test: " + (result == 1 ? "PASS" : "FAIL"));
    }

    static void testCalculateMul() {
        int result = Calculator.calculate(2, 2, '*');
        System.out.println("Mul Test: " + (result == 4 ? "PASS" : "FAIL"));
    }

    static void testCalculateDiv() {
        int result = Calculator.calculate(6, 3, '/');
        System.out.println("Div Test: " + (result == 2 ? "PASS" : "FAIL"));
    }

    static void testCalculateDivByZero() {
        try {
            Calculator.calculate(2, 0, '/');
            System.out.println("DivByZero Test: FAIL");
        } catch (RuntimeException e) {
            System.out.println("DivByZero Test: PASS");
        }
    }

    static void testCalculateWrongOperator() {
        try {
            Calculator.calculate(2, 2, '=');
            System.out.println("WrongOperator Test: FAIL");
        } catch (RuntimeException e) {
            System.out.println("WrongOperator Test: PASS");
        }
    }
}
