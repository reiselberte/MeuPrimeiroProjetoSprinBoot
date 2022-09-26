package br.com.meuprimeiroprojeto.springprimeiro.entities.repository;

import br.com.meuprimeiroprojeto.springprimeiro.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/user")
public class UserController {



    @Autowired
    private UserRepository repository;
    private br.com.meuprimeiroprojeto.springprimeiro.entities.User User;



    //Metodo para buscar todos os usuarios cadastrados
    @GetMapping
    public List<User>findAll(){
      return repository.findAll();
    }

    //Metodo para buscar usuario por ID
    @GetMapping("/{id}")
    public User finById(@PathVariable Long id){
        return repository.findById(id).get();
    }



    //Metodo para adicionar usuario
    @PostMapping
    public User insert(@RequestBody User user){
        User result = repository.save(user);
        return result;
    }


}
