package basicJAVA;

public class AmstrongNumber {

    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int temp = num;

        while(temp != 0){

            int digit = temp % 10;

            sum += Math.pow(digit, 3);

            temp /= 10;

        }

        System.out.println(sum == num);
    }
}
