import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int letras = 0, digitos = 0, espaços = 0, simbolos = 0;
        String frase;
        char car;
        
        System.out.print("Digite uma frase: ");
        frase = in.nextLine();

        int cont = 0, tam = frase.length();
        for (int i = 0; i < tam; i++) {
            car = frase.charAt(i);
            if (Character.isLetter(car) == true) {
                letras++;
            }
            else if (Character.isDigit(car) == true) {
                digitos++;
            }
            else if (Character.isSpaceChar(car) == true) {
                espaços++;
            } 
            else {
                simbolos++;
            }
        }
        System.out.println("Quantidade de letras: " + letras);
        System.out.println("Quantidade de dígitos: " + digitos);
        System.out.println("Quantidade de espaços em branco: " + espaços);
        System.out.println("Quantidade de símbolos: " + simbolos);

}
}
