import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        // Clase Scanner
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // do {
        //     scanner =

        // } while (palabraAdivinada);

        // Estructura de control: Iterativa (Bucle)
        for(int i=0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
        }


        while(!palabraAdivinada && intentos < intentosMax){
            System.out.println("Palabra a adivinar: "+String.valueOf(letrasAdivinadas));

            System.out.print("Introduce una letra: ");

            // Usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control: Iterativa (Bucle)
            for(int i = 0; i < palabraSecreta.length(); i++){
                // Estructura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMax - intentos) + " intentos.");
            }
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("¡Felicidades! Adivinaste la palabra secreta: " + palabraSecreta);
            }
        }
        if(!palabraAdivinada){
            System.out.println("Fin del juego.");
        }
        scanner.close();

    }
}
