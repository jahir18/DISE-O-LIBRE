
public class Main {

    public static void main(String[] args) {

        /*
         * Suma suma = new Suma(2, 4);
         * 
         * suma.suma();
         * suma.mostrar();
         */

        MatrizInversa matriz = new MatrizInversa(1, 1);

        matriz.optenerF();
        matriz.optenerC();
        matriz.pedirmatriz();
        matriz.mostrarmatriz();
        matriz.matrizTranspuesta();
        matriz.matrizInversa();

        MatrizInversa matriz1 = new MatrizInversa(1, 1);

        matriz1.optenerF();
        matriz1.optenerC();
        matriz1.pedirmatriz();
        matriz1.mostrarmatriz();

        /*
         * Multiplicacion multiplicacion = new Multiplicacion(6, 7);
         * 
         * multiplicacion.optenerA();
         * multiplicacion.optenerB();
         * multiplicacion.resultado1();
         */

        ClienteControlador cliente = new ClienteControlador(4);

        cliente.agregarCliente();
        cliente.mostrarCliente();

    }
}
