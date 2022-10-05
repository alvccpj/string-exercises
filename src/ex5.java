import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        char cpf2[] = new char [10];
        String cpf;
        char car;

        System.out.print("Informe o CPF: ");
        cpf = in.nextLine();

        int cont = 0, tam = cpf.length();
        for (int i = 0; i < tam; i ++) {
            car = cpf.charAt(i);
            if (Character.isDigit(car) == true) {
            }
            else {
                System.out.print("CPF digitado inválido, informe novamente: "); 
                cpf = in.nextLine();
            }
        }

    }
}
