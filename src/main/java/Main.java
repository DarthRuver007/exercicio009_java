

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu peso em quilos: ");
        int massa = sc.nextInt();

        System.out.println("Informe sua altura em metros: ");
        double altura = sc.nextDouble();
        
        double IMC = massa / (altura * altura);
        System.out.println("Seu IMC é: \n" + IMC);
        
    }
}
