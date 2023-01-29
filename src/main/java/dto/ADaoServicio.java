package dto;

import dal.alumno;
import dal.portatil;

public interface ADaoServicio {
	
	public portatil portatilDTOADAO(portatilDTO PortatilDTO);
	public alumno alumnoDTOADAO (alumnoDTO AlumnoDTO);

}
