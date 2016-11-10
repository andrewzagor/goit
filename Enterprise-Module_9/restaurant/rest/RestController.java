package rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ZahornyiAI on 10.11.2016.
 */

@Controller
public class RestController {

    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    public String contacts() {
        return "rest/rest";
    }
}
