package Ex;
 
import VectorG.Vector;
 
public class APEPE {
 
	public static void main(String[] args) {
 
		Vector<alerta> vector = new Vector<alerta>(20);
 
		drone drone1 = new drone(101, "norte", 150.5);
		drone drone2 = new drone(102, "sur", 120.0);
 
		sirena sirena1 = new sirena(201, "centro", 85);
		sirena sirena2 = new sirena(202, "este", 90);
 
		appmovil app1 = new appmovil("Android");
		appmovil app2 = new appmovil("iOS");
 
		radio radio1 = new radio("Motorola");
		radio radio2 = new radio("Icom");
 
		vector.add(drone1);
		vector.add(drone2);
		vector.add(sirena1);
		vector.add(sirena2);
		vector.add(app1);
		vector.add(app2);
		vector.add(radio1);
		vector.add(radio2);
 
		System.out.println("emergencia detectada activando alertas\n");
 
		drone1.activar();
		drone1.volar();
		drone2.activar();
		drone2.volar();
 
		System.out.println();
 
		sirena1.activar();
		sirena1.sonarsirena();
		sirena2.activar();
		sirena2.sonarsirena();
 
		System.out.println();
 
		app1.encender();
		app1.notificacionpush();
		app2.encender();
		app2.notificacionpush();
 
		System.out.println();
 
		radio1.encender();
		radio1.transmitirfrecuencia();
		radio2.encender();
		radio2.transmitirfrecuencia();
 
		System.out.println("\n=enviando alertas =\n");
 
 
		String[] mensajes = {
			"Evacuar inmediatamente",
			"Riesgo de inundacion",
			"Alerta sismica",
			"fuertes vientos",
			"calor extremo",
			"bombardeo nuclear",
			"balacera",
			"corte de energia"
		};
 
		Object[] datos = (Object[]) vector.getDatos();
		for (int i = 0; i < datos.length && datos[i] != null; i++) {
			alerta alerta = (alerta) datos[i];
			alerta.EnviarAlerta(mensajes[i]);
		}
 
		System.out.println("\nMireles Mosqueda Heriberto");
	}
}