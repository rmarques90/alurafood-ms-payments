package br.com.alurafood.payments.http;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("orders-ms")
public interface OrderClient {

    @RequestMapping(method = RequestMethod.PUT, value = "orders/{id}/payment")
    void updateOrderStatus(@PathVariable Long id);
}
