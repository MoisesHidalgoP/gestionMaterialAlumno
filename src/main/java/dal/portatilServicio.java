package dal;

import java.util.List;

public interface portatilServicio {
	//Signatura del metodo que da de alta un portatil
	public void insertarAltaPortatil (portatil alta);
	//Signatura del metodo que busca los portatiles
	public List<portatil> buscaPortatil();

}
