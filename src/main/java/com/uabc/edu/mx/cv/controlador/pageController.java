package com.uabc.edu.mx.cv.controlador;


import com.uabc.edu.mx.cv.modelo.Curriculum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cv")
public class pageController {

    @GetMapping(value = "/recurso")
    public String pagina(Model model){
        Curriculum c = new Curriculum();
        List<String> l;

        //Se agregan datos basicos
        c.setNombre("Francisco");
        c.setApellidoP("Reyes");
        c.setApellidoM("Parra");
        c.setTelefono("(686) 2-31-1361");
        c.setCorreoE("francisco.reyes.parra@uabc.edu.mx");

        //Se agregan estudios
        l = new ArrayList();
        l.add("Lic. en Sistemas computacionales.");
        l.add("Certificado en la creacion de pizzas.");
        l.add("Tecnico en soporte y mantenimieno de equipo de computo.");
        c.setEstudios(l);

        //Trayectoria complementaria
        l = new ArrayList();
        l.add("Certificado en base de datos lv2 de datacamp.");
        l.add("Certificado en linux basics de Red Hat por edx.");
        c.setTrayCompl(l);

        //Experiencia
        l = new ArrayList();
        l.add("1 año de experiencia en arquitectura en Rectoria UABC.");
        l.add("1 año en Grupo Red en la creacion e implementacion de proyectos.");
        l.add("3 años dentro del departamento de desarrollo de la nasa.");
        c.setExpLabo(l);

        //Idiomas
        l = new ArrayList();
        l.add("Ingles");
        l.add("Frances");
        l.add("Chino mandarin");
        c.setIdiomas(l);

        model.addAttribute("datos",c);

        return "cv";
    }

}
