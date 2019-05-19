package com.william.quickpoll.repository;

import com.william.quickpoll.domain.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Option, Long> {
}
