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
    
    // Obtener la hora actual
    Calendar now = Calendar.getInstance();
    
    // Establecer la hora a la que se enviará el mensaje (07:30 AM)
    Calendar sendTime = Calendar.getInstance();
    sendTime.set(Calendar.HOUR_OF_DAY, 7);
    sendTime.set(Calendar.MINUTE, 30);
    sendTime.set(Calendar.SECOND, 0);
    
    // Si la hora de envío es anterior a la hora actual, añadir un día a la hora de envío
    if (sendTime.before(now)) {
      sendTime.add(Calendar.DATE, 1);
    }
    
    // Calcular la diferencia entre la hora actual y la hora de envío
    long delay = sendTime.getTimeInMillis() - now.getTimeInMillis();
    
    // Crear una nueva instancia de la clase Timer
    Timer timer = new Timer();
    
    // Programar la tarea para que se ejecute en el futuro
    timer.schedule(new TimerTask() {
      public void run() {
        // Enviar el mensaje de texto
        wa.sendMessage("+1234567890", "Hola, ¿cómo estás?");
      }
    }, delay);
  }
}
