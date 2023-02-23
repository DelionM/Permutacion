package permutacion;
import java.util.Scanner;
public class Permutacion {

    public static void main(String[] args) {
//       en un grupo de mat hay 6 h y 7 m de cuantas maneras 
//       se puede elejir un equipo de 5 perso
        int res, r, n, muj, hom, t1 = 1, t2=1;
       // int factorialN = 1;
        // int factorialR = 1;
 
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de hmbres: ");
        hom=ent.nextInt();
        System.out.println("Ingrese la cantidad de mujeres: ");
        muj=ent.nextInt();
        System.out.println("Ingrese el número de integrantes: ");
        r=ent.nextInt();
        n = muj+hom;
        res = n-r;
       for (int i = 1; i <=n; i++) {
            t1 = n * (n-1);
        }
       for (int i = 1; 1<=res; i++){
           t2 = res *(res-1);
       }
       int resultado = t1 / t2;
        System.out.println(resultado);
    }
    
}
