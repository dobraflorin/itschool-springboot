package ro.itschool.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;
import ro.itschool.springboot.models.entities.Order;

@RestController
public interface OrderRepository extends JpaRepository<Order, Long> {

}
