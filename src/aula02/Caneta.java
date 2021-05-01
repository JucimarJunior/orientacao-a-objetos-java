package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
        System.out.println("Uma caneta " + this.cor);// "this", em POO, 
                                                     // significa autoreferência 
        System.out.println("está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Modelo " + this.modelo);
    }
    
    void rabiscar() {
        // void significa sem retorno
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    
    void tampar() {
        this.tampada = true; // "this" é referência ao próprio objeto que chamou no caso "c1". 
                             //"this" é o "c1", ou seja, substitui o objeto na chamada. 
    }
    
    void destampar() {
        this.tampada = false;
    }
}
