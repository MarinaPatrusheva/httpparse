package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.stream.Collectors;

public class JsonParser {
    public List sortBody(String body){
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Post> posts = mapper.readValue(body, new TypeReference<List<Post>>() {});
            posts = posts.stream().filter(post -> post.getUpvotes() > 0).collect(Collectors.toList());
            return posts;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
