import java.util.Scanner;

public class LicaoModulo2{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        boolean sair = true;
        while(sair) {
            System.out.println("|----------------|");
            System.out.println("| MENU DE OPÇOES |");
            System.out.println("|                |");
            System.out.println("|   1 - Opção    |");
            System.out.println("|   2 - Opção    |");
            System.out.println("|   3 - Sair     |");
            System.out.println("|                |");
            System.out.println("|Digite a opção correta: |");
            System.out.println("|--------------- |");
            int opcao = entrada.nextInt();

            switch(opcao){
                case 1: System.out.println("Você escolheu a primeira opção");
                    break;
                case 2: System.out.println("Você escolheu a segunda opção");
                    break;
                case 3: System.out.println("O programa foi encerrado");
                        sair = false;

                    break;
                default:
                    System.out.println("Seleção inválida");
                    break;

            }
        }
    }
}