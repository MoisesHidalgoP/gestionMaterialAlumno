package dto;

import dal.portatil;

public interface ADtoServicio {
	
	public alumnoDTO aAlumnoDTO(int id, String md_uuid , String nombre , String telefono , portatil portatil);

}
