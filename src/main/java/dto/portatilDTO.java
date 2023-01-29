package dto;

import org.springframework.stereotype.Component;

@Component
public class portatilDTO {
	
	//Atrubutos
	private int idPortatil;
	private String md_uuid;
	private String modelo;
	private String marca;
	
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
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//Constructores
	
	public portatilDTO(int idPortatil, String md_uuid, String modelo, String marca) {
		super();
		this.idPortatil = idPortatil;
		this.md_uuid = md_uuid;
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public portatilDTO() {
		super();
	}

}
