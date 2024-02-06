import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       //Verificar Triangulo
        System.out.println("Ingrese los 3 lados de su triangulo separados por renglones");
        Scanner ld=new Scanner(System.in);
        int a =ld.nextInt();
        int b =ld.nextInt();
        int c =ld.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Es triangulo");
        }
        else{
            System.out.println("No es Triangulo");
        }
    }
}
