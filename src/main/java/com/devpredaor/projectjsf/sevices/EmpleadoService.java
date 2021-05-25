/**
 * 
 */
package com.devpredaor.projectjsf.sevices;

import java.util.ArrayList;
import java.util.List;

import com.devpredaor.projectjsf.entity.Empleado;

/**
 * @author Erick Michel Cruz Ceron
 * Clase que permite realizar logica de negocio para empleados.
 *
 */
public class EmpleadoService {
	
	/**
	 * Metoro que permite consultar la lista de empleados de empresas de TI.
	 * @return {@link Empleado} Lista de empleados.
	 */
	public List<Empleado> consultarEmpleados(){
		//Generar la lista de empleados a consultar.
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDeloitte = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
		empleadoIBM.setNombre("Erick");
		empleadoIBM.setPrimerApellido("Cruz");
		empleadoIBM.setSegundoApellido("Ceron");
		empleadoIBM.setPuesto("CEO");
		empleadoIBM.setEstatus(true);
	
		empleadoMicrosoft.setNombre("Jose");
		empleadoMicrosoft.setPrimerApellido("Cruz");
		empleadoMicrosoft.setSegundoApellido("Ceron");
		empleadoMicrosoft.setPuesto("Architect");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Montserrat");
		empleadoApple.setPrimerApellido("Cruz");
		empleadoApple.setSegundoApellido("Ceron");
		empleadoApple.setPuesto("Product Owner");
		empleadoApple.setEstatus(true);
		
		empleadoNetflix.setNombre("Michel");
		empleadoNetflix.setPrimerApellido("Cruz");
		empleadoNetflix.setSegundoApellido("Ceron");
		empleadoNetflix.setPuesto("CEO");
		empleadoNetflix.setEstatus(true);
	
		empleadoAmazon.setNombre("Armado");
		empleadoAmazon.setPrimerApellido("Cruz");
		empleadoAmazon.setSegundoApellido("Ceron");
		empleadoAmazon.setPuesto("Architect");
		empleadoAmazon.setEstatus(true);
		
		empleadoHP.setNombre("Soledad");
		empleadoHP.setPrimerApellido("Cruz");
		empleadoHP.setSegundoApellido("Ceron");
		empleadoHP.setPuesto("Product Owner");
		empleadoHP.setEstatus(true);
		
		empleadoDeloitte.setNombre("Montse");
		empleadoDeloitte.setPrimerApellido("Cruz");
		empleadoDeloitte.setSegundoApellido("Ceron");
		empleadoDeloitte.setPuesto("CEO");
		empleadoDeloitte.setEstatus(true);
	
		empleadoOracle.setNombre("Diego");
		empleadoOracle.setPrimerApellido("Cruz");
		empleadoOracle.setSegundoApellido("Ceron");
		empleadoOracle.setPuesto("Architect");
		empleadoOracle.setEstatus(true);
		
		empleadoDisney.setNombre("Cesar");
		empleadoDisney.setPrimerApellido("Cruz");
		empleadoDisney.setSegundoApellido("Ceron");
		empleadoDisney.setPuesto("Product Owner");
		empleadoDisney.setEstatus(true);
		
		empleados.add(empleadoNetflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoHP);
		empleados.add(empleadoOracle);
		empleados.add(empleadoDisney);
		empleados.add(empleadoIBM);
		empleados.add(empleadoApple);
		empleados.add(empleadoMicrosoft);
		
		return empleados;
	}

}
