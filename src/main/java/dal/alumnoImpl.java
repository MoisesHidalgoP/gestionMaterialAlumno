package dal;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class alumnoImpl implements alumnoServicio {
	
	@PersistenceContext
	private EntityManager em;


	@Override
	public void insertarMatriculaAlumno(alumno matricula) {
		// TODO Auto-generated method stub
		em.persist(matricula);
		
	}


	@Override
	public void eliminarAlumno(Integer codAlumno) {
		// TODO Auto-generated method stub
		try {
			
			//Borramos un alumno segun el id introducido con id_al hacemos lo mismo que he comentadon en el método anterior
			String jpql = "DELETE FROM alumno al WHERE al.codAlumno = :codAlumno";
			Query query = (Query) em.createQuery(jpql);
			((javax.persistence.Query) query).setParameter("codAlumno", codAlumno);
			int numeroEliminados = ((javax.persistence.Query) query).executeUpdate();
			System.out.println("Alumno eliminado con exito ");
			
			
	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	@Override
	public alumno buscarAlumnoPorIdPortatil(Integer idPortatil) {
		try {
			//Seleccionamos un portatil dentro de la base de datos a través de su id 
			String jpql = "SELECT portatil FROM portatil portatil WHERE portatil.idPortatil = :idPortatil";
			Query query = (Query) em.createQuery(jpql);
			((javax.persistence.Query) query).setParameter("idPortatil", idPortatil);
			//Recogemos los datos de la query dentro de una lista
			portatil Portatil = (portatil) ((javax.persistence.Query) query).getResultList();
			//Obtenemos el alumno resultante de la lista de los portatil con el método getAlumno y creamos un objeto alumno y lo devoolvemos en el return
			alumno alumnos = new alumno();
			jpql = "SELECT alumnos FROM alumno alumnos WHERE alumno.portatiles = :portatiles";
			query = (Query) em.createQuery(jpql);
			((javax.persistence.Query) query).setParameter("portatiles", Portatil);
			alumnos=(alumno)((javax.persistence.Query) query).getResultList();
			return alumnos;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}


	@Override
	public List<alumno> buscarTodos() {
		// TODO Auto-generated method stub
		try {
			//Buscamos todos los alumnos y los devolvemos en el return en forma de lista
			return em.createQuery("SELECT alumnos FROM alumno alumnos").getResultList();
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	


	


	

}
