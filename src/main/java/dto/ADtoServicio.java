package dto;

import dal.portatil;

public interface ADtoServicio {
	
	public alumnoDTO aAlumnoDTONormal(int id, String md_uuid , String nombre , String telefono , portatil portatil);
	public portatilDTO aPortatilDTONormal(int id , String md_uuid, String modelo,String marca);

}
