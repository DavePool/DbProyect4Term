
package Menu;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/**
 *
 * @author Dave
 */
public class acciones_add {
    
    LinkedList  addNoMotor = new LinkedList();
    LinkedList  addSeguro = new LinkedList();
    LinkedList  addMantoC = new LinkedList();
    LinkedList  addRobo = new LinkedList();
    LinkedList  addCorro = new LinkedList();
    LinkedList  addPintura = new LinkedList();
    LinkedList  addGarantia = new LinkedList();
    LinkedList  addResald = new LinkedList();
    LinkedList  addNoSerie = new LinkedList();
   
    LinkedList  addNoMotorR = new LinkedList();
    LinkedList  addSeguroR = new LinkedList();
    LinkedList  addMantoCR = new LinkedList();
    LinkedList  addRoboR = new LinkedList();
    LinkedList  addCorroR = new LinkedList();
    LinkedList  addPinturaR = new LinkedList();
    LinkedList  addGarantiaR = new LinkedList();
    LinkedList  addResaldR = new LinkedList();
    LinkedList  addNoSerieR = new LinkedList();
   
 
    
    public void guardarAdicionalMod(ResultSet rst){
        try {
              if (rst.first()) {
            
                addNoSerie.push(rst.getInt(1));
                  System.out.println("Se guardo idMotor: "+ addNoSerie.peek());
                addSeguro.push(rst.getString(2));
                  System.out.println("El tipo de auto pasado guardado: "+addSeguro.peek());
                addMantoC.push(rst.getString(3));
                    System.out.println("El nombre pasado se a guardado: "+addMantoC.peek());
                addRobo.push(rst.getInt(4));
                     System.out.println("El tipo de cilindraje pasado guardado: "+addRobo.peek());
                addCorro.push(rst.getInt(5));
                    System.out.println("El nombre pasado se a guardado: "+addCorro.peek());
                addPintura.push(rst.getString(6));
                     System.out.println("El tipo de cilindraje pasado guardado: "+addPintura.peek());
                addGarantia.push(rst.getString(7));
                    System.out.println("El nombre pasado se a guardado: "+addGarantia.peek());
                addResald.push(rst.getInt(8));
                     System.out.println("El tipo de cilindraje pasado guardado: "+addResald.peek());
                addNoMotor.push(rst.getInt(9));
                     System.out.println("El tipo de cilindraje pasado guardado: "+addNoMotor.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila no Motor: "+addNoMotor.size());
                  System.out.println("Tamaño de la pila no seria: "+addNoSerie.size());
                  System.out.println("Tamaño de la pila garantia: "+addGarantia.size());
        
        
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
    }
    
     public void guardarVehiculoModRetorno(ResultSet rst){
        try {
              if (rst.first()) {
                  System.out.println("*********************************************************************************\n");
                
                addNoSerieR.push(rst.getInt(1));
                  System.out.println("Se guardo idMotorR: "+ addNoSerieR.peek());
                addSeguroR.push(rst.getString(2));
                  System.out.println("El tipo de auto pasado guardado: "+addSeguroR.peek());
                addMantoCR.push(rst.getString(3));
                    System.out.println("El nombre pasado se a guardado: "+addMantoCR.peek());
                addRoboR.push(rst.getInt(4));
                     System.out.println("El tipo de cilindraje pasado guardado: "+addRoboR.peek());
                addCorroR.push(rst.getInt(5));
                    System.out.println("El nombre pasado se a guardado: "+addCorroR.peek());
                addPinturaR.push(rst.getString(6));
                     System.out.println("El tipo de cilindraje pasado guardado: "+addPinturaR.peek());
                addGarantiaR.push(rst.getString(7));
                    System.out.println("El nombre pasado se a guardado: "+addGarantiaR.peek());
                addResaldR.push(rst.getInt(8));
                     System.out.println("El tipo de cilindraje pasado guardado: "+addResaldR.peek());
                addNoMotorR.push(rst.getInt(9));
                     System.out.println("El tipo de cilindraje pasado guardado: "+addNoMotorR.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila no Motor: "+addNoMotorR.size());
                  System.out.println("Tamaño de la pila no seria: "+addNoSerieR.size());
                  System.out.println("Tamaño de la pila garantia: "+addGarantiaR.size());
        
                  System.out.println("*********************************************************************************\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
    }
    
}
