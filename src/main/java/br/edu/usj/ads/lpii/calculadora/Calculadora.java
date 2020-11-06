package br.edu.usj.ads.lpii.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class Calculadora {
    
   
   @PostMapping(value="/soma")
   public ModelAndView postSomar(@RequestParam String a, @RequestParam String b) {
       
    ModelAndView modelAndView = new ModelAndView("resultados");

    Double aDouble = Double.valueOf(a);
    Double bDouble = Double.valueOf(b);
    Double resultado = aDouble + bDouble;

    String operacao = a + " + " + b + " = " + resultado; 

    modelAndView.addObject("resultado", operacao);

    return modelAndView;
   }
   
    
}
