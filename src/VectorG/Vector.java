package VectorG;

import java.util.Arrays;
import java.util.Comparator;

public class Vector <T>{

    private T datos[];
    private int tam;

    public Vector(int tam) {
        this.tam = 1;
        this.datos = (T[]) new Object[tam];
    }

    private boolean lleno() {
        return this.tam == datos.length-1;
    }

    private boolean Vacio() {
        return this.tam == -1;
    }

    public String add(T objetoT) {
        if (!lleno()) {
            datos[++tam] = objetoT;
            return "Dato agregado correctamente";
        } else {
            return "El vector esta lleno";
        }
    }

    public String presentar(T obj, Comparator<? super T> comp) {
        String info="";
        if (!Vacio()) {
        for (int i = 0; i <= tam; i++) {
            if (comp.compare(datos[i], obj) == 0) {
                info += datos[i] + "\n";
            }
        }
        } else {
            info = "El vector esta vacio";
        }
        return info;
    }

    @Override
    public String toString() {
        return Arrays.toString(datos);
    }
}
