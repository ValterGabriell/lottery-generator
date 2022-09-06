package com.example.lotericgenerator.Loteric.Generator.Controller;

import com.example.lotericgenerator.Loteric.Generator.Model.RandomNumber;
import com.example.lotericgenerator.Loteric.Generator.Service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/generateValue")
public class NumberController {
    @Autowired
    NumberService numberService;

    /**
     * Método responsavel pela exibicao dos valores no front end
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String generateRandomNumbers() {
        RandomNumber randomNumber = new RandomNumber();
        return numberService.generateValue(randomNumber).getRandomNumbers();
    }


}
