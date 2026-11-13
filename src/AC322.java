import java.util.Scanner;

public class AC322 {
    public static void main(String[] args){
        Scanner  sc= new Scanner(System.in);
        int i;
        System.out.println("Ingrese un número:");
        int num=sc.nextInt();
        int suma=0;
        int totalImpares=0;
        int sumaImpares=0;
        for(i=0; num!= 0;i++){
            suma=suma+num;
            if(num%2==1){
                totalImpares=totalImpares+1;
                sumaImpares=sumaImpares+num;
            }
            num=sc.nextInt();
        }
        System.out.println("Ha ingresado "+i+" números");
        System.out.println("La suma total es: "+suma);
        System.out.println("Ha ingresado "+totalImpares+" impares");
        System.out.println("La suma total de números impares es: "+sumaImpares);
    }
}
