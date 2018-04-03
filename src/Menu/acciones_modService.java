package Menu;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/**
 *
 * @author Dave
 * Clase para guardar los servicion para hacer y deshacer
 */
public class acciones_modService {
    //listas para guardar los datos
    LinkedList  serId  = new LinkedList();
    LinkedList  serNo  = new LinkedList();
    LinkedList  ser15 = new LinkedList();
    LinkedList  ser30  = new LinkedList();
    LinkedList  ser45 = new LinkedList();
    LinkedList  ser60 = new LinkedList();
   
    LinkedList  serIdR  = new LinkedList();
    LinkedList  serNoR  = new LinkedList();
    LinkedList  ser15R = new LinkedList();
    LinkedList  ser30R  = new LinkedList();
    LinkedList  ser45R = new LinkedList();
    LinkedList  ser60R = new LinkedList();
   
    public void guardarServicioMod(ResultSet rst){
        try {
              if (rst.first()) {
            
                serId.push(rst.getInt(1));
                    System.out.println("Se guardo idMotor: "+ serId.peek());
                serNo.push(rst.getInt(2));
                    System.out.println("Se guardo noMotor: "+ serNo.peek());     
                ser15.push(rst.getInt(3));
                    System.out.println("precio de servicio de 15k guardado: : "+ser15.peek());
                ser30.push(rst.getInt(4));
                    System.out.println("precio de servicio de 30k guardado: "+ser30.peek());
                ser45.push(rst.getInt(5));
                    System.out.println("precio de servicio de 45k guardado: "+ser45.peek());
                ser60.push(rst.getInt(6));
                    System.out.println("precio de servicio de 60k guardado: "+ser60.peek());
               
                  System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("\nTamaño de la pila cilindraje: "+serId.size());
                  System.out.println("\nTamaño de la pila no motor: "+ser15.size()
                  +"\ntamaño de la pila de 30k: "+ser30.size()
                  +"\nTamaño de la pila de 45k: "+ser45.size()
                  +"\nTamaño de la pila de 60K: "+ser60.size());
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error al guardar servicio: "+e.getMessage());
        }
    }
    
     public void guardarServicioModRetorno(ResultSet rst){
        try {
              if (rst.first()) {
                System.out.println("*********************************************************************************\n");
                serIdR.push(rst.getInt(1));
                    System.out.println("Se guardo idMotor: "+ serIdR.peek());
                serNoR.push(rst.getInt(2));
                    System.out.println("Se guardo noMotor: "+ serNoR.peek());     
                ser15R.push(rst.getInt(3));
                    System.out.println("precio de servicio de 15k guardado: : "+ser15R.peek());
                ser30R.push(rst.getInt(4));
                    System.out.println("precio de servicio de 30k guardado: "+ser30R.peek());
                ser45R.push(rst.getInt(5));
                    System.out.println("precio de servicio de 45k guardado: "+ser45R.peek());
                ser60R.push(rst.getInt(6));
                    System.out.println("precio de servicio de 60k guardado: "+ser60R.peek());
               
                  System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("\nTamaño de la pila R cilindraje: "+serIdR.size());
                  System.out.println("\nTamaño de la pila R no motor: "+ser15R.size()
                  +"\ntamaño de la pila R de 30k: "+ser30R.size()
                  +"\nTamaño de la pila R de 45k: "+ser45R.size()
                  +"\nTamaño de la pila R de 60K: "+ser60R.size());
                  System.out.println("*********************************************************************************\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
     
     public int moverId(){
         int id = 0;
         if (serId.size() != 0) {
             id = (int) serId.peek();
             serId.pop();
            System.out.println("moviendo index "+id+" id en stk-id");    
            System.out.println("Tamaño de la pila idR: "+serId.size());
            System.out.println("");
         }
         return id;
     }
     
     public int moverNo(){
         int no = 0;
         if (serNo.size() != 0) {
             no = (int) serNo.peek();
             serNo.pop();
            System.out.println("moviendo no_Motor "+no+" en stk-no");    
            System.out.println("Tamaño de la pila idR: "+serNo.size());
            System.out.println("");
         }
         return no;
     }
     public int mover30(){
         int tre = 0;
         if (ser30.size() != 0) {
             tre = (int) ser30.peek();
             ser30.pop();
            System.out.println("moviendo 30k "+tre+"  en stk-30");    
            System.out.println("Tamaño de la pila 30kR: "+ser30.size());
            System.out.println("");
         }
         return tre;
     }
     public int mover15(){
         int qui = 0;
         if (ser15.size() != 0) {
             qui = (int) ser15.peek();
             ser15.pop();
            System.out.println("moviendo 15K "+qui+"  en stk-15");    
            System.out.println("Tamaño de la pila 15R: "+ser15.size());
            System.out.println("");
         }
         return qui;
     }
     public int mover45(){
         int cua = 0;
         if (ser45.size() != 0) {
             cua = (int) ser45.peek();
             ser45.pop();
            System.out.println("moviendo 45K "+cua+" en stk-45");    
            System.out.println("Tamaño de la pila idR: "+ser45.size());
            System.out.println("");
         }
         return cua;
     }
     public int mover60(){
         int six = 0;
         if (ser60.size() != 0) {
             six = (int) ser60.peek();
             ser60.pop();
            System.out.println("moviendo 60K "+six+" en stk-60K");    
            System.out.println("Tamaño de la pila idR: "+ser60.size());
            System.out.println("");
         }
         return six;
     }
    /*****************************************************************************************************/
     public int moverIdR(){
         int id = 0;
         if (serIdR.size() != 0) {
             id = (int) serIdR.peek();
             serIdR.pop();
            System.out.println("moviendo index "+id+" id en stk-idR");    
            System.out.println("Tamaño de la pila idR: "+serIdR.size());
            System.out.println("");
         }
         return id;
     }
     
     public int moverNoR(){
         int no = 0;
         if (serNoR.size() != 0) {
             no = (int) serNoR.peek();
             serNoR.pop();
            System.out.println("moviendo no_Motor "+no+" en stk-noR");    
            System.out.println("Tamaño de la pila idR: "+serNoR.size());
            System.out.println("");
         }
         return no;
     }
     public int mover30R(){
         int tre = 0;
         if (ser30R.size() != 0) {
             tre = (int) ser30R.peek();
             ser30R.pop();
            System.out.println("moviendo 30k "+tre+"  en stk-30R");    
            System.out.println("Tamaño de la pila 30kR: "+ser30R.size());
            System.out.println("");
         }
         return tre;
     }
     public int mover15R(){
         int qui = 0;
         if (ser15R.size() != 0) {
             qui = (int) ser15R.peek();
             ser15R.pop();
            System.out.println("moviendo 15K "+qui+"  en stk-15R");    
            System.out.println("Tamaño de la pila 15R: "+ser15R.size());
            System.out.println("");
         }
         return qui;
     }
     public int mover45R(){
         int cua = 0;
         if (ser45R.size() != 0) {
             cua = (int) ser45R.peek();
             ser45R.pop();
            System.out.println("moviendo 45K "+cua+" en stk-45R");    
            System.out.println("Tamaño de la pila idR: "+ser45R.size());
            System.out.println("");
         }
         return cua;
     }
     public int mover60R(){
         int six = 0;
         if (ser60R.size() != 0) {
             six = (int) ser60R.peek();
             ser60R.pop();
            System.out.println("moviendo 60K "+six+" en stk-60KR");    
            System.out.println("Tamaño de la pila idR: "+ser60R.size());
            System.out.println("");
         }
         return six;
     }
     
    
}
