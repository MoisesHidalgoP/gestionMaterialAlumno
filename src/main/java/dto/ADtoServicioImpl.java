package dto;

import org.springframework.stereotype.Service;

import dal.portatil;

@Service
public class ADtoServicioImpl implements ADtoServicio {

	@Override
	public alumnoDTO aAlumnoDTONormal(int id, String md_uuid, String nombre, String telefono, portatil portatil) {
		// TODO Auto-generated method stub
		alumnoDTO alumnoDTO = new alumnoDTO ( id,  md_uuid,  nombre,  telefono,  portatil);
		return alumnoDTO;
	}

	@Override
	public portatilDTO aPortatilDTONormal(int id, String md_uuid, String modelo, String marca) {
		// TODO Auto-generated method stub
		portatilDTO portatilDTO = new portatilDTO (id , md_uuid, modelo, marca );
		return portatilDTO;
	}


	
	

}
