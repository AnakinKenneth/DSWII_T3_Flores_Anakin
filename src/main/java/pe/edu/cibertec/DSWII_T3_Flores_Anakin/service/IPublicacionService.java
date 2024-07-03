package pe.edu.cibertec.DSWII_T3_Flores_Anakin.service;


import pe.edu.cibertec.DSWII_T3_Flores_Anakin.model.bd.Publicacion;

import java.util.List;

public interface IPublicacionService {
    List<Publicacion> obtenerPublicaciones();
}
