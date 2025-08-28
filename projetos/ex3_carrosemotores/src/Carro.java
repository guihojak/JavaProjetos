

public class Carro{
    String marca,modelo;
    Motor motor;
    
    public Carro(String marca, String modelo , Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    void exibirDetalhes(){
        System.out.println("Carro: "+marca+"Modelo:"+modelo);
        System.out.printf("Motor: %d - HP",motor.potencia," Tipo de Combustivel: %s",motor.tipoCombustivel);
    }
}