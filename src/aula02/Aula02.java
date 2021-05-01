package aula02;
public class Aula02 {
    public static void main(String[] args) {
        // Aqui está sendo instanciada a classe caneta
        Caneta c1 = new Caneta();
        
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        
        c1.rabiscar();
        c1.status(); // O método, em POO, tem parênteses
        
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
}
