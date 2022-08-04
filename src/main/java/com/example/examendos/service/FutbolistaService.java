package com.example.examendos.service;

import com.example.examendos.domain.Futbolista;

import java.util.List;
import java.util.Optional;

public interface FutbolistaService {
    public void save(Futbolista futbolista);
    public Optional<Futbolista> get(Long id);
    public List<Futbolista> getAll();
    public List<Futbolista> find(String nombre);

}
