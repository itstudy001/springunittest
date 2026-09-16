package kakao.itstudy.springunittest;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CaculatorController {
    private final Calculator calculator;
    private final Logger logger = LoggerFactory.getLogger(CaculatorController.class);

    @RequestMapping("/")
    String index(){
        logger.debug(10+20 + "");
        return "OK";
    }
    @RequestMapping("/health")
    String health(){
        return "OK";
    }
}

