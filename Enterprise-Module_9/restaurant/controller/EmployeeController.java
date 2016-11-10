package restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import restaurant.domain.Employee;
import restaurant.repository.EmployeeRepository;
import java.util.List;
import java.util.Map;

/**
 * Created by zagor on 17.09.2016.
 */

@Controller
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController (EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @RequestMapping (value = "/employee", method = RequestMethod.GET)
    public String getEmployee (Model model) {
        List<Employee> employeeList = this.employeeRepository.listAll();

        model.addAttribute("employee", employeeList);

        return "employee";
    }

    @RequestMapping(value ="/employee_for_admin", method = RequestMethod.GET)
    public String getEmployeeAdm (Model model) {
        List<Employee> employeeListAdm = this.employeeRepository.listAll();

        model.addAttribute("employee", new Employee());
        model.addAttribute("employee_for_admin", employeeListAdm);

        return "employee_for_admin";
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("employee") Employee employee, BindingResult result) {

        employeeRepository.addEmployee(employee);

        return "redirect:/employee_for_admin";
    }

    @RequestMapping("/delete/{employeeId}")
    public String deleteContact(@PathVariable("employeeId") Integer employeeId) {

        employeeRepository.removeEmployee(employeeId);

        return "redirect:/employee_for_admin";
    }
}
