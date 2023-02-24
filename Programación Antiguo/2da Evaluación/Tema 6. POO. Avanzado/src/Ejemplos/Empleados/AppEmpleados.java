/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos.Empleados;

/**
 *
 * @author maraloed
 */
public class AppEmpleados {
    public static void main(String[] args) {
        Empleado emp1= new Empleado();
        emp1.setNombre("Juan");
        emp1.setApellidos("Garcia");
        emp1.setSalarioBase(1000);
        
        Programador prog1 = new Programador();
        prog1.setNombre("Macarena");
        prog1.setApellidos("Cuenca");
        prog1.setSalarioBase(3000);
        prog1.setHoras(100);
        prog1.setPrecioHora(50);
        System.out.println(prog1.toString());
        System.out.println(prog1.salarioMes());
        
        Programador prog2= new Programador("Lucia","Garcia", 1500);
        System.out.println(prog2.salarioMes());
    }
    
}
