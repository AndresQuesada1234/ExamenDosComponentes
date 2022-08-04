package com.example.examendos.controller;

import com.example.examendos.domain.Futbolista;
import com.example.examendos.service.FutbolistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class FutbolistaController {

    @Autowired
    FutbolistaService futbolistaService;

    @RequestMapping("/")
    public String home(Model model){
        return "index";
    }

    @GetMapping(value = "/insertarFutbolista")
    public String insertarPagina(Model model){
        model.addAttribute(new Futbolista());
        return "insertarFutbolista";
    }

    @PostMapping(value = "/insertarFutbolista")
    public String insertarAct(Futbolista futbolista, BindingResult result, Model model){
        futbolista.setImc(futbolista.getPeso()/(futbolista.getEstatura()*futbolista.getEstatura()));
        futbolistaService.save(futbolista);
        return "index";
    }

    @GetMapping("/listarFutbolistas")
    public String listar(Model model){
        model.addAttribute("futbolistas", futbolistaService.getAll());
        return "listarFutbolistas";
    }

    @GetMapping(value = "/buscar")
    public String buscarFutbolista(Model model, String valor){
        model.addAttribute("futbolista", futbolistaService.find(valor));
        return "buscarFutbolista";
    }

}
