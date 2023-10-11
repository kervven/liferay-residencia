package recursos;

import entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioRecursos {

    @GetMapping
    public ResponseEntity<Usuario> findAll() {
        Usuario u = new Usuario(1L, "Davi", "lucasdavi@gmail.com", "123456");
        return ResponseEntity.ok().body(u);
    }
}
