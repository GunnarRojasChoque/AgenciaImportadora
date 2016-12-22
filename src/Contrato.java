
import agenciasisii.Conexion;
import java.util.Calendar;
import java.util.GregorianCalendar;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gunnar
 */
class Contrato {
    
  private long id_empleado;  
  
  private long id_empleado_cargo;
  
  private long salario;
  private GregorianCalendar fecha_inicio;
  private GregorianCalendar fecha_fin;
  private GregorianCalendar fecha_actual;
  
  private String descripcion;
  Conexion con;
    private String[] args;
  public Contrato(Conexion con){
      this.con=con;
      IUContratoOpc contratoOpciones=new IUContratoOpc(con);
      //IUContrato iuc = new IUContrato(con);
     //////////////////////////////// IUContratoBuscar iu=new IUContratoBuscar(con);
      ////////////////////////////iu.setVisible(true);
     // iuc.setVisible(true);
  }

//    public Contrato(long id_empleado, long id_empleado_cargo, long salario, GregorianCalendar fecha_inicio, GregorianCalendar fecha_fin, GregorianCalendar fecha_actual, String descripcion) {
//        this.id_empleado = id_empleado;
//        this.id_empleado_cargo = id_empleado_cargo;
//        this.salario = salario;
//        this.fecha_inicio = fecha_inicio;
//        this.fecha_fin = fecha_fin;
//        this.fecha_actual = fecha_actual;
//        this.descripcion = descripcion;
//    }
//  
  

//    public boolean llenar(long id_empleado, long id_empleado_cargo, long salario,GregorianCalendar fecha_inicio, GregorianCalendar fecha_fin, GregorianCalendar fecha_actual, String descripcion) {
//        this.id_empleado = id_empleado;
//        this.id_empleado_cargo = id_empleado_cargo;
//        this.salario = salario;
//        this.fecha_inicio = fecha_inicio;
//        this.fecha_fin = fecha_fin;
//        this.fecha_actual = fecha_actual;
//        this.descripcion = descripcion;
        
       
//        String sql="select insertarEmpleado( )";
//        con.resultado(sql)
    //    long id=1;
      //  return true;
   // }
  
  
   
    
}
