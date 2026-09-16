package kakao.itstudy.springunittest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CaculatorController {
    private final Calculator calculator;
    @RequestMapping("/")
    String index(){
        return "OK";
    }
    @RequestMapping("/health")
    String health(){
        return "OK";
    }
}

