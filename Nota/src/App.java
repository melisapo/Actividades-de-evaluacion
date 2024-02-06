import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       //Evaluar Nota
        Scanner nt = new Scanner(System.in);
            int n=nt.nextInt();
              String message;
              if(n==5){
                  message="Excelente";
              }
              else if(n==3 || n==4){
                  message="Aprobado";
              }
              else if(n==2){
                  message = "Suspenso";
              }
              else {
                  message = "Nota Invalida";
              }
              System.out.println(message);
        
        }
}
