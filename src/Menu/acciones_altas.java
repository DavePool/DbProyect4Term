package Menu;

import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dave
 */
public class acciones_altas {
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
   
     //listas para guardar los datos
    LinkedList  serId  = new LinkedList();
    LinkedList  serNo  = new LinkedList();
    LinkedList  ser15 = new LinkedList();
    LinkedList  ser30  = new LinkedList();
    LinkedList  ser45 = new LinkedList();
    LinkedList  ser60 = new LinkedList();
   
    //
    LinkedList  vehiculoModNoMotor = new LinkedList();
    LinkedList  vehiculoModTipo = new LinkedList();
    LinkedList  vehiculoModNombre = new LinkedList();
    LinkedList  vehiculoModCilindraje = new LinkedList();
    
    //rendimiento
    LinkedList  rendId = new LinkedList();
    LinkedList  rendCiudad = new LinkedList();
    LinkedList  rendCarretera = new LinkedList();
    LinkedList  rendCombinado = new LinkedList();
    LinkedList  rendpotencia = new LinkedList();
    LinkedList  rendNoMotor = new LinkedList();
    
  
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
    
    LinkedList  serIdR  = new LinkedList();
    LinkedList  serNoR  = new LinkedList();
    LinkedList  ser15R = new LinkedList();
    LinkedList  ser30R  = new LinkedList();
    LinkedList  ser45R = new LinkedList();
    LinkedList  ser60R = new LinkedList();
  
    LinkedList  vehiculoModNoMotorB = new LinkedList();
    LinkedList  vehiculoModTipoB = new LinkedList();
    LinkedList  vehiculoModNombreB = new LinkedList();
    LinkedList  vehiculoModCilindrajeB = new LinkedList();
   
    LinkedList  rendIdR = new LinkedList();
    LinkedList  rendCiudadR = new LinkedList();
    LinkedList  rendCarreteraR = new LinkedList();
    LinkedList  rendCombinadoR = new LinkedList();
    LinkedList  rendpotenciaR = new LinkedList();
    LinkedList  rendNoMotorR = new LinkedList();
   
