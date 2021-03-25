package pl.szymonleyk.junit.math;

public final class ArrayCalculation {

    public static int min(int[] tab) {
        int min = tab[0];
        for (int value : tab) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    public static int avg(int[] values) {
    return sum(values)/values.length;
    }

    private static int sum(int[] values) {
        int sum = 0;
        for (int value : values){
            sum+=value;
            }
        return sum;
    }
}

