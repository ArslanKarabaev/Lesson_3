import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int k;


    // дз

    public static void main(String[] args) {
        Random random = new Random();

        float[] num = new float[15];
        for (int i = 0; i < 15; i++) {
            num[i] = random.nextFloat() * 10 - 5;
            System.out.println(num[i]);
        }

        int count = 0;
        float res = 0;
        boolean firstNegativeNum = false;
        for (float i : num) {
            if (!firstNegativeNum && i < 0) {
                firstNegativeNum = true;
                continue;
            }
            if (firstNegativeNum && i > 0) {
                res += i;
                count++;
            }
        }
        System.out.println("среднее арифметическое положительных чисел = " + res + " / " + count + " = " + res / count);

        // дз на сообразительность

        System.out.println(Arrays.toString(num));
        for(int i = 0; i < num.length; i++){
            float min = num[i];
            k = i;
            for(int j = i + 1; j < num.length; j++){
                if (num[j] < min){
                min = num[j];
                k = j;
            }
            }
            num[k] = num[i];
            num[i] = min;

            System.out.println(Arrays.toString(num));
        }



    }
}