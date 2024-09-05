package systemdesign.sd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRetrieveController {
    @RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
    @ResponseBody
    public String getAllStudents() {
        return "hello" ;
    }
}
