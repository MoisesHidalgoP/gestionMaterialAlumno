package controlador;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import consultas.consultas;



@Controller
public class App {
	public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml"); 
	 consultas consulta = context.getBean(consultas.class);
	  Scanner sn = new Scanner(System.in);
	  boolean salir = false;
	  //Guardamos la información del usuario
	  int opcion;
	 
	  
	  while(!salir) {
		  
		  System.out.println("Matricula del Alumno");
		  System.out.println("Baja del Alumno");
		  System.out.println("Alta de portatil");
		  System.out.println("Consulta portátil asignado a un alumno");
		  System.out.println("Consulta alumno asignado a un portátil");
		  System.out.println("Ver todos los alumnos con su asignación de portátil");
		  System.out.println("Salir");
		  
		  System.out.println("Introduce una de las opciones: ");
		  opcion = sn.nextInt();
		  
		  
		  try {
			  switch(opcion) {
			  case 1: 
				 
				  break;
			  case 2: 
				
				  
				  break;
			  case 3: 
				  
				  
				  break;
			  case 4: 
				 
				  break;
			  case 5: 
				
				  break;
			  case 6: 
				
			  break;
			  case 8: 
				  
				  System.out.println("Gracias por utilizar la aplicación");
				  salir = true;
				  
				  break;
				  
				  default:
					  System.out.println("Tiene que ser un número entre 1 y 7");
			  }
			  } catch (InputMismatchException e) {
	                System.out.println("Debes insertar un número");
	                sn.next();
	            }
			  
		  }
		  
	}
}
