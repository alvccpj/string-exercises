import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String nome;
        char car;

        System.out.println("Digite um nome: ");
        nome = in.nextLine();

        int cont = 0, tam = nome.length();
        for (int i = 0; i < tam; i++) {
            car = nome.charAt(i);
            if (Character.isLetter(car) == true) {
                cont++;
            }
            else if(Character.isSpaceChar(car) == true) {
                cont++;
            }
            
        }


}
}
