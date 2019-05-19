package com.william.quickpoll.repository;

import com.william.quickpoll.domain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {
}
