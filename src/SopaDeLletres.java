import java.util.Scanner;
public class SopaDeLletres {
    public static String ANSI_RED= "\u001b[31m";
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        //Creo la matriz de 10x10
        String[][] sopa= new String[10][10];
        //llamo funciones
        ingresopalabra(sopa);
        mostrar(sopa);


    }
    //Ingresar letras en matriz
  public static void  ingresopalabra(String sopa[][]){

        //Le pido al usuario las letras para ingresarlas en la matriz
     for(int f=0;f<10;f++){
         for(int c=0;c<10;c++) {
             System.out.println("Dime una letra:");
             sopa[f][c] = scanner.next();
         }
     }
   }
   //muestro la matriz y letras en linia
   public static void mostrar(String sopa[][]){
      int l=0;
        //muestro letras en fila
       for(int k=0;k<2;k++){
            for (int f = 0; f < 10; f++) {
                for (int c = 0; c < 10; c++) {
                      System.out.print(sopa[f][c]);
                }
            }
            System.out.println();
        }
        System.out.println();
        //muestro matriz
        for(int f=0;f<10;f++){
            for(int c=0;c<10;c++){
                System.out.print(" "+sopa[f][c]);
            }
            System.out.println(" ");
        }
   }
   //Solicito palabras a usuario
   public static void solicita(){

   }


}