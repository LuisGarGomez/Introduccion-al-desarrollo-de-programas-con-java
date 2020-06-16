public class Temperatura {
    public static void main(String[] args) {
        double celsius = 0;
        double farenheit = 70.5;
        System.out.println("***Convertidos de grados Celsius***");
        System.out.println("Los grados \"Farenheit\" que voy a convertir son :");
        System.out.println(farenheit + " grados farenheit");
        celsius =(5.0/9.0)*(farenheit-32);
        System.out.println("Los grados celcius resultantes son : " + celsius + " grados celscius");
    }
}