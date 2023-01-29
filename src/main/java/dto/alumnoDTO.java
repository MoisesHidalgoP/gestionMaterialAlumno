package dto;

import org.springframework.stereotype.Component;

@Component
public class alumnoDTO {
	
	//Atributos
	private int codAlumno;
	private String md_uuid;
	private String nombre;
	private String telefono;
	dal.portatil portatil;
	
	//Getters y Setters
	public int getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(int codAlumno) {
		this.codAlumno = codAlumno;
	}

	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public dal.portatil getPortatil() {
		return portatil;
	}

	public void setPortatil(dal.portatil portatil) {
		this.portatil = portatil;
	}

	
	//Constructores 
	public alumnoDTO(int codAlumno, String md_uuid, String nombre, String telefono, dal.portatil portatil) {
		super();
		this.codAlumno = codAlumno;
		this.md_uuid = md_uuid;
		this.nombre = nombre;
		this.telefono = telefono;
		this.portatil = portatil;
	}

	
	public alumnoDTO() {
		super();
	}

}
