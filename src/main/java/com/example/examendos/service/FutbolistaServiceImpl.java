package com.example.examendos.service;

import com.example.examendos.domain.Futbolista;
import com.example.examendos.repo.FutbolistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class FutbolistaServiceImpl implements FutbolistaService {

    @Autowired
    FutbolistaRepository fRepo;

    @Override
    public void save(Futbolista futbolista) {
        fRepo.save(futbolista);
    }

    @Override
    public Optional<Futbolista> get(Long id) {
        return fRepo.findById(id);
    }

    @Override
    public List<Futbolista> getAll() {
        List<Futbolista> futbolistas = new ArrayList<Futbolista>();
        fRepo.findAll().forEach(futbolista -> futbolistas.add(futbolista));
        return futbolistas;
    }

    @Override
    public List<Futbolista> find(String valor) {
        return fRepo.findByNombreContaining(valor);
    }

}
