package java.com.rh.projet.controller;

import java.com.rh.projet.entities.Patient;
import java.com.rh.projet.service.PatientService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PatientController {

    @Autowired
    List<PatientEntities> ListPatient;

    @Autowired
    private PatientService service;

    //Lister Tous les employes
    @GetMapping("/")
    public String ViewHomePage(Model model){
        ListPatient = service.listAll();
        model.addAttribute("listePatient",ListPatient);
        System.out.println("Get / ");
        return "index";
    } 

//Ajouter une employe
    @GetMapping("/new")
    public String Add(Model model){
        List<PatientEntities> ListPatient = service.ListAll();
        model.addAttribute("ListPatient",ListPatient);
        model.addAttribute("Patient",new PatientEntities());

        return "new";
    }
//Sauvegarder Patient 
    @GetMapping(value="/save",method = @RequestMethod.POST)
    public String SavePatient(@ModelAttribute("Patient") PatientEntities p){
        service.save(p);
        model.addAttribute("listePatient",ListPatient);
        System.out.println("Get / ");
        return "redirect:/";
    } 

//Modifier un Patient grace a son id
    @GetMapping("/edit/{id}")
    public ModelAndView Edit(@PathVariable(name="id")int id){
        ModelAndView mav = new ModelAndView("new");
        PatientEntities p=service.get(id);
        mav.addObject("Patient",p);
        return "mav";
    } 
     
//Supprimer une employe grace a son id
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(name="id")int id){
        service.delete(id);
        
        return "redirect:/";
    }
}
