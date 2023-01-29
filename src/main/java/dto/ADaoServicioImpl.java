package dto;

import dal.alumno;
import dal.portatil;

public class ADaoServicioImpl implements ADaoServicio {

	@Override
	public portatil portatilDTOADAO(portatilDTO PortatilDTO) {
		// TODO Auto-generated method stub
		portatil portatil = new portatil(); 
		
		if(PortatilDTO != null) {
			portatil.setIdPortatil(PortatilDTO.getIdPortatil());
			portatil.setMd_uuid(PortatilDTO.getMd_uuid());
			portatil.setMarca(PortatilDTO.getMarca());
			portatil.setModelo(PortatilDTO.getModelo());
			
		}
			
			return portatil;
		
	}

	@Override
	public alumno alumnoDTOADAO(alumnoDTO AlumnoDTO) {
		// TODO Auto-generated method stub
		
		alumno alumno = new alumno();
		if(AlumnoDTO !=null) {
			alumno.setCodAlumno(AlumnoDTO.getCodAlumno());
			alumno.setMd_uuid(AlumnoDTO.getMd_uuid());
			alumno.setNombre(AlumnoDTO.getNombre());
			alumno.setPortatil(AlumnoDTO.getPortatil());
			alumno.setTelefono(AlumnoDTO.getTelefono());
		}
		return alumno;
	}

}
