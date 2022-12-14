package edu.miu.payment.controller;

import edu.miu.payment.model.PaymentRequest;
import edu.miu.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class Controller {
    @Autowired
    private PaymentService service;
    @PostMapping
    public String makePayment(@RequestBody PaymentRequest request){
        return service.Payment(request);
    }
}
