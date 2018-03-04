package Menu;
import java.util.LinkedList;
/**
 *
 * @author Dave
 * modulo para la acccion de hacer y deshacer
 */
public class acciones_dh {
    
    LinkedList  vehiculo= new LinkedList();
    LinkedList servicio = new LinkedList();
    LinkedList rendimiento = new LinkedList();
    LinkedList adicionales = new LinkedList();
    LinkedList adicioCorro = new LinkedList();
    LinkedList adicioRobo = new LinkedList();
    LinkedList adicioResp = new LinkedList();
    LinkedList cilindraje = new LinkedList();
    LinkedList garantia = new LinkedList();
    
    
    LinkedList adicionalesB = new LinkedList();
    LinkedList adicioCorroB = new LinkedList();
    LinkedList adicioRoboB = new LinkedList();
    LinkedList adicioRespB = new LinkedList();
    LinkedList kmB = new LinkedList();
    LinkedList ciudadB = new LinkedList();
    LinkedList vehiculoB = new LinkedList();
    LinkedList cilindrajeB = new LinkedList();
    LinkedList garantiaB = new LinkedList();
    
  
    public void guardarVehiculo(String numeroDeMotor,String tipo, String nombre){
        vehiculo.push(numeroDeMotor);
        vehiculo.push(tipo);
        vehiculo.push(nombre);
        System.out.println("guardado en stk-vehiculo");
    }
    
    public void guardarServicio(String quince, String treinta, String cuarenta,  String sesenta){
        servicio.push(quince);
        servicio.push(treinta);
        servicio.push(cuarenta);
        servicio.push(sesenta);
        
        System.out.println("guardado en stk-servicio");
    }
    
    public void guardarRendimiento(String ciudad, String carretera, String combinado, String hp){
        rendimiento.push(ciudad);
        rendimiento.push(carretera);
        rendimiento.push(combinado);
        rendimiento.push(hp);
        
        System.out.println("guardado en stk-rendimiento");
    }
    
    public void guardarAdicionales(String numeroSerie, String seguro, String mantoCorrectivo, String pintura){
        adicionales.push(numeroSerie);          //1a -> 4b
        adicionales.push(seguro);               //2a -> 3b
        adicionales.push(mantoCorrectivo);      //3a -> 2b
        adicionales.push(pintura);              //4a -> 1b
        
        System.out.println("guardado en stk-adicionales");
    }
    
    public void guardarCorrocion(String corrocionTipo){
        adicioCorro.push(corrocionTipo);
        
        System.out.println("guardado en stk-adicorro");
    }
    
    public void guardarRespaldo(String respaldo){
        adicioResp.push(respaldo);
        
        System.out.println("guardado en stk-adioResp");
    }
    
    public void guardarRobo(String robo){
        adicioRobo.push(robo);
        System.out.println("guardado en stk-adicioRobo");
    }
    
    public void guardarCilindraje(int cmbIndexCilindraje){
        cilindraje.push(cmbIndexCilindraje);
        System.out.println("guardado en stk-cilindraje");
    }
    
    public void guardarGarantia(int cmbIndexGarantia){
        garantia.push(cmbIndexGarantia);
        System.out.println("guardado en stk-garantia\n");
    }
    
    
    /***************************************************************************************************************/
    /***************************************************************************************************************/
    /***************************************************************************************************************/
    public boolean moverCorrocion(){
        //true para si, false para no
        Boolean band = true;
        String co = (String) adicioCorro.peek();
        
            if (co.equals("cosi")) {
                adicioCorroB.push(adicioCorro.pop());
            
                System.out.println("moviendo adicioCorro en stk-adicorroB");
            }else{
                band = false;
                adicioCorroB.push(adicioCorro.pop());
                
                System.out.println("moviendo adicioCorro NO en stk-adicorroB");
            }
       
        return band;
    }
    
    public boolean moverRobo(){
        //true para si, false para no
        Boolean band = true;   
        String co = (String) adicioRobo.peek();
            if (co.equals("rosi")) {
                adicioRoboB.push(adicioRobo.pop());
                System.out.println("moviendo adicioRobo en stk-adiroboB");

            }else{
                band = false;
                adicioRoboB.push(adicioRobo.pop());
                System.out.println("moviendo adicioRobo NO en stk-adiroboB");

            }
        return band;
    }
    
    public boolean moverRespaldo(){
        //true para si, false para no
         Boolean band = true;
           
         String co = (String) adicioResp.peek();
        
            if (co.equals("resi")) {
            adicioRespB.push(adicioResp.pop());
            System.out.println("moviendo adicioResp en stk-adicioresB");
        
            }else{
                band = false;
                adicioRespB.push(adicioResp.pop());
                System.out.println("moviendo adicioResp NO en stk-adicioresB");
            }
        return band;
    }
    
    public String moverAdicionales(){
        String tor = "";
        if (adicionales.size() != 0) {   
            tor = (String) adicionales.peek();
            adicionalesB.push(adicionales.pop());
            System.out.println("moviendo adicionales en stk-adicionalesB");
        
        }else {
            return "";
        }
        return tor;
    }
    
    public String moverRendimientoKml(){
        String kml = "";
        if (rendimiento.size() != 0) {
            kml = (String) rendimiento.peek();
            kmB.push(rendimiento.pop());
            System.out.println("moviendo rendimiento en stk-kmB");
        
        }else{
            return "";
        }
        return kml;
    }
    
    public String moverKm(){
        String km = "";
        if (servicio.size() != 0) {
            km = (String) servicio.peek();
            ciudadB.push(servicio.pop());
            System.out.println("moviendo servicio en stk-ciudadB");
        
        }else{
            km = "";
        }
        return km;
    }
   
    public String moverVehiculo(){
     String ve = "";
        if (vehiculo.size() != 0) {
            ve = (String) vehiculo.peek();
            vehiculoB.push(vehiculo.pop());
            System.out.println("moviendo vehiculo en stk-vehiculoB");
        
        }else{
            ve = "";
        }
        return ve;
    }
    
    public int moverGarantia(){
        int garan = 0;
        if (garantia.size() != 0) {
            garan = (int) garantia.peek();
            garantiaB.push(garantia.pop());
            System.out.println("moviendo index "+garan+" garantia en stk-garantiaB");
        }
        return garan;
    }
    
    public int moverCilindraje(){
        int cil = 0;
        if (cilindraje.size() != 0) {
            cil = (int) cilindraje.peek();
            cilindrajeB.push(cilindraje.pop());
            System.out.println("moviendo index "+cil+" cilindraje en stk-cilindrajeB");
        }
        return cil;
    }
    
}
