package ru.spbstu.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.spbstu.jpa.model.Warehouse;

@Repository
public interface WarehousesRepository extends CrudRepository<Warehouse, Long> {
}
