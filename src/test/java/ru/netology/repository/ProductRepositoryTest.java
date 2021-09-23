package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    @Test
    void removeById() {
        ProductRepository repo = new ProductRepository();
        Product first = new Product(1, "SD",500);
        Product second = new Product(22, "CD",1500);
        Product third = new Product(333, "WCD",700);

        repo.save(first);
        repo.save(second);
        repo.save(third);

        repo.removeById(22);

    }
}