public class Usuario {
    public static void main(String[] args)  {
        CondicionadorDeAr arCondicionado = new CondicionadorDeAr();
        arCondicionado.ligar();

        arCondicionado.aumentarTemperatura(); // Tentativa de aumentar para 30 graus
        arCondicionado.reduzirTemperatura(); // Tentativa de diminuir para 10 graus

        arCondicionado.aumentarTemperatura(); // Aumenta para 25 graus
        arCondicionado.imprimirTemperatura();
    }
}
    

