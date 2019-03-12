package com.szymon.company.MortgageSimulation;

import java.text.DecimalFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author szymon
 */
@Controller
public class MortgageController {
    
    @Autowired
    MortgageService service;

    
    @GetMapping("/mortgage")
    public String mortgageForm(Model model) {
        model.addAttribute("mortgageData", new Mortgage());

        return "mortgageForm";
    }
    @PostMapping("/mortgage")
    public String mortgageFormWithResult(@ModelAttribute Mortgage mortgage2, Model model){
        double q = 1+ mortgage2.getBankMargin()/1200;
        double installment = mortgage2.getLoanAmount()*Math.pow(q, mortgage2.getLoanPeriod()*12)*(q-1)/(Math.pow(q, mortgage2.getLoanPeriod()*12)-1);
       double roundedInstallment = (Math.round(installment*100))/100.0;
        model.addAttribute("installment", roundedInstallment);
        double controlSum = roundedInstallment*mortgage2.getLoanPeriod()*12;
        double roundedControllSum = (Math.round(controlSum*100))/100.0; 
        model.addAttribute("controlSum", roundedControllSum) ;
                return "mortgageForm"; 
        
    }
}
