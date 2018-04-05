package Menu;

import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/**
 *
 * @author Dave
 */
public class acciones_eliminar {
    /*
    
  _   _        _                                                            _                    
 | | (_)  ___ | |_   __ _   ___    _ __   __ _   _ _   __ _     ___  __ _  | | __ __  __ _   _ _ 
 | | | | (_-< |  _| / _` | (_-<   | '_ \ / _` | | '_| / _` |   (_-< / _` | | | \ V / / _` | | '_|
 |_| |_| /__/  \__| \__,_| /__/   | .__/ \__,_| |_|   \__,_|   /__/ \__,_| |_|  \_/  \__,_| |_|  
                                  |_|                                                            

    */
    //tabla adicionales
    LinkedList  saveSerie = new LinkedList();
    LinkedList  saveSeguro = new LinkedList();
    LinkedList  saveMantoCorrec = new LinkedList();
    LinkedList  saveRobo = new LinkedList();
    LinkedList  saveCorrocion = new LinkedList();
    LinkedList  savePintura = new LinkedList();
    LinkedList  saveGarantia = new LinkedList();
    LinkedList  saveRespaldo  = new LinkedList();
    LinkedList  saveVehiculoNoMotorA = new LinkedList();
   
    
    /*
     _   _        _                                                            _                            
    | | (_)  ___ | |_   __ _   ___    _ __   __ _   _ _   __ _     _ _   ___  | |_   ___   _ _   _ _    ___ 
    | | | | (_-< |  _| / _` | (_-<   | '_ \ / _` | | '_| / _` |   | '_| / -_) |  _| / _ \ | '_| | ' \  / _ \
    |_| |_| /__/  \__| \__,_| /__/   | .__/ \__,_| |_|   \__,_|   |_|   \___|  \__| \___/ |_|   |_||_| \___/
                                     |_|                                                                    

    */
    
    //tabla adicionales
    LinkedList  saveSerieR = new LinkedList();
    LinkedList  saveSeguroR = new LinkedList();
    LinkedList  saveMantoCorrecR = new LinkedList();
    LinkedList  saveRoboR = new LinkedList();
    LinkedList  saveCorrocionR = new LinkedList();
    LinkedList  savePinturaR = new LinkedList();
    LinkedList  saveGarantiaR = new LinkedList();
    LinkedList  saveRespaldoR  = new LinkedList();
    LinkedList  saveVehiculoNoMotorAR = new LinkedList();
   
