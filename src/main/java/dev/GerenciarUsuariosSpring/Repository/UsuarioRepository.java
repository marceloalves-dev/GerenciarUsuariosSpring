package dev.GerenciarUsuariosSpring.Repository;

import dev.GerenciarUsuariosSpring.usuarios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
