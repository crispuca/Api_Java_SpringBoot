package com.example.persona.services;

import com.example.persona.entities.Libro;
import com.example.persona.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServicesImpl<Libro,Long> implements LibroService {
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
