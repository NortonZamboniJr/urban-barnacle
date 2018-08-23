package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.joda.time.LocalTime;
import org.joda.time.LocalDate;

@RestController
public class HelloController {

    @RequestMapping("/data")
    public String index() {
	LocalDate currentDate = new LocalDate(); 
	LocalTime currentTime = new LocalTime();
        return  currentDate.toString() + " " +  currentTime.getHourOfDay() + "h" + currentTime.getMinuteOfHour();
    }

}
