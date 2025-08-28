import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Circulo circulo = new Circulo();
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite o raio do seu Circulo: ");
       circulo.raio = scanner.nextDouble();
       circulo.calcularArea();
       circulo.calcularPerimetro();

       scanner.close();
    }
}
