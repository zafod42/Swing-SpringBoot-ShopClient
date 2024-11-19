package ru.spbstu.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.spbstu.jpa.model.Sale;

@Repository
public interface SalesRepository extends CrudRepository<Sale, Long> {
}
