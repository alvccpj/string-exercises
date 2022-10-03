import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String frase;
        char vogal1 = 'a';
        char vogal2 = 'e';
        char vogal3 = 'i';
        char vogal4 = 'o';
        char vogal5 = 'u';

        System.out.print("Digite uma frase:");
        frase = in.nextLine();

        int cont = 0, tam = frase.length();
        for (int i = 0; i < tam; i++) {
            if (vogal1 == frase.charAt(i)) {
                cont++;
            }
            else if (vogal2 == frase.charAt(i)) {
                cont++;
            }
            else if (vogal3 == frase.charAt(i)) {
                cont++;
            } 
            else if (vogal4 == frase.charAt(i)) {
                cont++;
            } 
            else if (vogal5 == frase.charAt(i)){
                cont++;
            }
        }
        System.out.println("Quantidade totais de vogais: " +cont);


    }
}
