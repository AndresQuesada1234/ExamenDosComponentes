package com.example.examendos.repo;

import com.example.examendos.domain.Futbolista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FutbolistaRepository extends JpaRepository<Futbolista, Long> {

    @Query(value = "SELECT nombre, apellido1 FROM Futbolista where nombre = %word or apellido1 = %word", nativeQuery = true)
    public List<Futbolista> findByNombreContaining(@Param("word")String word);
}
