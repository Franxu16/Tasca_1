public class Zapping {
    public static int buscarCanales(int origen, int destino, int salida){
        int actual = origen;

        while (actual != destino) {
            if (actual < destino) {
                int siguiente = (actual == 99) ? 1 : actual + 1;
                actual = siguiente;
            } else {
                int anterior = (actual == 1) ? 99 : actual - 1;
                actual = anterior;
            }
        }

        return actual;
    }
}
