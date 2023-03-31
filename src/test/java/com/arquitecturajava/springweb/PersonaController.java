package com.arquitecturajava.springweb;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PersonaController {
  @RequestMapping("/lista")
  public String lista(Model modelo) {
    
    Persona p1= new Persona("pedro","perez",20);
    Persona p2= new Persona("ana","gomez",30);
    Persona p3= new Persona("gema","alvarez",40);
    
    List<Persona> personas= Arrays.asList(p1,p2,p3);
    modelo.addAttribute("personas", personas);
    return "lista";
    
  }
}
