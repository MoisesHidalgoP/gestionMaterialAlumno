package dal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="alumno", schema="dlk_gestion")
public class alumno {
	
	//Atributos
	
	@Id
	@Column(name="codAlumno", unique=true,nullable=false)
	private int codAlumno;
	@Column(name="md_uuid")
	private String md_uuid;
	@Column(name="nombre")
	private String nombre;
	@Column(name="telefono")
	private String telefono;
	@OneToOne
	portatil portatil;
	
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

	public portatil getPortatil() {
		return portatil;
	}

	public void setPortatil(portatil portatil) {
		this.portatil = portatil;
	}
	
	
	
	//toString
	
	@Override
	public String toString() {
		return "alumno [codAlumno=" + codAlumno + ", md_uuid=" + md_uuid + ", nombre=" + nombre + ", telefono="
				+ telefono + "]";
	}

}
