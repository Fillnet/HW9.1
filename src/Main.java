import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;

public class Main {

 public static void main(String[] args){
        int[] expences = generateRandomArray();
//        System.out.println(Arrays.toString(expences));
        System.out.println("Задание 1");
        int sum = 0;
        for (int expence : expences) {
            sum += expence;
        }
        System.out.println("Сумма затрат за месяц составила " + sum + " рублей");

        System.out.println("Задание 2");
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int expence : expences) {
            if (expence > max) {
                max = expence;
            }
            if (expence < min) {
                min = expence;
            }
        }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        System.out.println("Задание 3");
        double averageExpence = (double) sum / expences.length;
            System.out.println("Седняя сумма трат за день составила " + averageExpence + " рублей");

        System.out.println("Задание 4");
     char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
     for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
         System.out.print(reverseFullName[i]);

     }

//    } public static void main(String[] args){
//        int[] expences = generateRandomArray();
////        System.out.println(Arrays.toString(expences));
//        System.out.println("Задание 1");
//        int sum = 0;
//        for (int expence : expences) {
//            sum += expence;
//        }
//        System.out.println("Сумма затрат за месяц составила " + sum + " рублей");
//
//        System.out.println("Задание 2");
//        int max = Integer.MAX_VALUE;
//        int min = Integer.MIN_VALUE;
//        for (int expence : expences) {
//            if (expence < max) {
//                max = expence;
//            }
//            if (expence > min) {
//                min = expence;
//            }
//        }
//            System.out.println("Минимальная сумма трат за день составила " + max + " рублей");
//            System.out.println("Максимальная сумма трат за день составила " + min + " рублей");
//
//
//
   }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}




