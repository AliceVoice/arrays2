public class Main {
    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void zad1() {
        int arr[] = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum +" рублей");
    }

    public static void zad2() {
        int arr[] = generateRandomArray();
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < max) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max);
    }

    public static void zad3() {
        int arr[] = generateRandomArray();
        float sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float mid = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей");
    }

    public static void zad4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
