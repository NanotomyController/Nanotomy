package org.nanotomy.viewer.webcontrol;


import org.nanotomy.viewer.model.DatabaseParser;
import org.nanotomy.viewer.model.EMDatabase;
import org.nanotomy.viewer.model.Publication;
import org.nanotomy.viewer.model.PublicationParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping(value = "/home")
    public String getLandingPage(){
        return "landingpage";
    }

    @GetMapping(value = "/publications")
    public String getPublicationsPage(Model model){
        List<Publication> publications = PublicationParser.parsePublications();
        model.addAttribute("publications", publications);
        return "publications";
    }

    @GetMapping(value = "/EMDatabases")
    public String getOtherEMDatabasesPage(Model model){
        List<EMDatabase> databases = DatabaseParser.parseDatabases();
        model.addAttribute("databases", databases);
        return "databases";
    }
    @GetMapping(value = "/ContactPage")
    public String getContactPage(){ return "contactpage";}

    @GetMapping(value = "/login")
    public String getLoginPage(){
        return "login";
    }


}
