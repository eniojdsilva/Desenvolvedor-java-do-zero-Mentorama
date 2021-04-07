public class ClasseMain {
    
    public static void main(String[] args) {
        
        Carro novoCarro = new Carro(4,4,11156,2015,25);

        novoCarro.setCor(Carro.VERMELHO);
        novoCarro.imprimeValores();
    }
}
