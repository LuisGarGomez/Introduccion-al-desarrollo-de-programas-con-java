import java.util.Calendar;
import java.util.TimeZone;

public class HorasDelMundo {
    public static void main( String args[] ) {       

        // getting available Ids 
        Calendar calendar = Calendar.getInstance();
        System.out.println("Bienvenido \nEn este momento son las....\n");
        calendar.setTimeZone(TimeZone.getTimeZone("America/Mexico_City"));
        System.out.println("Hora en Ciudad de México: " + getHoraFormato(calendar));
        calendar.setTimeZone(TimeZone.getTimeZone("Asia/Tokyio"));
        System.out.println("Hora en Tokio, Japon: " + getHoraFormato(calendar));
        calendar.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Hora en Nueva York, U.S.A: " + getHoraFormato(calendar));
     }

     static String getHoraFormato(Calendar cal){
        String hora = cal.get(Calendar.HOUR_OF_DAY) + ":" +
                    cal.get(Calendar.MINUTE);
        return hora;
    }
}