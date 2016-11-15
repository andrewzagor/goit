package restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import restaurant.domain.Storage;
import restaurant.repository.StorageRepository;

import java.util.List;

/**
 * Created by zagor on 06.11.2016.
 */

@Controller
public class StorageController {
    private StorageRepository storageRepository;

    @Autowired
    public void StorageRepository (StorageRepository storageRepository){
        this.storageRepository = storageRepository;
    }

    @RequestMapping(value ="/storage_for_admin", method = RequestMethod.GET)
    public String getStorageAdm (Model model) {
        List<Storage> storageListAdm = this.storageRepository.listAll();

        model.addAttribute("storage", new Storage());
        model.addAttribute("storage_for_admin", storageListAdm);

        return "storage_for_admin";
    }


    @RequestMapping(value = "/add_storage", method = RequestMethod.POST)
    public String addStorage(@ModelAttribute("storage") Storage storage, BindingResult result) {

        storageRepository.addStorage(storage);

        return "redirect:/storage_for_admin";
    }

    @RequestMapping("/deleteStorage/{storageId}")
    public String deleteStorage(@PathVariable("storageId") Integer storageId) {

        storageRepository.removeStorage(storageId);

        return "redirect:/storage_for_admin";
    }

    @RequestMapping(value = "/update_storage", method = RequestMethod.GET)
    public String updateStorage(@RequestParam("idstupd") Integer storageId, Model model) {

        Storage existingStorage = storageRepository.get(storageId);

        model.addAttribute("storageAttribute", existingStorage);

        return "update_storage";
    }

    @RequestMapping(value = "/update_storage", method = RequestMethod.POST)
    public String updateStoragePost(@RequestParam("id") Integer storageId, @ModelAttribute("storageAttribute") Storage storage) {
        storage.setId(storageId);
        storageRepository.editStorage(storage);
        return "redirect: storage_for_admin";
    }


    @RequestMapping(value = "/filter_storage", method = RequestMethod.GET)
    public String findStorage(@ModelAttribute("filter_storage") String name, Model model) {
        List<Storage> findByName = storageRepository.findByName(name);
        model.addAttribute("storage", new Storage());
        model.addAttribute("filter_storage", findByName);
        return "filter_storage";
    }

}
