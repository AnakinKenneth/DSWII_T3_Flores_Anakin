package pe.edu.cibertec.DSWII_T3_Flores_Anakin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_Flores_Anakin.model.bd.Publicacion;
import pe.edu.cibertec.DSWII_T3_Flores_Anakin.repository.PublicacionRepository;

import java.util.List;

@Service
public class PublicacionService implements IPublicacionService {

    @Autowired
    private PublicacionRepository publicacionRepository;

    @Override
    public List<Publicacion> obtenerPublicaciones() {
        return publicacionRepository.findAll();
    }
}
