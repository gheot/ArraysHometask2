public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        int sum = 0;
        for (int b = 0; b < arr.length; b++) {
            sum += arr[b];
        }
        System.out.println("Суммма трат за месяц: " + sum);


        int maxSpending = 90_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpending) {
                maxSpending = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила: " + maxSpending);


        int minSpending = 220_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSpending) {
                minSpending = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + minSpending);

        double average = 0;
        average = sum/ arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");



        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
        public static int [] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int [] arr = new int [30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt (100_000) + 100_000;
            }
            return arr;
        }
}