package pl.szymonleyk.junit.validators;

public final class Validator3 {

    public static boolean digitValidation(String number) {
        int threeDigitNumber = Integer.parseInt(number);
        return threeDigitNumber >= 111 && threeDigitNumber <=999;
    }
}
