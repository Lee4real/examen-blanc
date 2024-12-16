package com.exam.keynoteservice.controllers;

import com.exam.keynoteservice.entities.Keynote;
import com.exam.keynoteservice.services.KeynoteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/keynotes")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class KeynoteController {
    private KeynoteService keynoteService;

    @GetMapping
    public List<Keynote> getAllKeynotes() {
        return keynoteService.getAllKeynotes();
    }

    @GetMapping("/{id}")
    public Keynote getKeynote(@PathVariable Long id) {
        return keynoteService.getKeynote(id);
    }

    @PostMapping
    public Keynote saveKeynote(@RequestBody Keynote keynote) {
        return keynoteService.saveKeynote(keynote);
    }
}