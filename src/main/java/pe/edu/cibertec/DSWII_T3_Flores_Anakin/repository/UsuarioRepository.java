package pe.edu.cibertec.DSWII_T3_Flores_Anakin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_Flores_Anakin.model.bd.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByNomusuario(String nomusuario);

    Usuario findByNombres(String nombres);
}