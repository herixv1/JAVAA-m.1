package ALGL; 

public class OPvector {     
    public static boolean esBase(double[][] vectores) {         
        int n = vectores.length;         
        if (n == 0) return false;         
        int dim = vectores[0].length;         
        if (n != dim) return false;         
        
        double[][] matriz = new double[n][dim];         
        for (int i = 0; i < n; i++)             
            for (int j = 0; j < dim; j++)                 
                matriz[i][j] = vectores[i][j];         
                
        for (int col = 0; col < n; col++) {             
            int filapivot = -1;             
            for (int fila = col; fila < n; fila++) {                 
                if (Math.abs(matriz[fila][col]) > 0.00001) {                     
                    filapivot = fila;                     
                    break;                 
                }             
            }             
            
            if (filapivot == -1) return false;             
            
            double[] temp = matriz[col];             
            matriz[col] = matriz[filapivot];             
            matriz[filapivot] = temp;             
            double pivot = matriz[col][col];             
            
            for (int j = col; j < dim; j++)                 
                matriz[col][j] /= pivot;             
                
            for (int fila = 0; fila < n; fila++) {                 
                if (fila != col && Math.abs(matriz[fila][col]) > 0.00001) {                     
                    double factor = matriz[fila][col];                     
                    for (int j = col; j < dim; j++)                         
                        matriz[fila][j] -= factor * matriz[col][j];                 
                }             
            }         
        }         
        return true;     
    }     
    
    public static double productoPunto(double[] v1, double[] v2) {         
        double suma = 0;         
        for (int i = 0; i < v1.length; i++)             
            suma += v1[i] * v2[i];         
        return suma;     
    }     
    
    public static double norma(double[] v) {         
        double suma = 0;         
        for (double componente : v)             
            suma += componente * componente;         
        return Math.sqrt(suma);     
    }     
    
    public static double anguloGrados(double[] v1, double[] v2) {         
        if (v1.length != v2.length) {             
            throw new IllegalArgumentException("los vectores deben tener la misma dimension");
        }
        
        double n1 = norma(v1);         
        double n2 = norma(v2);         
        
        if (n1 == 0 || n2 == 0) {             
            throw new ArithmeticException("no se puede calcular el angulo con un vector cero");
        }
            
        double coseno = productoPunto(v1, v2) / (n1 * n2);         
        
        if (coseno > 1.0) {
            coseno = 1.0;
        } else if (coseno < -1.0) {
            coseno = -1.0;
        }
        
        return Math.toDegrees(Math.acos(coseno));     
    } 
}