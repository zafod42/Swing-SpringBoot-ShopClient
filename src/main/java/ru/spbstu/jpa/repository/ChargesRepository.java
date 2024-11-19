package ru.spbstu.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.spbstu.jpa.model.Charge;

@Repository
public interface ChargesRepository extends CrudRepository<Charge, Long> {
}
