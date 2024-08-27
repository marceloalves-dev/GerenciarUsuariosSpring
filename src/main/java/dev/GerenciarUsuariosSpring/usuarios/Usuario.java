package dev.GerenciarUsuariosSpring.usuarios;

import jakarta.persistence.*;

@Table(name = "usuario")
@Entity(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String nome;
    private String email;

    public Usuario(DtoCadastrarUsuario dtoCadastrarUsuario) {
        this.email = dtoCadastrarUsuario.email();
        this.nome = dtoCadastrarUsuario.nome();
    }

    public Usuario() {
    }

    public void update(DtoCadastrarUsuario dtoCadastrarUsuario) {
        if (dtoCadastrarUsuario.nome() != null) this.nome = dtoCadastrarUsuario.nome();

        if (dtoCadastrarUsuario.email() != null) this.email = dtoCadastrarUsuario.email();
    }

    // --------------- get ---------------
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
