package com.example.persona.services;

import com.example.persona.entities.Domicilio;
import com.example.persona.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServicesImpl<Domicilio,Long> implements DomicilioService {
    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
