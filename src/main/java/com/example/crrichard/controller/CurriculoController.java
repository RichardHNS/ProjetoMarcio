
package com.example.crrichard.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.crrichard.model.Curriculo;
import com.example.crrichard.service.CurriculoService;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/curriculos")
public class CurriculoController {
@Autowired
    private CurriculoService curriculoService;
 @GetMapping
    public List<Curriculo> getAllCurriculos() {
        return curriculoService.getAllCurriculos();
    }
 @GetMapping("/{id}")
    public Optional<Curriculo> getCurriculoById(@PathVariable Long id) {
        return curriculoService.getCurriculoById(id);
    }

@PostMapping
    public Curriculo saveCurriculo(@RequestBody Curriculo curriculo) {
        return curriculoService.saveCurriculo(curriculo);
    }
 @DeleteMapping("/{id}")
    public void deleteCurriculo(@PathVariable Long id) {
        curriculoService.deleteCurriculo(id);
    }
}
