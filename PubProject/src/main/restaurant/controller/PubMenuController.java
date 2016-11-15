package restaurant.controller;

import org.hibernate.annotations.NamedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import restaurant.domain.PubMenu;
import restaurant.repository.PubMenuRepository;

import java.util.List;

/**
 * Created by zagor on 25.09.2016.
 */
@Controller
public class PubMenuController {

    private PubMenuRepository pubMenuRepository;

    @Autowired
    public PubMenuController(PubMenuRepository pubMenuRepository) {
        this.pubMenuRepository = pubMenuRepository;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getPubMenu(Model model) {
        List<PubMenu> pubMenuList = this.pubMenuRepository.listAll();
        model.addAttribute("PubMenu", pubMenuList);
        List<PubMenu> pubMenuListLight = this.pubMenuRepository.listLight();
        model.addAttribute("PubMenuLight", pubMenuListLight);
        List<PubMenu> pubMenuListDark = this.pubMenuRepository.listDark();
        model.addAttribute("PubMenuDark", pubMenuListDark);
        List<PubMenu> pubMenuListUnfiltered = this.pubMenuRepository.listUnfiltered();
        model.addAttribute("PubMenuUnfiltered", pubMenuListUnfiltered);
        return "index";
    }

    @RequestMapping(value = "/PubMenuLight", method = RequestMethod.GET)
    public ModelAndView pubMenuLightName(@RequestParam("PubMenuLightName") String PubMenuLightName) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("PubMenuLight", pubMenuRepository.getBeerByNameLight(PubMenuLightName));
        modelAndView.setViewName("PubMenuLight");
        return modelAndView;
    }

    @RequestMapping(value = "/PubMenuDark", method = RequestMethod.GET)
    public ModelAndView pubMenuDarkName(@RequestParam("PubMenuDarkName") String PubMenuDarkName) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("PubMenuDark", pubMenuRepository.getBeerByNameDark(PubMenuDarkName));
        modelAndView.setViewName("PubMenuDark");
        return modelAndView;
    }

    @RequestMapping(value = "/PubMenuUnfiltered", method = RequestMethod.GET)
    public ModelAndView pubMenuUnfilteredName(@RequestParam("PubMenuUnfilteredName") String PubMenuUnfilteredName) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("PubMenuUnfiltered", pubMenuRepository.getBeerByNameLightUnfiltered(PubMenuUnfilteredName));
        modelAndView.setViewName("PubMenuUnfiltered");
        return modelAndView;
    }

    @RequestMapping(value = "/pubmenu_for_admin", method = RequestMethod.GET)
    public String getPubMenuAdm(Model model) {
        List<PubMenu> pubMenuListA = this.pubMenuRepository.listAll();
        model.addAttribute("PubMenu", pubMenuListA);
        return "pubmenu_for_admin";
    }

    @RequestMapping(value = "/Scheme", method = RequestMethod.GET)
    public String getScheme() {
        return "Scheme";
    }

    @RequestMapping(value = "/scheme_driving", method = RequestMethod.GET)
    public String getSchemeDriving() {
        return "scheme_driving";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getStart() {
        return "start";
    }

    @RequestMapping(value = "/add_beer", method = RequestMethod.POST)
    public String addBeer(@ModelAttribute("beer") PubMenu pubMenu, BindingResult result) {

        pubMenuRepository.addBeer(pubMenu);

        return "redirect:/beermenu_for_admin";
    }

    @RequestMapping(value = "/beermenu_for_admin", method = RequestMethod.GET)
    public String getBeerAdm(Model model) {
        List<PubMenu> beerListAdm = this.pubMenuRepository.listAll();

        model.addAttribute("beer", new PubMenu());
        model.addAttribute("beer_for_admin", beerListAdm);

        return "beermenu_for_admin";
    }

    @RequestMapping("/deleteBeer/{beerId}")
    public String deleteBeer(@PathVariable("beerId") Integer beerId) {

        pubMenuRepository.removeBeer(beerId);

        return "redirect:/beermenu_for_admin";
    }

    @RequestMapping(value = "/update_beer", method = RequestMethod.GET)
    public String updateBeer(@RequestParam("idupd") Integer beerId, Model model, @ModelAttribute("pubMenuAttribute") PubMenu pubMenu) {

        PubMenu existingpubMenu = pubMenuRepository.get(beerId);

        model.addAttribute("pubMenuAttribute", existingpubMenu);

        return "update_beer";
    }

    @RequestMapping(value = "/update_beer", method = RequestMethod.POST)
    public String updateBeerPost(@RequestParam("id") Integer beerId, @ModelAttribute("pubMenuAttribute") PubMenu pubMenu) {
       pubMenu.setId(beerId);
        pubMenuRepository.editBeer(pubMenu);
        return "redirect: beermenu_for_admin";
    }
}