package nordicmotorhomes.project.Controller;

import nordicmotorhomes.project.Model.Employee;
import nordicmotorhomes.project.Model.Motorhome;
import nordicmotorhomes.project.Repositories.EmployeeRepository;
import nordicmotorhomes.project.Repositories.ICrudRepository;
import nordicmotorhomes.project.Repositories.MotorhomeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MotorhomeController {

    private ICrudRepository<Employee> employeeRepository;
    private ICrudRepository<Motorhome> motorhomeRepository;
    private Employee currentEmployee;

    public MotorhomeController() {

        employeeRepository = new EmployeeRepository();
        motorhomeRepository = new MotorhomeRepository();
    }

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("uname") String username, @RequestParam("pass") String password) {
        ArrayList<Employee> employees = employeeRepository.readAll();
        for (Employee epl : employees) {
            if (epl.getUsername().equals(username) && epl.getPassword().equals(password)) {
                currentEmployee = epl;
                return "redirect:/motorhomesList";
            }
        }
        return "redirect:/";
    }

    @GetMapping("/motorhomesList")
    public String motorhomesList(Model model) {
        model.addAttribute("motorhomes", motorhomeRepository.readAll());
        return "motorhomesList";
    }

    @GetMapping("/create")
    public String create() {
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Motorhome motorhome) {
        motorhomeRepository.create(motorhome);
        return "redirect:/motorhomesList";
    }

    @GetMapping("/details")
    public String details(@RequestParam("id") int motorhomeId, Model model) {
        Motorhome motorhome = motorhomeRepository.read(motorhomeId);
        model.addAttribute("motorhome", motorhome);
        return "details";
    }



    @GetMapping("/delete")
    public String delete(@RequestParam("id") int motorhomeId, Model model )
    {
        Motorhome motorhome = motorhomeRepository.read(motorhomeId);
        model.addAttribute("motorhome", motorhome);
        return "delete";
    }

   @PostMapping("/delete")

        public String delete(@ModelAttribute Motorhome motorhome){

            motorhomeRepository.delete(motorhome);
           return "redirect:/motorhomesList";
       }



       @GetMapping("/update")
    public String update(@RequestParam("id") int motorhomeID, Model model) {

        Motorhome motorhome = motorhomeRepository.read(motorhomeID);
        model.addAttribute("motorhome", motorhome);
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Motorhome motorhome) {

        motorhomeRepository.update(motorhome);
        return "redirect:/motorhomesList";
    }


}