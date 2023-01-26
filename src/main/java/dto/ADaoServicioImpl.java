package dto;

import dal.portatil;

public class ADaoServicioImpl implements ADaoServicio {

	@Override
	public portatil portatilDTOADAO(alumnoDTO alumnoDTO) {
		// TODO Auto-generated method stub
		portatil portatil = new portatil(); 
		
		if(alumnoDTO != null) {
			portatil.setIdPortatil(portatil.getIdPortatil());
			portatil.setMd_uuid(portatil.getMd_uuid());
			portatil.setMd_uuid(portatil.getMarca());
			portatil.setModelo(portatil.getModelo());
			
		}
			
			return portatil;
		
	}

}
