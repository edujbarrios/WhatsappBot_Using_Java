import java.util.Timer;
import java.util.TimerTask;

public class WhatsAppScheduler {
  public static void main(String[] args) {
    // Creamos una nueva instancia de Timer
    Timer timer = new Timer();
    
    // Programamos la tarea para que se ejecute cada 10 minutos entre las 7:00 AM y las 8:00 AM
    long interval = 10 * 60 * 1000; // 10 minutos en milisegundos
    long startTime = get7AM().getTimeInMillis();
    long endTime = get8AM().getTimeInMillis();
    timer.schedule(new SendWhatsAppMessageTask(), startTime, interval);
    timer.schedule(new StopTask(), endTime);
  }
  
  // Devuelve un Calendar con la hora de las 7:00 AM del día de hoy
  private static Calendar get7AM() {
    Calendar now = Calendar.getInstance();
    Calendar sevenAM = new GregorianCalendar(
        now.get(Calendar.YEAR),
        now.get(Calendar.MONTH),
        now.get(Calendar.DATE),
        7, 0, 0);
    return sevenAM;
  }
  
  // Devuelve un Calendar con la hora de las 8:00 AM del día de hoy
  private static Calendar get8AM() {
    Calendar now = Calendar.getInstance();
    Calendar eightAM = new GregorianCalendar(
        now.get(Calendar.YEAR),
        now.get(Calendar.MONTH),
        now.get(Calendar.DATE),
        8, 0, 0);
    return eightAM;
  }
  
  // Clase que representa la tarea de enviar un mensaje de WhatsApp
  private static class SendWhatsAppMessageTask extends TimerTask {
    public void run() {
      // Tu código para enviar el mensaje de WhatsApp a varias personas va aquí
    }
  }
  
  // Clase que representa la tarea de detener el planificador
  private static class StopTask extends TimerTask {
    public void run() {
      timer.cancel();
    }
  }
}
