public class Main {
    public static void main(String[] args) {
        // Criando um retângulo
        Retangulo retangulo = new Retangulo(5, 3);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

        // Criando um círculo
        Circulo circulo = new Circulo(2);
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
    }
}