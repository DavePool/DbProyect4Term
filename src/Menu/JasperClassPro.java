/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;

/**
 *
 * @author ADMIN
 */
public abstract class JasperClassPro {
    private static JasperReport reporte;
    private static JasperPrint reportelleno;
    private static JasperViewer visor;

    public static void llenarReporteConVehi(Connection con,String ruta,int id){
       try {
            Map parametro = new HashMap();
            parametro.put("parameter1",id);
            reporte = (JasperReport)JRLoader.loadObjectFromFile(ruta);
            reportelleno = JasperFillManager.fillReport(reporte,parametro,con);
        } catch (Exception e) {
        }
    }
    
    public static void mostrarVisorConVehi(){
        visor = new JasperViewer(reportelleno,false);
        visor.setVisible(true);
    }
    public static void llenarReporte(Connection con,String ruta){
        try {
            reporte = (JasperReport)JRLoader.loadObjectFromFile(ruta);
            reportelleno = JasperFillManager.fillReport(reporte, null,con);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void mostrarVisor(){
        visor = new JasperViewer(reportelleno,false);
        visor.setVisible(true);
    }
}