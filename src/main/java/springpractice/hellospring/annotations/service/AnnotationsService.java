package springpractice.hellospring.annotations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springpractice.hellospring.annotations.repository.AnnotationRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class AnnotationsService {

    private final AnnotationRepository annotationRepository;

    @Autowired
    public AnnotationsService(AnnotationRepository annotationRepository) {
        this.annotationRepository = annotationRepository;
    }

    public Map<String, String> annotationResponse(){
        Map<String, String> result = new HashMap<>();
        Optional<Map> opt = Optional.ofNullable(annotationRepository.annotationResponse());

        if(opt.isPresent()){
            result = opt.get();
        }
        return result;
    }
}
