package ru.lukyanov.controller;

import ru.lukyanov.entity.Customer;
import ru.lukyanov.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RunMe { // где_запускается_сайт -> localhost:8080

    private final CustomerService customerService;

    public RunMe(CustomerService customerService) {
        this.customerService = customerService;
    }

    int i = 0;

    @RequestMapping("/runMe") //  localhost:8080/runMe
    @ResponseBody
    public Customer getCustomerById() throws InterruptedException {

        Customer customer = new Customer();

        for (int j = 0; j < 500; j++) {
            customer = customerService.get(1L);

            Thread.sleep(1000);

            System.out.println(customer);
            i++;
            System.out.println("Here is a GET request #" + i);

        }
        return customer;
    }
}