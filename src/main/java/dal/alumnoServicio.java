package dal;

import java.util.List;

public interface alumnoServicio {
	
	//Signatura del metodo que inserta la matricula del alumno
	public void insertarMatriculaAlumno(alumno matricula);
	//Signatura para eliminar un alummno
	public void eliminarAlumno(Integer id);
	//Signatura del metodo que busca el portatil de un alumno
	public alumno buscarAlumnoPorIdPortatil(Integer idPortatil);
	//Signatura que busca todos los alumnos con su portatil
	public List<alumno> buscarTodos();

}
