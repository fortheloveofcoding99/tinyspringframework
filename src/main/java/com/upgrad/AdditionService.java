package com.upgrad;

import org.springframework.stereotype.Component;

@Component
public class AdditionService implements MathService {

    @Override
    public void operate(int x, int y) {
        MathService.super.operate(7, 8);
    }
}
