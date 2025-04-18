import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private final static PetMachine petmachine = new PetMachine();

    public static void main(String[] args) {

        int opcao;



        do {
            System.out.println("Escolha uma das opções: ");
            System.out.println("========================");
            System.out.println("1 - Dar banho no pet ");
            System.out.println("2 - Abastecer a maquina com água ");
            System.out.println("3 - Abastecer a maquina com shampoo ");
            System.out.println("4 - Verificar água da máquina ");
            System.out.println("5 - Verificar shampoo da máquina ");
            System.out.println("6 - Verificar se tem pet no banho  ");
            System.out.println("7 - Colocar pet na máquina ");
            System.out.println("8 - Retirar pet da máquina ");
            System.out.println("9 - Limpar a máquina ");
            System.out.println("0 - sair ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> petmachine.darBanhoNoPet();
                case 2 -> setAgua();
                case 3 -> setShampoo();
                case 4 -> verifyAgua();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petmachine.retirarPet();
                case 9 -> petmachine.lavarMaquina();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    private static void setAgua(){
        System.out.println("Tentando colocar áqua na máquina!");
        petmachine.adicionarAgua();
    }

    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na máquina!");
        petmachine.adicionarShampoo();
    }

    private static void verifyAgua() {
        var qtd = petmachine.getAgua();
        System.out.println("A máquinda está com " + qtd + " Litro(s) de agua");
    }

    private static void verifyShampoo() {
        var qtd = petmachine.getShampoo();
        System.out.println("A máquinda está com " + qtd + " Litro(s) de shampoo");
    }

    public static void setPetInPetMachine(){
        var nome = "";
        while (nome == null || nome.isEmpty()){
            System.out.println("Informe o nome do pet: ");
            sc.nextLine();
            nome = sc.nextLine();
        }
        var pet = new Pet(nome);
        petmachine.setPet(pet);


    }

    private static void checkIfHasPetInMachine (){
        var hasPet = petmachine.temPet();
        System.out.println(hasPet ? "Tem pet na máquina!" : "Nao tem pet na máquina!");
    }




}
