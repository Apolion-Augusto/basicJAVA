package basicJAVA;

public class LargestInArray {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int largest = arr[0];

        for(int num : arr){

            if(num > largest){

                largest = num;
            }
        }

        System.out.println(largest);
    }
}
