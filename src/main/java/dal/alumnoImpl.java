package dal;

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
	public void borrarMatriculaAlumno(alumno matricula) {
		// TODO Auto-generated method stub
		em.remove(matricula);
	}

}
