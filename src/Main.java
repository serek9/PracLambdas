import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //1.2
        ITallaString talla = (palabra)->{
            return palabra.substring(0, 3);
        };
        System.out.println(talla.tallaString("salchicha"));
        //1.3
        ISumaNumero suma = ((num1, num2) -> {
            return num1+num2;
        });
        System.out.println(suma.sumaNumeros(3, 2));
        //1.4
        IreadNumero read = (mensaje) ->{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int numero = 0;
            boolean error;
            do {
                try {
                    System.out.println(mensaje);
                    numero = Integer.parseInt(br.readLine());
                    error = false;
                } catch (IOException e) {
                    System.out.println("Error de entrada y salida.");
                    error = true;
                } catch (NumberFormatException ex){
                    System.out.println("No has introducido un numero entero.");
                    error = true;
                }
            } while (error);
            return numero;
        };
        read.pedirNumero("Introduce un numero:");
    }
}
