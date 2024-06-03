package com.addyCodes.learnspringframework.repository;

import com.addyCodes.learnspringframework.model.AnimeEntry;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.DynamicProxyable;

public interface AnimeRepository extends CouchbaseRepository<AnimeEntry, String>, DynamicProxyable<AnimeRepository> {
}
