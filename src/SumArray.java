public class SumArray {
    public static void main(String[] args) {
        double sum = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i=0; i<numbers.length; i++ ){  //when does it refer to the index??

            sum = sum + numbers[i];}
            System.out.println("The sum of the values is: " + sum);
            System.out.println("The average is: " + sum / numbers.length);

        // Haris' way:
        // double average = sum % numbers.length;
        // System.out.println(average);
        }
    }

