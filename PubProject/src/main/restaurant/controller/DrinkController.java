package restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import restaurant.domain.Drink;
import restaurant.repository.DrinkRepository;


import java.util.List;

/**
 * Created by zagor on 06.11.2016.
 */

@Controller
public class DrinkController {
    private DrinkRepository drinkRepository;

    @Autowired
    public void DrinkRepository (DrinkRepository drinkRepository){
        this.drinkRepository = drinkRepository;
    }

    @RequestMapping(value ="/drink_for_admin", method = RequestMethod.GET)
    public String getDrinkAdm (Model model) {
        List<Drink> drinkListAdm = this.drinkRepository.listAll();

        model.addAttribute("drink", new Drink());
        model.addAttribute("drink_for_admin", drinkListAdm);

        return "drink_for_admin";
    }


    @RequestMapping(value = "/add_drink", method = RequestMethod.POST)
    public String addDrink(@ModelAttribute("drink") Drink drink, BindingResult result) {

        drinkRepository.addDrink(drink);

        return "redirect:/drink_for_admin";
    }

    @RequestMapping("/deleteDrink/{drinkId}")
    public String deleteDrink(@PathVariable("drinkId") Integer drinkId) {

        drinkRepository.removeDrink(drinkId);

        return "redirect:/drink_for_admin";
    }

    @RequestMapping(value = "/update_drink", method = RequestMethod.GET)
    public String updateDrink(@RequestParam("iddrinkupd") Integer drinkId, Model model) {

        Drink existingDrink = drinkRepository.get(drinkId);

        model.addAttribute("drinkAttribute", existingDrink);

        return "update_drink";
    }

    @RequestMapping(value = "/update_drink", method = RequestMethod.POST)
    public String updateDrinkPost(@RequestParam("id") Integer drinkId, @ModelAttribute("drinkAttribute") Drink drink) {
        drink.setId(drinkId);
        drinkRepository.editDrink(drink);
        return "redirect: drink_for_admin";
    }
}
