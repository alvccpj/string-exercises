import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String frase;
        char c;

        System.out.print("Digite uma frase: ");
        frase = in.nextLine();
        System.out.print("Informe um caractere: ");
        c = in.next().charAt(0);

        int cont = 0, tam = frase.length();
        for (int i = 0; i < tam; i++) {
            if (c == frase.charAt(i)) {
                cont++;
            }
        }

        System.out.println("O caractere digitado aparece(m) " + cont + " vez(es).");

}
}
