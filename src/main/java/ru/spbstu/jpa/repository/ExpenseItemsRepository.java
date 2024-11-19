package ru.spbstu.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.spbstu.jpa.model.ExpenseItem;

import java.util.List;

@Repository
public interface ExpenseItemsRepository extends CrudRepository<ExpenseItem, Long> {
    List<ExpenseItem> findByName(String name);
}
