import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        Scanner cuv = new Scanner(System.in);
        System.out.println("Cuvantul este :");
        String cuvant = cuv.nextLine();

        if(cuvant.length()%2!=0){
            System.out.println(cuvant.charAt(cuvant.length()/2));
        } else {
            System.out.println(cuvant.charAt((cuvant.length()/2) - 1));
            System.out.println(cuvant.charAt((cuvant.length()/2)));
        }

    }
}