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
		  
		  System.out.println("1. Matricula del Alumno");
		  System.out.println("2. Baja del Alumno");
		  System.out.println("3. Alta de portatil");
		  System.out.println("4. Consulta portátil asignado a un alumno");
		  System.out.println("5. Consulta alumno asignado a un portátil");
		  System.out.println("6. Ver todos los alumnos con su asignación de portátil");
		  System.out.println("7. Salir");
		  
		  System.out.println("Introduce una de las opciones: ");
		  opcion = sn.nextInt();
		  
		  //DTO para alumno
		  alumnoDTO dtoAlumno;
		  alumno Alumno;
		  
		  //DTO para portatil
		  portatilDTO dtoPortatil;
		  portatil Portatil;
		  
		 List<portatil>listaPortatil = consulta.listPortatil();
		 Scanner scan = new Scanner(System.in);
		  
		  
		  try {
			  switch(opcion) {
			  case 1: 
				   
				  
				 dtoAlumno = aDto.aAlumnoDTONormal(30, "MC345", "Moises", "633234567" ,listaPortatil.get(1) );
				 Alumno = aDao.alumnoDTOADAO(dtoAlumno);
				 consulta.insertarUnAlumno(Alumno);
				 
				  break;
			  case 2: 
				  System.out.println("Introduce el codigo del alumno a eliminar: ");
				  Integer codAlumno = scan.nextInt();
			      consulta.eliminarUnAlumno(codAlumno);
				
				  
				  break;
			  case 3: 
				  dtoPortatil = aDto.aPortatilDTONormal(5, "MD919", "Apple" , "Apple");
				  Portatil = aDao.portatilDTOADAO(dtoPortatil);
				  consulta.insertarUnPortatil(Portatil);
				  
				  break;
			  case 4: 
				  
				
				  
				  break;
			  case 5: 
				  
				//Busueda de un alumno introduciendo el id del portatil
					
					System.out.println("Introduce el id del portatil para buscar su alumno.");
					Integer idPortatil=scan.nextInt();
					Alumno = consulta.buscarAlumnoPorIdPortatil(idPortatil);
					System.out.println("El alumno asignado a este portatil es: " + Alumno.getNombre());
				
				  break;
			  case 6: 
				  
				//Listado de todos los alumnos con su portatil asignado
					List<alumno>listaAlumnos= consulta.listaAlumnos();
					for(alumno alumno : listaAlumnos) {
						System.out.println("Alumno: " + alumno.getNombre() + " " + " Portatil: " + alumno.getPortatil().getMarca()+ " / " +alumno.getPortatil().getModelo());
					}
				
			  break;
			  case 7: 
				  
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
