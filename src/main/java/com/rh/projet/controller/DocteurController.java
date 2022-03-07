package java.com.rh.projet.controller;

import java.com.rh.projet.entities.Docteur;
import java.com.rh.projet.service.DocteurService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

public class DocteurController {


    @Autowired
    private DocteurService service;


    //Lister Tous les employes
    @GetMapping("/")
    public String ViewHomePage(Model model){
        List<DocteurEntities> listDocteur = service.ListAll();
        model.addAttribute("listeDocteur",listDocteur);
        System.out.println("Get / ");
        return "index";
    } 

//Ajouter une employe
    @GetMapping("/new")
    public String Add(Model model){
        List<DocteurEntities> listDocteur = service.ListAll();
        model.addAttribute("listeDocteur",listDocteur);
        model.addAttribute("Docteur",new DocteurEntities());

        return "new";
    }
//Sauvegarder Docteur 
    @GetMapping(value="/save", method = @RequestMethod.POST)
    public String SaveDocteur(@ModelAttribute("Docteur") DocteurEntities doc){
        service.save(doc);
        model.addAttribute("listeDocteur",listDocteur);
        System.out.println("Get / ");
        return "redirect:/";
    } 

//Modifier un Docteur grace a son id
    @GetMapping("/edit/{id}")
    public ModelAndView Edit(@PathVariable(name="id")int id){
        ModelAndView mav = new ModelAndView("new");
        DocteurEntities doc=service.get(id);
        mav.addObject("Docteur",doc);
        return "mav";
    } 
     
//Supprimer une employe grace a son id
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(name="id")int id){
        service.delete(id);
        
        return "redirect:/";
    }

    
}
