import java.util.Scanner;
public class Sieve {
public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number");
    int number = scan.nextInt();
    boolean[] booleanArray = new boolean [number];
        for(int  i= 2; i < number; i++) {
            booleanArray[i] = true;
        }
        for (int m = 2; number >= (m * m); m++){
            if (booleanArray[m] == true){
                for(int j = m * m; j < number; j += m){
                    booleanArray[j] = false;
            } 
        }
    }
        for(int  i= 2; i < number; i++) {
           if (booleanArray[i] == true) {
            System.out.println(i + " ");
           }

}
}
}
