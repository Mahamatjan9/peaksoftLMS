package peaksoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import peaksoft.model.Company;
import peaksoft.service.CompanyService;

import java.util.List;

@Controller
public class CompanyController {
    private final CompanyService companyService;
@Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;

    }
    @GetMapping("/getAllCompanies")
    public String getCompanies(Model model){
        List<Company> companies = companyService.getAllCompanies();
        model.addAttribute("companies",companies);
        return "/company/allCompanies" ;

}
}