    /*
     ___   _                  _       __  __         _     _               _ 
    / __| | |_   __ _   _ _  | |_    |  \/  |  ___  | |_  | |_    ___   __| |
    \__ \ |  _| / _` | | '_| |  _|   | |\/| | / -_) |  _| | ' \  / _ \ / _` |
    |___/  \__| \__,_| |_|    \__|   |_|  |_| \___|  \__| |_||_| \___/ \__,_|

    */
    
    
    public void guardarAdicionalesMod(ResultSet rst){
        try {
              if (rst.first()) {
                  System.out.println("*******************************GUARDANDO Adicionales****************************************\n");
                saveSerie.push(rst.getInt(1));
                  System.out.println("Se guardo AdicionalNoserie: "+ saveSerie.peek());
                saveSeguro.push(rst.getString(2));
                  System.out.println("El tipo de auto pasado guardado: "+saveSeguro.peek());
                saveMantoCorrec.push(rst.getString(3));
                    System.out.println("El nombre pasado se a guardado: "+saveMantoCorrec.peek());
                saveRobo.push(rst.getInt(4));
                     System.out.println("El tipo de cilindraje pasado guardado: "+saveRobo.peek());
                saveCorrocion.push(rst.getInt(5));
                    System.out.println("El nombre pasado se a guardado: "+saveCorrocion.peek());
                savePintura.push(rst.getString(6));
                     System.out.println("El tipo de cilindraje pasado guardado: "+savePintura.peek());
                saveGarantia.push(rst.getString(7));
                     System.out.println("El tipo de cilindraje pasado guardado: "+saveGarantia.peek());
                saveRespaldo.push(rst.getInt(8));
                    System.out.println("El nombre pasado se a guardado: "+saveRespaldo.peek());
                saveVehiculoNoMotorA.push(rst.getInt(9));
                     System.out.println("El tipo de cilindraje pasado guardado: "+saveVehiculoNoMotorA.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila cilindraje: "+saveGarantia.size());
                  System.out.println("Tamaño de la pila no motor: "+saveVehiculoNoMotorA.size());
                  System.out.println("Tamaño de la pila nombre: "+savePintura.size());
        
                  System.out.println("************************************FIN*******************************************************\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
    }
  
    /*
     ___   ___      ___         _                           __  __         _     _               _ 
    | _ ) |   \    | _ \  ___  | |_   _  _   _ _   _ _     |  \/  |  ___  | |_  | |_    ___   __| |
    | _ \ | |) |   |   / / -_) |  _| | || | | '_| | ' \    | |\/| | / -_) |  _| | ' \  / _ \ / _` |
    |___/ |___/    |_|_\ \___|  \__|  \_,_| |_|   |_||_|   |_|  |_| \___|  \__| |_||_| \___/ \__,_|

    */
     public void guardarAdicionalesModRetorno(ResultSet rst){
        try {
              if (rst.first()) {
                System.out.println("******************************Adicionales Retorno*********************************\n");
                saveSerieR.push(rst.getInt(1));
                  System.out.println("Se guardo AdicionalesRetorno serie: "+ saveSerieR.peek());
                saveSeguroR.push(rst.getString(2));
                  System.out.println("El tipo de auto pasado guardado: "+saveSeguroR.peek());
                saveMantoCorrecR.push(rst.getString(3));
                    System.out.println("El nombre pasado se a guardado: "+saveMantoCorrecR.peek());
                saveRoboR.push(rst.getInt(4));
                     System.out.println("El tipo de cilindraje pasado guardado: "+saveRoboR.peek());
                saveCorrocionR.push(rst.getInt(5));
                    System.out.println("La corrocion se ha guardado: "+saveCorrocionR.peek());
                savePinturaR.push(rst.getString(6));
                     System.out.println("La pintura se ha guardado: "+savePinturaR.peek());
                saveGarantiaR.push(rst.getString(7));
                     System.out.println("La garantia se ha guardado: "+saveGarantiaR.peek());
                saveRespaldoR.push(rst.getInt(8));
                    System.out.println("El Respaldo se a guardado: "+saveRespaldoR.peek());
                saveVehiculoNoMotorAR.push(rst.getInt(9));
                     System.out.println("El No motor se he guardado: "+saveVehiculoNoMotorAR.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila cilindraje: "+saveGarantiaR.size());
                  System.out.println("Tamaño de la pila no motor: "+saveVehiculoNoMotorAR.size());
                  System.out.println("Tamaño de la pila nombre: "+savePinturaR.size());
        
                  System.out.println("*******************************Fin***********************************************\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
     /*
         _        _   _        _                       _                __  __         _     _               _ 
        /_\    __| | (_)  __  (_)  ___   _ _    __ _  | |  ___   ___   |  \/  |  ___  | |_  | |_    ___   __| |
       / _ \  / _` | | | / _| | | / _ \ | ' \  / _` | | | / -_) (_-<   | |\/| | / -_) |  _| | ' \  / _ \ / _` |
      /_/ \_\ \__,_| |_| \__| |_| \___/ |_||_| \__,_| |_| \___| /__/   |_|  |_| \___|  \__| |_||_| \___/ \__,_|

          */    
     
     
     public int noSerieAd(){
          int mot = 0;
        if (saveSerie.size() != 0) {
            mot = (int) saveSerie.peek();
            saveSerie.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+saveSerie.size());
            System.out.println("");
        }
        return mot;
     }
     
     public String Seguro(){
         String nombre = "";
        if (saveSeguro.size() != 0) {
            nombre = (String) saveSeguro.peek();
            saveSeguro.pop();
            System.out.println("moviendo "+nombre+"  en stk-seguro");
            System.out.println("Tamaño de la pila seguro: "+saveSeguro.size());
            System.out.println("");
        }else{
            nombre = "";
        }
        return nombre;
     }
     
     public String mantoCorrectivo(){
         String nombre = "";
        if (saveMantoCorrec.size() != 0) {
            nombre = (String) saveMantoCorrec.peek();
            saveMantoCorrec.pop();
            System.out.println("moviendo "+nombre+"  en stk-mantoCorrectivo");
            System.out.println("Tamaño de la pila mantenimiento Correctivo: "+saveMantoCorrec.size());
            System.out.println("");
        }else{
            nombre = "";
        }
        return nombre;
     }
     
      public int robo(){
          int mot = 0;
        if (saveRobo.size() != 0) {
            mot = (int) saveRobo.peek();
            saveRobo.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+saveRobo.size());
            System.out.println("");
        }
        return mot;
     }
      public int corrocion(){
          int mot = 0;
        if (saveCorrocion.size() != 0) {
            mot = (int) saveCorrocion.peek();
            saveCorrocion.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+saveCorrocion.size());
            System.out.println("");
        }
        return mot;
     }
      
      public String pintura(){
         String nombre = "";
        if (savePintura.size() != 0) {
            nombre = (String) savePintura.peek();
            savePintura.pop();
            System.out.println("moviendo "+nombre+"  en stk-mantoCorrectivo");
            System.out.println("Tamaño de la pila mantenimiento Correctivo: "+savePintura.size());
            System.out.println("");
        }else{
            nombre = "";
        }
        return nombre;
     }
      public String garantia(){
         String nombre = "";
        if (saveGarantia.size() != 0) {
            nombre = (String) saveGarantia.peek();
            saveGarantia.pop();
            System.out.println("moviendo "+nombre+"  en stk-mantoCorrectivo");
            System.out.println("Tamaño de la pila mantenimiento Correctivo: "+saveGarantia.size());
            System.out.println("");
        }else{
            nombre = "";
        }
        return nombre;
     }
      public int respaldo(){
          int mot = 0;
        if (saveRespaldo.size() != 0) {
            mot = (int) saveRespaldo.peek();
            saveRespaldo.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+saveRespaldo.size());
            System.out.println("");
        }
        return mot;
     }
      public int vehiculoNoMotorAdd(){
          int mot = 0;
        if (saveVehiculoNoMotorA.size() != 0) {
            mot = (int) saveVehiculoNoMotorA.peek();
            saveVehiculoNoMotorA.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+saveVehiculoNoMotorA.size());
            System.out.println("");
        }
        return mot;
     }
     /*****************************************************************************/
     
     
     public int noSerieAdR(){
          int mot = 0;
        if (saveSerieR.size() != 0) {
            mot = (int) saveSerieR.peek();
            saveSerieR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+saveSerieR
                    .size());
            System.out.println("");
        }
        return mot;
     }
     
     public String SeguroR(){
         String nombre = "";
        if (saveSeguroR.size() != 0) {
            nombre = (String) saveSeguroR.peek();
            saveSeguroR.pop();
            System.out.println("moviendo "+nombre+"  en stk-seguro");
            System.out.println("Tamaño de la pila seguro: "+saveSeguroR.size());
            System.out.println("");
        }else{
            nombre = "";
        }
        return nombre;
     }
     
     public String mantoCorrectivoR(){
         String nombre = "";
        if (saveMantoCorrecR.size() != 0) {
            nombre = (String) saveMantoCorrecR.peek();
            saveMantoCorrecR.pop();
            System.out.println("moviendo "+nombre+"  en stk-mantoCorrectivo");
            System.out.println("Tamaño de la pila mantenimiento Correctivo: "+saveMantoCorrecR.size());
            System.out.println("");
        }else{
            nombre = "";
        }
        return nombre;
     }
     
      public int roboR(){
          int mot = 0;
        if (saveRoboR.size() != 0) {
            mot = (int) saveRoboR.peek();
            saveRobo.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+saveRoboR.size());
            System.out.println("");
        }
        return mot;
     }
      public int corrocionR(){
          int mot = 0;
        if (saveCorrocionR.size() != 0) {
            mot = (int) saveCorrocionR.peek();
            saveCorrocionR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+saveCorrocionR.size());
            System.out.println("");
        }
        return mot;
     }
      
      public String pinturaR(){
         String nombre = "";
        if (savePinturaR.size() != 0) {
            nombre = (String) savePinturaR.peek();
            savePinturaR.pop();
            System.out.println("moviendo "+nombre+"  en stk-mantoCorrectivo");
            System.out.println("Tamaño de la pila mantenimiento Correctivo: "+savePinturaR.size());
            System.out.println("");
        }else{
            nombre = "";
        }
        return nombre;
     }
      public String garantiaR(){
         String nombre = "";
        if (saveGarantiaR.size() != 0) {
            nombre = (String) saveGarantiaR.peek();
            saveGarantiaR.pop();
            System.out.println("moviendo "+nombre+"  en stk-mantoCorrectivo");
            System.out.println("Tamaño de la pila mantenimiento Correctivo: "+saveGarantiaR.size());
            System.out.println("");
        }else{
            nombre = "";
        }
        return nombre;
     }
      public int respaldoR(){
          int mot = 0;
        if (saveRespaldoR.size() != 0) {
            mot = (int) saveRespaldoR.peek();
            saveRespaldoR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+saveRespaldoR.size());
            System.out.println("");
        }
        return mot;
     }
      public int vehiculoNoMotorAddR(){
          int mot = 0;
        if (saveVehiculoNoMotorAR.size() != 0) {
            mot = (int) saveVehiculoNoMotorAR.peek();
            saveVehiculoNoMotorAR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+saveVehiculoNoMotorAR.size());
            System.out.println("");
        }
        return mot;
     }
 
}
