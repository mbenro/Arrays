import java.util.Scanner;
public class ExistInArray {
    public static void main(String[] args) {
        int[] array = {2,5,6,8,1,9};
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum = reader.nextInt();
        boolean inArray = false;


        for(int i=0; i<array.length; i++){


            if(userNum == array[i]){

                System.out.print("It's there.");
                inArray = true;
            }}
            if( inArray == false) {
                System.out.print("It's not there.");


        }


        }


    }


