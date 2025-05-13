import java.util.Scanner;

public class Booleanos {
    private static final Scanner scanner = new Scanner(System.in);

    public static int obtenerNumero(String mensaje) {
        System.out.println(mensaje + ": ");
        return scanner.nextInt();
    }

    public static String obtenerCadena(String mensaje) {
        System.out.println(mensaje + ": ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String nombreUsuario = "Jesus";
        String contraUsuario = "Jesus234";

        String usuarioIngresado = obtenerCadena("Escribe tu usuario");
        
        boolean usuarioCorrecto = usuarioIngresado.equals(nombreUsuario);

        if (usuarioCorrecto) {
            String contraIngresada = obtenerCadena("Escribe tu contraseña");
            boolean contrasenaCorrecta = contraIngresada.equals(contraUsuario);

            if (contrasenaCorrecta) {
                System.out.println("Bienvenido");
            } else {
                System.out.println("Usuario o contraseña incorrectos");
            }
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }
}