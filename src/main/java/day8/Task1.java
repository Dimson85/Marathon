package day8;

public class Task1 {
    public static void main(String[] args) {

        String numbers = "";
        int i = 1;
        int k = 1;
        long startTime = System.currentTimeMillis();
        while (i <= 20000) {
            numbers = numbers + i + " ";
            i++;
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(numbers);
        System.out.println(stopTime - startTime);
        System.out.println(" ");

        long startTime2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        while (k <= 20000) {
            sb.append(k).append(" ");
            k++;
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.println(sb.toString());
        System.out.println(stopTime2 - startTime2);


    }

}
