package Menu;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.JOptionPane;
public class acciones_BD {
    
    private Connection con;
    private PreparedStatement pst, pst2, pst3, pst4, pst5,
                              pst6, pst7, pst8, pst9, pst10, 
                              pst11, pst12, pst13, pst14, pst15, 
                              pst16, pst17, pstModificar, pst18;
    private ResultSet rst, rst3, rstMod,rst1;
    
    private String ruta="jdbc:mysql://localhost/concesionaria";
    private String usuario="root";
    private String password="";
    
    private String mencon, msg, msgII;
    private String consultVehiculo="select * from Vehiculo where No_Motor =?";
    
    private String modiVehiculo="update Vehiculo set Tipo=?, Nombre=?,"
            + " Cilindraje=? where No_Motor=?";
    private String modiServicio="update Servicio set 15milKM=?, 30milKM=?, 45milKM=?, 60milKM=? where ID=?";
    private String modiRendimiento="update Rendimiento set Combustible_ciudad=?, "
            + "Combustible_Carretera=?, Combustible_Combinado=?, Potencia=?, "
            + "Vehiculo_No_Motor=? where ID=?";
    private String modiAdicionales = "UPDATE adicionales SET No_Serie = ?, Seguro = ?, Mantenimiento_Correctivo = ?,"
            + " Robo = ?, Corrosion = ?, Pintura = ?, Garantia = ? , Respaldo = ? "
            + "WHERE Vehiculo_No_Motor = ?";
    
    private String user = "select * from user where (User = ? and Pass = ?)";
    private String typeOfUser = "select TypeOfUser from user where User = ?";
    
    private String userAdd = "insert into user(User, Pass, TypeOfUser) values(?, ?, ?)";
    private String exist = "SELECT `User` FROM `user` WHERE User= ?";///////
    private String vehiculoInsert = "insert into Vehiculo(No_Motor, Tipo,"
            + " Nombre, Cilindraje) values(?,?,?,?)";
    
    private String adicionales = "insert into"
            + " Adicionales(No_Serie,Seguro,Mantenimiento_Correctivo,Robo,Corrosion,"
            + " Pintura,Garantia,Respaldo, Vehiculo_No_Motor) values(?,?,?,?,?,?,?,?,?)";
    private String rendimiento= "insert into Rendimiento(Combustible_ciudad, Combustible_Carretera,"
            + "Combustible_Combinado,Potencia, Vehiculo_No_Motor,ID)values(?, ?, ?, ?, ?, ?)";
   
    private String eliminar1="delete from Vehiculo where No_Motor=?";
    private String adduser = "insert into user(User, Pass, TypeOfUser) values(?, ?, ?)";
    private String servi = "INSERT INTO `Servicio` (`Vehiculo_No_Motor`, `15milKM`, `30milKM`, `45milKM`, `60milKM`) VALUES (?, ?, ?, ?, ?)";
    private String toMod ="";
    
    private String conUser = "select User, TypeOfUser from user";
    
