public class Main {
    public static void main(String[] args) {
        // Criar um objeto Cachorro
        Cachorro cachorro = new Cachorro();

        // Testar o método latir
        cachorro.latir();
        System.out.println("Teste de latir concluído");

        // Testar o método mover
        cachorro.mover();
        System.out.println("Teste de mover concluído");
    }
}
