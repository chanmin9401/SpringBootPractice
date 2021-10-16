package springpractice.hellospring.annotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springpractice.hellospring.annotations.service.AnnotationsService;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Controller
public class AnnotationsController {

    private final AnnotationsService annotationsService;

    @Autowired
    public AnnotationsController(AnnotationsService annotationsService) {
        this.annotationsService = annotationsService;
    }

    @GetMapping("annotations")
    @ResponseBody
    public void annotationsResponse(){
        System.out.println("Annotation 실습 결과 " + annotationsService.annotationResponse().toString());
    }
}
