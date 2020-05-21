/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejarraylist;

import ejarraylist.base.Empleado;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author kikis
 */
public class Ejarraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado> listaEmpleado = new ArrayList();
        Empleado emp1 =new Empleado("José García Pérez", "sistemas", 670, 30, 5,20525);
        Empleado emp2 =new Empleado("Diana Herrera Pérez", "recursos humanos", 450, 25, 0,11250);
        Empleado emp3 =new Empleado("Jessica Juarez Días", "ventas", 400, 28, 0, 11200);
        Empleado emp4 =new Empleado("Pedro Orozco Díaz", "ventas",410, 30, 0, 12300);
        Empleado emp5 =new Empleado("José Marcel Pérez", "ventas ", 680, 29, 6, 20230);
        Empleado emp6 =new Empleado("Jesús Días García", "recursos humanos ", 455, 30, 0, 13650);
        Empleado emp7 =new Empleado("Pedro Xolta Ramírez", "sistemas ", 675, 27, 0, 18225);
        Empleado emp8 =new Empleado("Javier Medina blanco", "ventas ", 400, 30, 4, 12340);
        Empleado emp9 =new Empleado("Elizabeth Villa Sosa", "sistemas ", 670, 30, 3, 20355);
        listaEmpleado.add(emp1);
        listaEmpleado.add(emp2);
        listaEmpleado.add(emp3);
        listaEmpleado.add(emp4);
        listaEmpleado.add(emp5);
        listaEmpleado.add(emp6);
        listaEmpleado.add(emp7);
        listaEmpleado.add(emp8);
        listaEmpleado.add(emp9);
        System.out.println();
        /*listaEmpleado.add(new Empleado("José García Pérez", "sistemas", 670, 30, 5));
        listaEmpleado.add(new Empleado(""José García Pérez", "sistemas", 670, 30, 5)););
        listaEmpleado.add(new Empleado("Jessica Juarez Días", "ventas", 400, 28, 0));
        listaEmpleado.add(new Empleado("Pedro Orozco Días", "ventas", 410, 30, 0));
        listaEmpleado.add(new Empleado("José Marcel Pérez", "sistemas", 680, 29, 6));
        listaEmpleado.add(new Empleado("Jesús Días García", "recursos humanos", 455, 30, 0));
        listaEmpleado.add(new Empleado("Pedro Xolta Ramírez", "sistemas", 675, 27, 0));
        listaEmpleado.add(new Empleado("Javier Medina Blanco", "ventas", 400, 30, 4));
        listaEmpleado.add(new Empleado("Elizabeth Villa Sosa", "sistemas", 670, 30, 3));
        */
       
        Iterator it=listaEmpleado.iterator();
        int j=0;
        while (it.hasNext()) {
            Empleado p=(Empleado)it.next();
            System.out.println("Nombre:"+p.getNombre()+", sueldo Mensual: "+(p.getSueldoDiario()*p.getDiasTrabajados()+p.getHorasextras()*85));
            System.out.println("Monto Correspondiente de horas  extras: "+p.getHorasextras()*85);
            System.out.println("Sueldo base diario: "+p.getSueldoDiario());
            j+=p.getSueldoMensual();
     
            System.out.println("+++++++++++++++++++++++++++++++");
        }
        Iterator iter=listaEmpleado.iterator();
        int a=0;
        while (iter.hasNext()) {
            Empleado f=(Empleado)iter.next();
            a=f.getHorasextras();
            
            if(a>5) {
                System.out.println("El que trabajo más horas extra fue:"+f.getNombre()+" con "+a+" horas trabajadas");
            }
        }
        int h=0;
        int k=0;
        Object String = null;
        Iterator flojo=listaEmpleado.iterator();
        while (flojo.hasNext()) {
            Empleado f=(Empleado)flojo.next();
            h=f.getDiasTrabajados();
            if (h<=27){
                k=f.getDiasTrabajados();
                String=f.getNombre();
            
            }
            
        }
        System.out.println("Cantidad de Empleados: "+listaEmpleado.size());
        System.out.println("Sueldo total de los empleados: "+j);
        System.out.println(String+" trabajo menos dias con "+k);
    }
    
}
