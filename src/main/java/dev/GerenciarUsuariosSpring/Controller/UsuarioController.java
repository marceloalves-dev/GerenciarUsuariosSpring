package dev.GerenciarUsuariosSpring.Controller;

import dev.GerenciarUsuariosSpring.Repository.UsuarioRepository;
import dev.GerenciarUsuariosSpring.usuarios.DtoCadastrarUsuario;
import dev.GerenciarUsuariosSpring.usuarios.DtoRepositoriodados;
import dev.GerenciarUsuariosSpring.usuarios.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarUsuario(@RequestBody DtoCadastrarUsuario dtoCadastrarUsuario) {
        repository.save(new Usuario(dtoCadastrarUsuario));
    }

    @GetMapping
    public List<DtoRepositoriodados> exibir() {
        return repository.findAll().stream().map(DtoRepositoriodados::new).toList();
    }

    @PutMapping("/{id}")
    @Transactional
    public void alterarUsuario(@PathVariable Long id, @RequestBody DtoCadastrarUsuario dtoCadastrarUsuario) {
        var aux = repository.getReferenceById(id);
        aux.update(dtoCadastrarUsuario);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }


}
