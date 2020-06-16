/**
 * Mosca
 */
public class Mosca {

    public static void main(String[] args) {
        String cadenaOriginal = "Una mosca parada en la pared, en la pared              ";
        String cadenaSinEspacios = cadenaOriginal.trim();
        String abc="[aeiouAEIOU]";
        int indice=0;
        System.out.println("Cadena original : \"" + cadenaOriginal + "\" \nLongitud de la cadena : " + cadenaOriginal.length());
        System.out.println("La cadena \"" + cadenaSinEspacios + "\" tiene " + cadenaSinEspacios.length() + " caracteres");
        System.out.println("Frase #" + ++indice +": " + cadenaSinEspacios);
        System.out.println("Frase #" + ++indice +": " + cadenaSinEspacios.toUpperCase());
        System.out.println("Frase #" + ++indice +": " + cadenaSinEspacios.toUpperCase().replaceAll(abc,"I"));
        System.out.println("Frase #" + ++indice +": " + cadenaSinEspacios.toUpperCase().replaceAll(abc,"U"));
        System.out.println("Frase #" + ++indice +": " + cadenaSinEspacios.replace("mosca", "MOSCOTA"));
        cadenaSinEspacios += " PINTADA DE ROJO";
        System.out.println("Frase #" + ++indice +": " + cadenaSinEspacios);
    }
}