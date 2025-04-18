public class PetMachine {

    private boolean clean = true;
    private int agua = 30, shampoo = 10;
    private Pet pet;

    public void darBanhoNoPet(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho!");
            return;
        }
        this.agua -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");
    }

    public void adicionarAgua(){
        if (agua == 30){
            System.out.println("A capacidade de água está no máximo!");
            return;
        }
        agua += 2;
    }

    public void adicionarShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de água está no máximo!");
            return;
        }
        shampoo += 2;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getAgua() {
        return agua;
    }

    public boolean temPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina está suja, para colocar o pet é necessário limpar!");
            return;
        }
        if (temPet()){
            System.out.println("O pet " + this.pet.getName() + " está na máquina!");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + this.pet.getName() + " está na máquina!");
    }

    public void retirarPet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina!");
        this.pet = null;
    }

    public void lavarMaquina(){
        this.agua -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa!");
    }

}
