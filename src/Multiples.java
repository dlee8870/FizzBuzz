public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            boolean isMultipleOf3 = i % 3 == 0;
            boolean isMultipleOf5 = i % 5 == 0;

            if (isMultipleOf3 || isMultipleOf5){
                count++;
            }
        }
        System.out.println(count);

    }
}
