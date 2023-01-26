package dal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="portatil", schema="dlk_gestion")
public class portatil {
	
	//Atributos
	@Id
	@Column(name="idPortail" , unique=true, nullable=false)
	private int idPortatil;
	@Column(name="md_uuid")
	private String md_uuid;
	@Column(name="marca")
	private String marca;
	@Column(name="modelo")
	private String modelo;
	
	
	//Getters y Setters
	public int getIdPortatil() {
		return idPortatil;
	}
	public void setIdPortatil(int idPortatil) {
		this.idPortatil = idPortatil;
	}
	public String getMd_uuid() {
		return md_uuid;
	}
	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
	//toString
	@Override
	public String toString() {
		return "portatil [idPortatil=" + idPortatil + ", md_uuid=" + md_uuid + ", marca=" + marca + ", modelo=" + modelo
				+ "]";
	}

}
