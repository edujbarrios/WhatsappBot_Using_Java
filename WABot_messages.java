import java.util.Timer;
import java.util.TimerTask;
import com.whatsapp.Whatsapp;

public class WhatsAppScheduler {
  public static void main(String[] args) {
    // Creamos una nueva instancia de Timer
    Timer timer = new Timer();

    // Los mensajes programados se envien aleatoriamente entre 7:30 AM y las 8:00 AM
    Random random = new Random();
    
    int minute = random.nextInt(30) + 1800; // Segundos
    timer.schedule(new SendWhatsAppMessageTask(), startTime, interval);
    timer.schedule(new StopTask(), endTime);
  }

  // Clase que representa la tarea de enviar un mensaje de WhatsApp
  private static class SendWhatsAppMessageTask extends TimerTask {
    public void run() {
   public class Main {
    public static void main(String[] args) {
        // Inicializa la API de WhatsApp
        API api = new API();
        api.login("YOUR_PHONE_NUMBER", "YOUR_PASSWORD");

        // Crea una lista de mensajes y destinatarios
        List<Message> messages = Arrays.asList(
            new Message("+3466611122", "Hola!💙"),
            new Message("+3466644411", "Se puede hacer un \n Punto y aparte \n Por si no lo sabías"),
            new Message("+3466666666", "Date cuenta de esto \n\n Es importante el doble salto")
        );
  // Si la hora a la que se ejecuta el secript se encuentra entre las 7:30 AM y las 8 AM, enviar mensajes programdos
        if (c.get(Calendar.HOUR_OF_DAY.MINUTE) >= 7, 30 && now.get(Calendar.HOUR_OF_DAY.MINUTE) < 8, 0) {  
        do (Message message : messages) {
            api.sendMessage(message.getRecipient(), message.getText());   
        }
        }

        // Cierra la sesión de la API de WhatsApp
        api.logout();
    }

    private static class Message {
        private String recipient;
        private String text;

        public Message(String recipient, String text) {
            this.recipient = recipient;
            this.text = text;
        }

        public String getRecipient() {
            return recipient;
        }

        public String getText() {
            return text;
      }
     }
    }
   }
  }

  // Clase que representa la tarea de detener el planificador cuando sea necesario
  private static class StopTask extends TimerTask {
    public void run() {
      timer.cancel();
    }
  // Programación de la hora a la que se ejecuta el script
  }  c.set(Calendar.HOUR_OF_DAY, 7);
        c.set(Calendar.MINUTE, 30);
        c.set(Calendar.SECOND, 0);
        
        CuandoSeEjecuta = c.getTime();
        int ejecucion_script = 86400000;) // Ejecuta la tarea cada 24 horas (86400000 milisegundos)
}
