package SpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @RequestMapping("/")
    public @ResponseBody String root() throws Exception {
        return "Model & View";
    }

    @RequestMapping("/test1")   // localhost:8081/test1
    public String test1(Model model) {
        // Model 객체를 이용해서, view로 Data 전달
        // 데이터 설정이 가능
        model.addAttribute("name", "홍길동");

        return "test1"; // 실제로 호출될 /WEB-INF/views/test1.jsp
    }

    @RequestMapping("/mv")
    public ModelAndView test2() {
        // 데이터와 뷰를 동시에 설정이 가능
        ModelAndView mv = new ModelAndView();
        List<String> list = new ArrayList<>();

        list.add("test1");
        list.add("test2");
        list.add("test3");

        mv.addObject("lists", list );                       // jstl로 호출
        mv.addObject("lists", "테스트입니다" );    // jstl로 호출
        mv.addObject("lists", "홍길동" );         // jstl로 호출
        mv.setViewName("view/myView");

        return mv;
    }

}
