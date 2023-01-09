import java.util.Timer;
import java.util.TimerTask;
import com.whatsapp.API;

public class WhatsAppScheduler {
  public static void main(String[] args) {
    // Creamos una nueva instancia de Timer
    Timer timer = new Timer();

    // Programamos la tarea para que se ejecute cada 10 minutos entre las 6:00 AM y las 8:00 AM
    // Si tenemos mas de 6 personas, se enviarán a horas aleatorias entre este baremo de horas
    Random random = new Random();
    
    int minute = random.nextInt(120) + 360;
    long interval = 10 * 60 * 1000; // 10 minutos en milisegundos
    long startTime = get7AM().getTimeInMillis();
    long endTime = get8AM().getTimeInMillis();
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
            new Message("+34666111222", "Hola!💙"),
            new Message("+34666444111", "Se puede hacer un \n Punto y aparte \n Por si no lo sabías"),
            new Message("+3466666666", "Date cuenta de esto \n\n Es importante el doble salto")
        );
  // Si la hora actual está entre las 7 AM y las 8 AM, enviar el mensaje
        if (now.get(Calendar.HOUR_OF_DAY) >= 7 && now.get(Calendar.HOUR_OF_DAY) < 8) {        // Envía cada mensaje a su destinatario correspondiente
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

  // Clase que representa la tarea de detener el planificador
  private static class StopTask extends TimerTask {
    public void run() {
      timer.cancel();
    }
  }  0, 86400000); // Ejecutar la tarea cada 24 horas (86400000 milisegundos) en caso de querer cambiar mensajes, ejecutar el fichero de nuevo
}