    /*
     ___   _                  _       __  __         _     _               _ 
    / __| | |_   __ _   _ _  | |_    |  \/  |  ___  | |_  | |_    ___   __| |
    \__ \ |  _| / _` | | '_| |  _|   | |\/| | / -_) |  _| | ' \  / _ \ / _` |
    |___/  \__| \__,_| |_|    \__|   |_|  |_| \___|  \__| |_||_| \___/ \__,_|

    */
    
    
    public void guardarAdicionalesMod(int noSerie, String seguro, String mantoCorrectivo,int robo, int corro,String paint, String garantia,int resp,int noMotor){
        try {
              
                System.out.println("*******************************GUARDANDO Adicionales****************************************\n");
                saveSerie.push(noSerie);
                  System.out.println("Se guardo AdicionalNoserie: "+ saveSerie.peek());
                saveSeguro.push(seguro);
                  System.out.println("El tipo de auto pasado guardado: "+saveSeguro.peek());
                saveMantoCorrec.push(mantoCorrectivo);
                    System.out.println("El nombre pasado se a guardado: "+saveMantoCorrec.peek());
                saveRobo.push(robo);
                     System.out.println("El tipo de cilindraje pasado guardado: "+saveRobo.peek());
                saveCorrocion.push(corro);
                    System.out.println("El nombre pasado se a guardado: "+saveCorrocion.peek());
                savePintura.push(paint);
                     System.out.println("El tipo de cilindraje pasado guardado: "+savePintura.peek());
                saveGarantia.push(garantia);
                     System.out.println("El tipo de cilindraje pasado guardado: "+saveGarantia.peek());
                saveRespaldo.push(resp);
                    System.out.println("El nombre pasado se a guardado: "+saveRespaldo.peek());
                saveVehiculoNoMotorA.push(noMotor);
                     System.out.println("El tipo de cilindraje pasado guardado: "+saveVehiculoNoMotorA.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila cilindraje: "+saveGarantia.size());
                  System.out.println("Tamaño de la pila no motor: "+saveVehiculoNoMotorA.size());
                  System.out.println("Tamaño de la pila nombre: "+savePintura.size());
        
                  System.out.println("************************************FIN*******************************************************\n");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
    }
    
    public void guardarServicioMod(int seriId, int noSerie,int se15,int se30, int se45,int se60){
        try {
                System.out.println("********************************GUARDANDO SERVICIO*************************************\n");
                serId.push(seriId);
                    System.out.println("Se guardo idMotor: "+ serId.peek());
                serNo.push(noSerie);
                    System.out.println("Se guardo noMotor: "+ serNo.peek());     
                ser15.push(se15);
                    System.out.println("precio de servicio de 15k guardado: : "+ser15.peek());
                ser30.push(se30);
                    System.out.println("precio de servicio de 30k guardado: "+ser30.peek());
                ser45.push(se45);
                    System.out.println("precio de servicio de 45k guardado: "+ser45.peek());
                ser60.push(se60);
                    System.out.println("precio de servicio de 60k guardado: "+ser60.peek());
               
                  System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("\nTamaño de la pila cilindraje: "+serId.size());
                  System.out.println("\nTamaño de la pila no motor: "+ser15.size()
                  +"\ntamaño de la pila de 30k: "+ser30.size()
                  +"\nTamaño de la pila de 45k: "+ser45.size()
                  +"\nTamaño de la pila de 60K: "+ser60.size());
                  System.out.println("********************************************FIN*****************************************\n");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error al guardar servicio: "+e.getMessage());
        }
    }
    
    public void guardarVehiculoMod(int noMotor, String modTipo, String modNombre, int modCilin){
        try {
                  System.out.println("*********************************GUARDANDO VEHICULO*****************************");
                vehiculoModNoMotor.push(noMotor);
                  System.out.println("Se guardo idMotor: "+ vehiculoModNoMotor.peek());
                vehiculoModTipo.push(modTipo);
                  System.out.println("El tipo de auto pasado guardado: "+vehiculoModTipo.peek());
                vehiculoModNombre.push(modNombre);
                    System.out.println("El nombre pasado se a guardado: "+vehiculoModNombre.peek());
                vehiculoModCilindraje.push(modCilin);
                     System.out.println("El tipo de cilindraje pasado guardado: "+vehiculoModCilindraje.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila cilindraje: "+vehiculoModCilindraje.size());
                  System.out.println("Tamaño de la pila no motor: "+vehiculoModNoMotor.size());
                  System.out.println("Tamaño de la pila nombre: "+vehiculoModNombre.size());
                  System.out.println("********************************FIN***********************************************\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
    }
    
    public void guardarRendimientoMod(int id, String rCiudad, String rCarretera, String rCombinado,String rpotencia,int rNoMotor ){
        try {
                System.out.println("*************************Guradando Rendimiento********************************");
                rendId.push(id);
                  System.out.println("Se guardo rendimiento Id: "+ rendId.peek());
                rendCiudad.push(rCiudad);
                  System.out.println("El rendimento ciudad guardado: "+rendCiudad.peek());
                rendCarretera.push(rCarretera);
                    System.out.println("El rendimiento carretera se a guardado: "+rendCarretera.peek());
                rendCombinado.push(rCombinado);
                     System.out.println("El tipo de rendimiento combinado guardado: "+ rendCombinado.peek());
                rendpotencia.push(rpotencia);
                     System.out.println("La potencia se a guardado: "+ rendpotencia.peek());
                rendNoMotor.push(rNoMotor);
                     System.out.println("El numero de motor se a guardado: "+ rendNoMotor.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila id Rendimiento: "+rendId.size());
                  System.out.println("Tamaño de la pila rendimiento ciudad: "+rendCiudad.size());
                  System.out.println("Tamaño de la pila rendimiento carretera: "+rendCarretera.size());
                  System.out.println("Tamaño de la pila rendimiento combinado: "+rendCombinado.size());
                  System.out.println("Tamaño de la pila potencia: "+rendpotencia.size());
                  System.out.println("Tamaño de la pila No Motor: "+rendNoMotor.size());
        
                  System.out.println("*************************************Fin********************************************");
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
     public void guardarAdicionalesModRetorno(int noSerie, String seguro, String mantoCorrectivo,int robo, int corro,String paint, String garantia,int resp,int noMotor){
        try {
                System.out.println("******************************Adicionales Retorno*********************************\n");
                saveSerieR.push(noSerie);
                  System.out.println("Se guardo AdicionalesRetorno serie: "+ saveSerieR.peek());
                saveSeguroR.push(seguro);
                  System.out.println("El tipo de auto pasado guardado: "+saveSeguroR.peek());
                saveMantoCorrecR.push(mantoCorrectivo);
                    System.out.println("El nombre pasado se a guardado: "+saveMantoCorrecR.peek());
                saveRoboR.push(robo);
                     System.out.println("El tipo de cilindraje pasado guardado: "+saveRoboR.peek());
                saveCorrocionR.push(corro);
                    System.out.println("La corrocion se ha guardado: "+saveCorrocionR.peek());
                savePinturaR.push(paint);
                     System.out.println("La pintura se ha guardado: "+savePinturaR.peek());
                saveGarantiaR.push(garantia);
                     System.out.println("La garantia se ha guardado: "+saveGarantiaR.peek());
                saveRespaldoR.push(resp);
                    System.out.println("El Respaldo se a guardado: "+saveRespaldoR.peek());
                saveVehiculoNoMotorAR.push(noMotor);
                     System.out.println("El No motor se he guardado: "+saveVehiculoNoMotorAR.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila GarantiaR: "+saveGarantiaR.size());
                  System.out.println("Tamaño de la pila no MotorAr: "+saveVehiculoNoMotorAR.size());
                  System.out.println("Tamaño de la pila pinturaR: "+savePinturaR.size());
        
                  System.out.println("*******************************Fin***********************************************\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
     
     public void guardarServicioModRetorno(int seriId, int noSerie,int se15,int se30, int se45,int se60){
        try {
                System.out.println("*********************************GUARDANDO SERVICIO RETORNO****************************************\n");
                serIdR.push(seriId);
                    System.out.println("Se guardo idMotor: "+ serIdR.peek());
                serNoR.push(noSerie);
                    System.out.println("Se guardo noMotor: "+ serNoR.peek());     
                ser15R.push(se15);
                    System.out.println("precio de servicio de 15k guardado: : "+ser15R.peek());
                ser30R.push(se30);
                    System.out.println("precio de servicio de 30k guardado: "+ser30R.peek());
                ser45R.push(se45);
                    System.out.println("precio de servicio de 45k guardado: "+ser45R.peek());
                ser60R.push(se60);
                    System.out.println("precio de servicio de 60k guardado: "+ser60R.peek());
               
                  System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("\nTamaño de la pila R cilindraje: "+serIdR.size());
                  System.out.println("\nTamaño de la pila R no motor: "+ser15R.size()
                  +"\ntamaño de la pila R de 30k: "+ser30R.size()
                  +"\nTamaño de la pila R de 45k: "+ser45R.size()
                  +"\nTamaño de la pila R de 60K: "+ser60R.size());
                  System.out.println("***************************************FIN******************************************\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
     
     public void guardarVehiculoModRetorno(int noMotor, String modTipo, String modNombre, int modCilin){
        try {
                  System.out.println("****************************GUARDANDO VEHICULO RETORNO**********************************************\n");
                vehiculoModNoMotorB.push(noMotor);
                  System.out.println("Se guardo idMotor: "+ vehiculoModNoMotorB.peek());
                vehiculoModTipoB.push(modTipo);
                  System.out.println("El tipo de auto pasado guardado: "+vehiculoModTipoB.peek());
                vehiculoModNombreB.push(modNombre);
                    System.out.println("El nombre pasado se a guardado: "+vehiculoModNombreB.peek());
                vehiculoModCilindrajeB.push(modCilin);
                     System.out.println("El tipo de cilindraje pasado guardado: "+vehiculoModCilindrajeB.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila cilindraje: "+vehiculoModCilindrajeB.size());
                  System.out.println("Tamaño de la pila no motor: "+vehiculoModNoMotorB.size());
                  System.out.println("Tamaño de la pila nombre: "+vehiculoModNombreB.size());
        
                  System.out.println("***************************************FIN***********************************************\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
     
     public void guardarRendimientoModRetorno(int id, String rCiudad, String rCarretera, String rCombinado,String rpotencia,int rNoMotor){
        try {
                  System.out.println("**************************Guardando Rendimiento Respaldo**************************\n");
                
                rendIdR.push(id);
                  System.out.println("Se guardo rendimiento Id: "+ rendIdR.peek());
                rendCiudadR.push(rCiudad);
                  System.out.println("El rendimento ciudad guardado: "+rendCiudadR.peek());
                rendCarreteraR.push(rCarretera);
                    System.out.println("El rendimiento carretera se a guardado: "+rendCarreteraR.peek());
                rendCombinadoR.push(rCombinado);
                     System.out.println("El tipo de rendimiento combinado guardado: "+ rendCombinadoR.peek());
                rendpotenciaR.push(rpotencia);
                     System.out.println("La potencia se a guardado: "+ rendpotenciaR.peek());
                rendNoMotorR.push(rNoMotor);
                     System.out.println("El numero de motor se a guardado: "+ rendNoMotorR.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila id RendimientoR: "+rendIdR.size());
                  System.out.println("Tamaño de la pila rendimiento ciudadR: "+rendCiudadR.size());
                  System.out.println("Tamaño de la pila rendimiento carreteraR: "+rendCarreteraR.size());
                  System.out.println("Tamaño de la pila rendimiento combinadoR: "+rendCombinadoR.size());
                  System.out.println("Tamaño de la pila potenciaR: "+rendpotenciaR.size());
                  System.out.println("Tamaño de la pila No MotorR: "+rendNoMotorR.size());
        
                  System.out.println("****************************************Fin*****************************************\n");
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
            System.out.println("Tamaño de la pila no robo: "+saveRobo.size());
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
            System.out.println("Tamaño de la pila corrocion: "+saveCorrocion.size());
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
            System.out.println("Tamaño de la pila pinturao: "+savePintura.size());
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
            System.out.println("Tamaño de la pila garantia: "+saveGarantia.size());
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
            System.out.println("Tamaño de la pila respaldo: "+saveRespaldo.size());
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
            System.out.println("Tamaño de la pila no serieR: "+saveSerieR
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
            System.out.println("Tamaño de la pila seguroR: "+saveSeguroR.size());
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
            System.out.println("Tamaño de la pila mantenimiento CorrectivoR: "+saveMantoCorrecR.size());
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
            saveRoboR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila roboR: "+saveRoboR.size());
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
            System.out.println("Tamaño de la pila corrocionR: "+saveCorrocionR.size());
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
            System.out.println("Tamaño de la pila pinturaR: "+savePinturaR.size());
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
            System.out.println("Tamaño de la pila garantiaR: "+saveGarantiaR.size());
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
            System.out.println("Tamaño de la pila RespaldoR: "+saveRespaldoR.size());
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
            System.out.println("Tamaño de la pila no motorR: "+saveVehiculoNoMotorAR.size());
            System.out.println("");
        }
        return mot;
     }
      
     
     public int moverId(){
         int id = 0;
         if (serId.size() != 0) {
             id = (int) serId.peek();
             serId.pop();
            System.out.println("moviendo index "+id+" id en stk-id");    
            System.out.println("Tamaño de la pila id: "+serId.size());
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
            System.out.println("Tamaño de la pila noMotor: "+serNo.size());
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
            System.out.println("Tamaño de la pila 30k: "+ser30.size());
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
            System.out.println("Tamaño de la pila 15: "+ser15.size());
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
            System.out.println("Tamaño de la pila 45k: "+ser45.size());
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
            System.out.println("Tamaño de la pila 60k: "+ser60.size());
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
            System.out.println("Tamaño de la pila noMotorR: "+serNoR.size());
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
            System.out.println("Tamaño de la pila 45R: "+ser45R.size());
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
            System.out.println("Tamaño de la pila 60R: "+ser60R.size());
            System.out.println("");
         }
         return six;
     }
     
      
    public int moverNoMotor(){
        int mot = 0;
        if (vehiculoModNoMotor.size() != 0) {
            mot = (int) vehiculoModNoMotor.peek();
            vehiculoModNoMotor.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+vehiculoModNoMotor.size());
            System.out.println("");
        }
        return mot;
    }
    public String moverTipo(){
        String tipo = "";
        if (vehiculoModTipo.size() != 0) {
            tipo = (String) vehiculoModTipo.peek();
            vehiculoModTipo.pop();
            System.out.println("Tamaño de tipo en stk-tipoB"+vehiculoModTipo.size() + vehiculoModTipoB.size());
            System.out.println("");
        }else{
            tipo = "";
        }
        return tipo;
    }
    public String moverNombre(){
        String nombre = "";
        if (vehiculoModNombre.size() != 0) {
            nombre = (String) vehiculoModNombre.peek();
            vehiculoModNombre.pop();
            System.out.println("moviendo "+nombre+"  en stk-nombreB");
            System.out.println("Tamaño de la pila nombre: "+vehiculoModNombre.size());
            System.out.println("Tamaño de la pilaB nombre: "+vehiculoModNombreB.size());
            System.out.println("");
        }else{
            nombre = "";
        }
        return nombre;
    }
    public int moverCilindraje(){
        int cil = 0;
        if (vehiculoModCilindraje.size() != 0) {
            cil = (int) vehiculoModCilindraje.peek();
            vehiculoModCilindraje.pop();
            System.out.println("moviendo index "+cil+" cilindraje en stk-cilindrajeB");    
            System.out.println("Tamaño de la pila cilindraje: "+vehiculoModCilindraje.size());
            System.out.println("Tamaño de la pila cilindrajeB: "+vehiculoModCilindrajeB.size());
            System.out.println("");
        }
        return cil;
    }
     
     // retorno a pila original
    public int moverNoMotorRetorno(){
        int mot = 0;
        if (vehiculoModNoMotorB.size() != 0) {
            mot = (int) vehiculoModNoMotorB.peek();
            vehiculoModNoMotorB.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor retorno: "+vehiculoModNoMotorB.size());
            System.out.println(""); 
        }
        return mot;
    }
    public String moverTipoRetorno(){
        String tipo = "";
        if (vehiculoModTipoB.size() != 0) {
            tipo = (String) vehiculoModTipoB.peek();
            vehiculoModTipoB.pop();
            System.out.println("moviendo tipo en stk-tipoB");
            System.out.println("");
        }else{
            tipo = "";
        }
        return tipo;
    }
     public String moverNombreRetorno(){
        String nombre = "";
        if (vehiculoModNombreB.size() != 0) {
            nombre = (String) vehiculoModNombreB.peek();
            vehiculoModNombreB.pop();
            System.out.println("moviendo "+nombre+"  en stk-nombreB");
            System.out.println("Tamaño de la pila nombre: "+vehiculoModNombreB.size());
            System.out.println("");
        }else{
            nombre = "";
        }
        return nombre;
    }
     public int moverCilindrajeRetorno(){
        int cil = 0;
        if (vehiculoModCilindraje.size() != 0) {
            cil = (int) vehiculoModCilindrajeB.peek();
            vehiculoModCilindrajeB.pop();
            System.out.println("moviendo index "+cil+" cilindraje en stk-cilindrajeB");    
            System.out.println("Tamaño de la pila cilindrajeB: "+vehiculoModCilindrajeB.size());
            System.out.println("");
        }
        return cil;
    }
    
     public int rendId(){
        int mot = 0;
        if (rendId.size() != 0) {
            mot = (int) rendId.peek();
            rendId.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+rendId.size());
            System.out.println("");
        }
        return mot;
     } 
     public String rendCiudad(){
          String mot = "";
        if (rendCiudad.size() != 0) {
            mot =  (String) rendCiudad.peek();
            rendCiudad.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendCiudad");
            System.out.println("Tamaño de la pila rendimiento ciudad: "+rendCiudad.size());
            System.out.println("");
        }
        return mot;
     }
     public String rendCarretera(){
          String mot = "";
        if (rendCarretera.size() != 0) {
            mot =  (String) rendCarretera.peek();
            rendCarretera.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendCiudad");
            System.out.println("Tamaño de la pila rendimiento carretera: "+rendCarretera.size());
            System.out.println("");
        }
        return mot;
     }
     public String rendCombinado(){
          String mot = "";
        if (rendCombinado.size() != 0) {
            mot =  (String) rendCombinado.peek();
            rendCombinado.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendCombinado");
            System.out.println("Tamaño de la pila rendimiento combinado: "+rendCombinado.size());
            System.out.println("");
        }
        return mot;
     }
     public String rendPotencia(){
          String mot = "";
        if (rendpotencia.size() != 0) {
            mot =  (String) rendpotencia.peek();
            rendpotencia.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-potencia");
            System.out.println("Tamaño de la pila potencia: "+rendpotencia.size());
            System.out.println("");
        }
        return mot;
     }
     public int rendNoMotor(){
          int mot = 0;
        if (rendNoMotor.size() != 0) {
            mot =  (int) rendNoMotor.peek();
            rendNoMotor.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendNoMotor");
            System.out.println("Tamaño de la pila no motor Rendimiento: "+rendNoMotor.size());
            System.out.println("");
        }
        return mot;
     }
     /********************************************************************************************************/
     
     public int rendIdR(){
        int mot = 0;
        if (rendIdR.size() != 0) {
            mot = (int) rendIdR.peek();
            rendIdR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+rendIdR.size());
            System.out.println("");
        }
        return mot;
     }
     public String rendCiudadR(){
          String mot = "";
        if (rendCiudadR.size() != 0) {
            mot =  (String) rendCiudadR.peek();
            rendCiudadR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendCiudad");
            System.out.println("Tamaño de la pila rendimiento ciudad: "+rendCiudadR.size());
            System.out.println("");
        }
        return mot;
     }
     public String rendCarreteraR(){
          String mot = "";
        if (rendCarreteraR.size() != 0) {
            mot =  (String) rendCarreteraR.peek();
            rendCarreteraR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendCiudad");
            System.out.println("Tamaño de la pila rendimiento carretera: "+rendCarreteraR.size());
            System.out.println("");
        }
        return mot;
     }
     public String rendCombinadoR(){
          String mot = "";
        if (rendCombinadoR.size() != 0) {
            mot =  (String) rendCombinadoR.peek();
            rendCombinadoR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendCombinado");
            System.out.println("Tamaño de la pila rendimiento combinado: "+rendCombinadoR.size());
            System.out.println("");
        }
        return mot;
     }
     public String rendPotenciaR(){
          String mot = "";
        if (rendpotenciaR.size() != 0) {
            mot =  (String) rendpotenciaR.peek();
            rendpotenciaR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-potencia");
            System.out.println("Tamaño de la pila potencia: "+rendpotenciaR.size());
            System.out.println("");
        }
        return mot;
     }
     public int rendNoMotorR(){
          int mot = 0;
        if (rendNoMotorR.size() != 0) {
            mot =  (int) rendNoMotorR.peek();
            rendNoMotorR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendNoMotor");
            System.out.println("Tamaño de la pila no motor Rendimiento: "+rendNoMotorR.size());
            System.out.println("");
        }
        return mot;
     }
}