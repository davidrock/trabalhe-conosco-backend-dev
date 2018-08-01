package com.davidrock.picpay.picpay.repository;

import com.davidrock.picpay.picpay.models.User;
import org.reactivestreams.Publisher;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class UserRep implements ReactiveCrudRepository<User, String> {

    @Override
    public <S extends User> Mono<S> save(S s) {
        return null;
    }

    @Override
    public <S extends User> Flux<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends User> Flux<S> saveAll(Publisher<S> publisher) {
        return null;
    }

    @Override
    public Mono<User> findById(String s) {
        return null;
    }

    @Override
    public Mono<User> findById(Publisher<String> publisher) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(String s) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(Publisher<String> publisher) {
        return null;
    }

    @Override
    public Flux<User> findAll() {
        return null;
    }

    @Override
    public Flux<User> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public Flux<User> findAllById(Publisher<String> publisher) {
        return null;
    }

    @Override
    public Mono<Long> count() {
        return null;
    }

    @Override
    public Mono<Void> deleteById(String s) {
        return null;
    }

    @Override
    public Mono<Void> deleteById(Publisher<String> publisher) {
        return null;
    }

    @Override
    public Mono<Void> delete(User user) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Iterable<? extends User> iterable) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Publisher<? extends User> publisher) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll() {
        return null;
    }
}
