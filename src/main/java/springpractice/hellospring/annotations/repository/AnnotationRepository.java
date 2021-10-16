package springpractice.hellospring.annotations.repository;

import org.springframework.stereotype.Repository;
import springpractice.hellospring.annotations.DTO.AnnotationsDTO;

import java.util.Map;

@Repository
public class AnnotationRepository {

    public Map<String, String> annotationResponse () {
        AnnotationsDTO AD = new AnnotationsDTO();

        return AD.getRepoInfo().get(0);
    }
}
