package org.exam.mongo.client;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MongoCrudService {
    private final MongoCrudRepository mongoCrudRepository;

    @Transactional(readOnly = true)
    public Optional<MongoDomain> findById(String id) {
        return mongoCrudRepository.findById(id);
    }
}
