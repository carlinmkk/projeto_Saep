package com.lojaaviamento.aviamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.lojaaviamento.aviamento.model.Usuario;
import com.lojaaviamento.aviamento.model.Role;
import com.lojaaviamento.aviamento.service.UsuarioService;

@Controller
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    // LISTAR TODOS OS USUÁRIOS
    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", service.listAll());
        return "list"; // templates/list.html
    }

    // FORMULÁRIO DE CADASTRO
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("roles", Role.values()); // envia o enum para o select
        return "form"; // templates/form.html
    }

    // SALVAR USUÁRIO
    @PostMapping("/usuario")
    public String salvar(@ModelAttribute("usuario") Usuario usuario) {
        service.save(usuario);
        return "redirect:/usuarios";
    }
}
