package com.exam.keynoteservice.services;

import com.exam.keynoteservice.entities.Keynote;
import com.exam.keynoteservice.repository.KeynoteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class KeynoteService {
    private KeynoteRepository keynoteRepository;

    public List<Keynote> getAllKeynotes() {
        return keynoteRepository.findAll();
    }

    public Keynote getKeynote(Long id) {
        return keynoteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Keynote not found"));
    }

    public Keynote saveKeynote(Keynote keynote) {
        return keynoteRepository.save(keynote);
    }
}