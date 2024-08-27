package dev.GerenciarUsuariosSpring.usuarios;

public record DtoRepositoriodados(
        Long id,
        String nome,
        String email
) {
    public DtoRepositoriodados (Usuario usuario){
        this(usuario.getId(), usuario.getNome(), usuario.getEmail());
    }
}
