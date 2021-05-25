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
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoApple);
		empleados.add(empleadoMicrosoft);
		
		return empleados;
	}

}