    public String conexioBD(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(ruta, usuario, password);
            mencon="Conectado";
        }
        catch(Exception e){
            mencon ="Desconectado";
        }
        return mencon;
    }
    
    public ResultSet consultarBDVehiculo(int No_Motor){
        try{
            pst = con.prepareStatement(consultVehiculo);
            pst.setInt(1, No_Motor);
            rst = pst.executeQuery();
            System.out.println("Registro encontrado");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return rst;
    }
    
    
    public ResultSet llenarTabla(){
        try {
            pst2=con.prepareStatement("select Vehiculo.No_Motor, Vehiculo.Tipo,"
                    + " Vehiculo.Nombre, Vehiculo.Cilindraje, "
                    + "Rendimiento.Combustible_ciudad, Rendimiento.Combustible_Carretera,"
                    + " Rendimiento.Combustible_Combinado, Rendimiento.Potencia, "
                    + "Adicionales.No_Serie, Adicionales.Seguro, "
                    + "Adicionales.Mantenimiento_Correctivo, "
                    + "Adicionales.Robo, Adicionales.Corrosion, Adicionales.Pintura,"
                    + " Adicionales.Garantia, "
                    + "Adicionales.Respaldo from "
                    + "Vehiculo inner join Rendimiento on Vehiculo.No_Motor = Rendimiento.Vehiculo_No_Motor "
                    + "inner join Adicionales on Vehiculo.No_Motor = Adicionales.Vehiculo_No_Motor");
            rst=pst2.executeQuery();
            return rst;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rst;
    }
    
    public ResultSet llenarTabla2(){
        try {
            pst3=con.prepareStatement("select Vehiculo.Tipo, Vehiculo.Nombre, Servicio.15milkm, Servicio.30milkm, Servicio.45milkm, Servicio.60milkm from Vehiculo inner join Servicio on Vehiculo.No_Motor = Servicio.Vehiculo_No_Motor");
            rst=pst3.executeQuery();
            return rst;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rst;
    }
    
    public ResultSet llenarTabla3(){
        try {
            pst3=con.prepareStatement("select Vehiculo.Nombre, Servicio.15milkm, Servicio.30milkm, Servicio.45milkm, Servicio.60milkm from Vehiculo inner join Servicio on Vehiculo.No_Motor = Servicio.Vehiculo_No_Motor");
            rst=pst3.executeQuery();
            return rst;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rst;
    }
    
    public ResultSet modivehiculo(){
        try {
            pst4=con.prepareStatement("select * from Vehiculo");
            rst=pst4.executeQuery();
            return rst;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rst;
    }
    
    public ResultSet modiservicio(){
        try {
            pst7=con.prepareStatement("select * from Servicio");
            rst=pst7.executeQuery();
            return rst;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rst;
    }
    
    public ResultSet modirendimiento(){
        try {
            pst10=con.prepareStatement("select * from Rendimiento");
            rst=pst10.executeQuery();
            return rst;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rst;
    }
    
    public String actualizarVehiculo(int motor, String tipo, String nom, int cilin){
        try{
            pst5 = con.prepareStatement(modiVehiculo);
            pst5.setString(1, tipo);
            pst5.setString(2, nom);
            pst5.setInt(3, cilin);
            pst5.setInt(4, motor);
            pst5.executeUpdate();
            mencon="El registro de "+motor+" se actualizo con exito";
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            mencon=e.getMessage();
        }
        return mencon;
    }
    
    public String actualizarAdicionales(int noSerie, String seguro,
            String mantenimientoCorrectivo,int robo,int corrocion,String pintura, String garantia,int respaldo,int noMotor){
        try {
            pst18 = con.prepareStatement(modiAdicionales);
            pst18.setInt(1, noSerie);
            pst18.setString(2, seguro);
            pst18.setString(3, mantenimientoCorrectivo);
            pst18.setInt(4, robo);
            pst18.setInt(5, corrocion);
            pst18.setString(6, pintura);
            pst18.setString(7, garantia);
            pst18.setInt(8, respaldo);
            pst18.setInt(9, noMotor);
            pst18.executeUpdate();
            mencon = "El registro con "+noMotor+" se ha actualizado correctamente";
        } catch (Exception e) {
            System.out.println("error al actualizar servicio: "+e.getMessage());
            mencon=e.getMessage();
        }
        return mencon;
    }
    
    public String actualizarServicio(int id, float quince, float treinta, float cuarentacinco, float sesenta){
        try{
            pst6 = con.prepareStatement(modiServicio);
            pst6.setFloat(1, quince);
            pst6.setFloat(2, treinta);
            pst6.setFloat(3, cuarentacinco);
            pst6.setFloat(4, sesenta);
            pst6.setInt(5, id);
            pst6.executeUpdate();
            mencon="El registro de "+id+" se actualizo con exito";
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            mencon=e.getMessage();
        }
        return mencon;
    }
    
    public String actualizarRendimiento(int id, String com_ciudad, String com_carretera, String com_combinado, String Potencia, int motor){
        try{
            pst11 = con.prepareStatement(modiRendimiento);
            pst11.setString(1, com_ciudad);
            pst11.setString(2, com_carretera);
            pst11.setString(3, com_combinado);
            pst11.setString(4, Potencia);
            pst11.setInt(5, motor);
            pst11.setInt(6, id);
            pst11.executeUpdate();
            mencon="El registro de "+id+" se actualizo con exito";
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            mencon=e.getMessage();
        }
        return mencon;
    }
    
    public ResultSet checkUser(String user, String pass){
        try {
            pst8 = con.prepareStatement(this.user);
            pst8.setString(1, user);
            pst8.setString(2, pass);
            rst = pst8.executeQuery();
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rst;
    }
    
    public String typeOfUser(String user){
      String user2 = "";
      try {
          pst9 = con.prepareStatement(typeOfUser);
          pst9.setString(1, user);
          rst = pst9.executeQuery();
          rst.beforeFirst();
          rst.next();
          user2 = rst.getString(1);
          
      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
      return user2;
  }
    
    private static final char[] CONSTS_HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String encriptaEnMD5(String stringAEncriptar) {
        try {
            MessageDigest msgd = MessageDigest.getInstance("MD5");
            byte[] bytes = msgd.digest(stringAEncriptar.getBytes());
            StringBuilder strbCadenaMD5 = new StringBuilder(2 * bytes.length);
            for (int i = 0; i < bytes.length; i++) {
                int bajo = (int) (bytes[i] & 0x0f);
                int alto = (int) ((bytes[i] & 0xf0) >> 4);
                strbCadenaMD5.append(CONSTS_HEX[alto]);
                strbCadenaMD5.append(CONSTS_HEX[bajo]);
            }
            return strbCadenaMD5.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
    
    public String agregar1BD(int Nm, String tipo, String nom, int cili){
        try{
          pst12=con.prepareStatement(vehiculoInsert);
          pst12.setInt(1, Nm);
          pst12.setString(2, tipo);
          pst12.setString(3, nom);
          pst12.setInt(4, cili);
          pst12.execute();
          mencon="Resgistro el prodcuto en la BD";
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            mencon=e.getMessage();
        }
        return mencon;
    }
    
    public String agregar2BD(int Nos,String seg,String mc,int robo,int corr,String pint,String gara,int resp, int numMotor){
        try{
          pst13=con.prepareStatement(adicionales);
          pst13.setInt(1, Nos);
          pst13.setString(2, seg);
          pst13.setString(3, mc);
          pst13.setInt(4, robo);
          pst13.setInt(5, corr);
          pst13.setString(6, pint);
          pst13.setString(7, gara);
          pst13.setInt(8, resp);
          pst13.setInt(9, numMotor);
          pst13.execute();
          mencon="adicionales en el prodcuto en la BD";
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            mencon=e.getMessage();
        }
        return mencon;
    }
    public String agregar3BD(String ciudad,String carretera,String ambos,String potencial, int Nm){
        try{
          pst15=con.prepareStatement(rendimiento);
          pst15.setString(1, ciudad);
          pst15.setString(2, carretera);
          pst15.setString(3, ambos);
          pst15.setString(4, potencial);
          pst15.setInt(5, Nm);
          pst15.setInt(6, Nm);
          pst15.execute();
          mencon="rendimiento en el prodcuto en la BD";
        }
        catch(Exception e){
            System.out.println("Error al insertar rendimiento: "+e.getMessage());
            mencon=e.getMessage();
        }
        return mencon;
    }
    public String eliminarProducto(int No_Motor){
        try{
        pst14 = con.prepareStatement(eliminar1);
        pst14.setInt(1, No_Motor);
        pst14.execute();
        mencon="El registro de "+No_Motor+" se elimino de la BD";
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            mencon=e.getMessage();
        }
        return mencon;
    }
    
    public boolean ifExist(String user){
       String nom = "";
       boolean is = false;
       try {
           pst16 = con.prepareStatement(exist);
           pst16.setString(1, user);
           rst3 = pst16.executeQuery();
           rst3.beforeFirst();
           rst3.next();
           nom = rst3.getString(1);
           is = true;
       } catch (SQLException e) {
           System.out.println("ERROR: "+e.getMessage());
       }
       return is;
   }
    public String add(String user, String pass, int tipo){
       try {
           pst16 = con.prepareStatement(adduser);
           pst16.setString(1, user);
           pst16.setString(2, pass);
           pst16.setInt(3, tipo);
           pst16.execute();
           msg = "El Ususario ha sido añadido";
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }
       return msg;
   }
    
    public String services(int VehiculoNoMotor,float km15, float km30, float km45, float km60){
        
        try {
            pst17 = con.prepareStatement(servi);
            pst17.setInt(1, VehiculoNoMotor);
            pst17.setFloat(2, km15);
            pst17.setFloat(3, km30);
            pst17.setFloat(4, km45);
            pst17.setFloat(5, km60);
            pst17.execute();
            msgII = "servicios registrados";
        } catch (Exception e) {
            System.out.println("Error al registrar los servicion: "+ e.getMessage());
        }
        
        return msgII;
    }
    
    //consulata para el dato a modificar
    public ResultSet getModificar(int id, String tabla){
        try {
            pstModificar = con.prepareStatement("SELECT * FROM "+tabla+" WHERE No_Motor = "+id);
            rstMod = pstModificar.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al hacer consulta en la tabla "+tabla+": "+e.getMessage());
        }
        return rstMod;
    }
    
    public ResultSet getModificarOtrasTablas(int id, String tabla){
        try {
            pstModificar = con.prepareStatement("SELECT * FROM "+tabla+" WHERE Vehiculo_No_Motor = "+id);
            rstMod = pstModificar.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al hacer consulta en la tabla "+tabla+": "+e.getMessage());
        }
        return rstMod;
    }
    
    public ResultSet llenarUser(){
        try {
            pst5 = con.prepareStatement(conUser);
            rst1 = pst5.executeQuery();
            System.out.println("llenado de filas correcto!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en : "+e);
        }
        return rst1;
    }
  
}
