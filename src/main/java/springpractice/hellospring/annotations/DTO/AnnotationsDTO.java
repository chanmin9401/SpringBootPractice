package springpractice.hellospring.annotations.DTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnotationsDTO {
    private List<Map<String, String>> repoInfo;

    public AnnotationsDTO() {
        List<Map<String, String>> initList = new ArrayList<>();

        Map<String, String> Info = new HashMap<>();
        Info.put("first", "firstInfo");

        initList.add(Info);

        this.repoInfo = initList;
    }
    public List<Map<String, String>> getRepoInfo(){
        return this.repoInfo;
    }
}
