package org.exam.api;

import lombok.RequiredArgsConstructor;
import org.exam.mongo.client.MongoCrudService;
import org.exam.mongo.client.MongoDomain;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ApiController {
    private final MongoCrudService mongoCrudService;

    @GetMapping("/{id}")
    public ResponseEntity<MongoDomain> findById(@PathVariable String id) {
        return mongoCrudService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
