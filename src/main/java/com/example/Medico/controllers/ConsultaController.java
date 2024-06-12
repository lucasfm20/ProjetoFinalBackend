package com.example.Medico.controllers;

import com.example.Medico.dtos.ConsultaDTO;
import com.example.Medico.services.ConsultaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public List<ConsultaDTO> findAll() {
        return consultaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConsultaDTO> findById(@PathVariable Long id) {
        Optional<ConsultaDTO> consulta = consultaService.findById(id);
        return consulta.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody ConsultaDTO consultaDTO, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }
        return ResponseEntity.ok(consultaService.save(consultaDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        consultaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
