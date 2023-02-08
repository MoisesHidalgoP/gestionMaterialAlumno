package consultas;

import java.util.List;

import javax.management.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dal.alumno;
import dal.alumnoImpl;
import dal.portatil;
import dal.portatilImpl;

@Repository
public class consultas {
	
	@Autowired
	private alumnoImpl al;
	@Autowired
	private portatilImpl por;
	
	@Transactional
	public void insertarUnAlumno(alumno matricula) {
		al.insertarMatriculaAlumno(matricula);
	}
	
	
	@Transactional
	public void insertarUnPortatil(portatil alta) {
		por.insertarAltaPortatil(alta);
	}
	
	@Transactional
	public List<portatil>listPortatil(){
		return por.buscaPortatil();
	}
	
	@Transactional
    public void eliminarUnAlumno(Integer id) {
        al.eliminarAlumno(id);
    }

	@Transactional
	public alumno buscarAlumnoPorIdPortatil(Integer idPortatil) {
        return al.buscarAlumnoPorIdPortatil(idPortatil);
    }
    
	@Transactional
	public List<alumno> listaAlumnos(){
		return al.buscarTodos();
	}

}
