package VectorG;

import java.util.Arrays;
import java.util.Comparator;

public class Vector <T>{

    private T datos[];
    private int tam;

    public Vector(int tam) {
        this.tam = -1;
        this.datos = (T[]) new Object[tam];
    }

    public T[] getDatos() {
  	  T[] datosIN = (T[]) new Object[this.getTope()+1];
  	  for (int i = 0; i <= tam; i++) {
  		  datosIN[i] = datos[i];
  	  }
  	 return datosIN;
	}

	public void setDatos(T[] datos) {
		this.datos = datos;
	}

	public int getTope() {
		return tam;
	}

	public void setTope(int tope) {
		this.tam = tope;
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
            return "Sin espacio disponible";
        }
    }

    public String presentar(T obj, Comparator<? super T> comp) {
        String info="";
        
        if (!Vacio()) {
        for (int i = 0; i <= tam; i++) {
            if (datos[i] != null && comp.compare(datos[i], obj) == 0) {
                info += datos[i] + "\n";
            }
        }
        if (info.isEmpty()) {
            info = "El dato no se encontro";
        }
        } else {
            info = "El vector esta vacio";
        }
        return info;
    }

    public T buscar(T obj, Comparator<? super T> comp) {
        if (!Vacio()) {
        for (int i = 0; i <= tam; i++) {
            if (datos[i] != null && comp.compare(datos[i], obj) == 0) {
                return datos[i];
            }
        }
        }
        return null;
    }

    public void ordenar(Comparator<? super T> comp) {
        if (Vacio()) return;

        for (int i = 0; i <= tam; i++) {
            for (int h = 0; h < tam - i; h++) {
                if (comp.compare(datos[h], datos[h + 1]) > 0) {
                    T temp = datos[h];
                    datos[h] = datos[h + 1];
                    datos[h + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(datos);
    }
}
