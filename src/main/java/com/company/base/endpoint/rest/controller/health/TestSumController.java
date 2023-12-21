package com.company.base.endpoint.rest.controller.health;

import com.company.base.PojaGenerated;
import java.math.BigInteger;

import com.company.base.service.event.Test;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@AllArgsConstructor
public class TestSumController {
    private final Test test;

    @GetMapping("/big-sum")
    public BigInteger sum(@RequestParam("a") int a, @RequestParam("b") int b) {
        return test.sum(a, b);
    }
}
