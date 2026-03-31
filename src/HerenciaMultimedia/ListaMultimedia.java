package HerenciaMultimedia;

public class ListaMultimedia {
    private Multimedia[] lista;
    private int contador;

    public ListaMultimedia(int max) {
        lista = new Multimedia[max];
        contador = 0;
    }

    private boolean llena() {
        return contador == lista.length;
    }

    public int size() {
        return contador;
    }

    public boolean add(Multimedia m) {
        if (llena()) {
            return false;
        }
        lista[contador] = m;
        contador++;
        return true;
    }

    public Multimedia get(int posicion) {
        if (posicion < 0 || posicion >= contador) {
            System.out.println("error: posicion " + posicion + " no valida.");
            return null;
        }
        return lista[posicion];
    }

    public int indexOf(Multimedia m) {
        for (int i = 0; i < contador; i++) {
            if (lista[i].equals(m)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            resultado += "[" + i + "] " + lista[i].toString() + "\n";
        }
        return resultado;
    }
}