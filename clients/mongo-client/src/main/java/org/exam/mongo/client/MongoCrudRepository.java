package org.exam.mongo.client;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoCrudRepository extends MongoRepository<MongoDomain, String> {
}
