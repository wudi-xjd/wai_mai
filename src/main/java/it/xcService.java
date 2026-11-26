package it;

public interface xcService {

    PageResult pageOrder(pageDTO dto);

    void addOrder(OrderDTO orderDTO);
}
