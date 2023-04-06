package ru.netology.repository;

import ru.netology.data.Product;

public class ProductRepository {
    private Product[] items = new Product[0];

    public void save(Product item) {
        int lenght = items.length + 1;
        Product[] tmp = new Product[lenght];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int index = tmp.length - 1;
        tmp[index] = item;
        items = tmp;
    }

    public Product[] findAll() {
        return items;
    }

    public void removeById(int id) {
        int lenght = items.length - 1;
        Product[] tmp = new Product[lenght];
        int index = 0;
        for (Product item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public Product findById(int id) {
        for (Product item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
