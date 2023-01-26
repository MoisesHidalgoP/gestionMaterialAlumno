package dto;

import dal.portatil;

public class ADtoServicioImpl implements ADtoServicio {

	@Override
	public alumnoDTO aAlumnoDTO(int id, String md_uuid, String nombre, String telefono, portatil portatil) {
		// TODO Auto-generated method stub
		alumnoDTO alumnoDTO = new alumnoDTO ( id,  md_uuid,  nombre,  telefono,  portatil);
		return alumnoDTO;
	}
	

}
