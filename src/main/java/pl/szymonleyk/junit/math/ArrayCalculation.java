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

    public static double median(int[] values) {
        sort(values);
        if(values.length % 2 == 0){
            // średnia
        double second = values[values.length/2];  // dla parzystej liczby elementów szukamy dwóch środkowych i wyliczamy z nich średnią
        double first = values[values.length/2-1];
        return (first+second)/2;

        } else {
            return values[values.length/2]; //działa dla mediany dla nieparzystej liczby elementów
        }
    }
    private static void sort(int[] values){
        for(int j = 0; j < values.length-1; j++){
            for (int i = 0; i < values.length-1; i++){
                if(values[i] > values[i+1]){
                    int tmp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = tmp;
                }
            }
        }
    }
}

