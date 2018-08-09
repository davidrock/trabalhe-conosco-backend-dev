package com.davidrock.picpay.picpay.repository;

import com.davidrock.picpay.picpay.models.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface IUserRep extends MongoRepository<User, String> {

    @Override
    <S extends User> List<S> saveAll(Iterable<S> iterable);

    @Override
    List<User> findAll();

    @Override
    List<User> findAll(Sort sort);

    @Override
    <S extends User> S insert(S s);

    @Override
    <S extends User> List<S> insert(Iterable<S> iterable);

    @Override
    <S extends User> List<S> findAll(Example<S> example);

    @Override
    <S extends User> List<S> findAll(Example<S> example, Sort sort);

    @Override
    Page<User> findAll(Pageable pageable);

    @Override
    <S extends User> S save(S s);

    @Override
    Optional<User> findById(String s);

    @Override
    boolean existsById(String s);

    @Override
    Iterable<User> findAllById(Iterable<String> iterable);

    @Override
    long count();

    @Override
    void deleteById(String s);

    @Override
    void delete(User user);

    @Override
    void deleteAll(Iterable<? extends User> iterable);

    @Override
    void deleteAll();

    @Override
    <S extends User> Optional<S> findOne(Example<S> example);

    @Override
    <S extends User> Page<S> findAll(Example<S> example, Pageable pageable);

    @Override
    <S extends User> long count(Example<S> example);

    @Override
    <S extends User> boolean exists(Example<S> example);
}


