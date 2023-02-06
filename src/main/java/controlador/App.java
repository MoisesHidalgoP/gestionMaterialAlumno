package controlador;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import consultas.consultas;
import dal.alumno;
import dal.portatil;
import dto.ADaoServicio;
import dto.ADaoServicioImpl;
import dto.ADtoServicio;
import dto.ADtoServicioImpl;
import dto.alumnoDTO;
import dto.portatilDTO;



@Controller
public class App {
	public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml"); 
	 consultas consulta = context.getBean(consultas.class);
	  Scanner sn = new Scanner(System.in);
	  boolean salir = false;
	  //Guardamos la información del usuario
	  int opcion;
	  ADtoServicio aDto = new ADtoServicioImpl();
	  ADaoServicio aDao = new ADaoServicioImpl();
	 
	  
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
		  
		  //DTO para alumno
		  alumnoDTO dtoAlumno;
		  alumno Alumno;
		  
		  //DTO para portatil
		  portatilDTO dtoPortatil;
		  portatil Portatil;
		  
		 List<portatil>listaPortatil = consulta.listPortatil();
		  
		  
		  try {
			  switch(opcion) {
			  case 1: 
				   
				  
				 dtoAlumno = aDto.aAlumnoDTONormal(23, "MD678", "Francisco", "67890123" ,listaPortatil.get(4) );
				 Alumno = aDao.alumnoDTOADAO(dtoAlumno);
				 consulta.insertarUnAlumno(Alumno);
				 
				  break;
			  case 2: 
				
				  
				  break;
			  case 3: 
				  dtoPortatil = aDto.aPortatilDTONormal(4, "MD91", "Asus206" , "Asus");
				  Portatil = aDao.portatilDTOADAO(dtoPortatil);
				  consulta.insertarUnPortatil(Portatil);
				  
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
