import java.util.Scanner;
public class Numar {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("Numarul este :");
        int numar = nr.nextInt();
        int sum=0;

        while(numar>0)
        {
            sum=sum+numar%10;
            numar=numar/10;
        }

        System.out.println(sum);

    }

}