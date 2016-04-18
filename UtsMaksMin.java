
package utsmaksmin;
import java.util.Scanner;
public class UtsMaksMin {

    public static void main(String[] args) {

    int A,B,Masukan;
    int maks = 5;
    int min = -1;
    int jml =5;
    char pil;
        Scanner inputan = new Scanner(System.in);
        A = inputan.nextInt();
        pil = inputan.next().charAt(0);
        
        if (pil == 'A'){
        for (B=0; B<A; B++){
            Masukan = inputan.nextInt();
            if (Masukan <= min){
                if (Masukan == min){
                    jml++;
                }
                min = Masukan;
                }
        }
        
   
    }
    System.out.println("Output : " + min);
    System.out.println("Output : " + jml);

    }
}
 
