package com.example.lotericgenerator.Loteric.Generator.Service;

import com.example.lotericgenerator.Loteric.Generator.Model.RandomNumber;
import com.example.lotericgenerator.Loteric.Generator.Repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class NumberService {
    @Autowired
    NumberRepository numberRepository;

    /**
     * Método que realiza a seleção de numeros aleatórios, poe todos em um array para formar uma string com os valores desejados
     * @param randomNumber
     * @return randomNumber
     */
    public RandomNumber generateValue(RandomNumber randomNumber) {
        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        String finalValue = "";

        for (int i = 0; i < 6; i++) {
            Integer number = random.nextInt(4);
            integerArrayList.add(number);
            finalValue = integerArrayList.toString();
        }
        randomNumber.setRandomNumbers(finalValue);
        numberRepository.save(randomNumber);
        return randomNumber;
    }


}
