import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import com.whatsapp.Whatsapp;

public class Main {
  public static void main(String[] args) {
    // Crear una nueva instancia de la clase Whatsapp
    final Whatsapp wa = new Whatsapp();
    
    // Establecer la clave de acceso a la API
    wa.setAccessKey("MI_CLAVE_DE_ACCESO");
    
    // Crear una nueva instancia de la clase Timer
    Timer timer = new Timer();
    
    // Programar la tarea para que se ejecute a intervalos regulares
    timer.scheduleAtFixedRate(new TimerTask() {
      public void run() {
        // Obtener la hora actual
        Calendar now = Calendar.getInstance();
        
        // Si la hora actual está entre las 7 AM y las 8 AM, enviar el mensaje
        if (now.get(Calendar.HOUR_OF_DAY) >= 7 && now.get(Calendar.HOUR_OF_DAY) < 8) {
          wa.sendMessage("+1234567890", "Hola, ¿cómo estás?");
        }
      }
    }, 0, 86400000); // Ejecutar la tarea cada 24 horas (86400000 milisegundos)
  }
}
