package com.AclDemo.AclDemo.Repository;

import com.AclDemo.AclDemo.IServices.IcharactersService;
import com.AclDemo.AclDemo.Models.Character;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@RequiredArgsConstructor
@Transactional
public class Repo implements CharacterRepository {
    private final CharacterRepository characterRepository;

    @Override
    public Optional<Character> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Character findByName(String name) {
        return null;
    }

    public List<Character> getAll(){
        return characterRepository.findAll();
    }

    @Override
    public List<Character> findAll() {
        return null;
    }

    @Override
    public List<Character> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Character> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Character> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Character entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Character> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Character> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Character> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Character> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Character> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Character> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Character getOne(Long aLong) {
        return null;
    }

    @Override
    public Character getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Character> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Character> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Character> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Character> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Character> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Character> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Character, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
