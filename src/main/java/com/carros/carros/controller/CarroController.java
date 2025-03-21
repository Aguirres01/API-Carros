package com.carros.carros.controller;

import com.carros.carros.model.Carro;
import com.carros.carros.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carros")
@CrossOrigin(origins = "*") // Permite o consumo pelo Frontend
public class CarroController {

    @Autowired
    private CarroService carroService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Carro> cadastrarCarro(@RequestBody Carro carro) {
        Carro novoCarro = carroService.cadastrarCarro(carro);
        return ResponseEntity.ok(novoCarro);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Carro>> listarTodos() {
        List<Carro> carros = carroService.listarTodos();
        return ResponseEntity.ok(carros);
    }
}
