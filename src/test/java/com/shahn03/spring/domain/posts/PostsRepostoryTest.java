package com.shahn03.spring.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepostoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After//junit 에서 단위테스트가 끝날때 마다 수행되는 메소드 지정
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void requestContents(){
        //given
        String title = "테스트 제목";
        String contents = "테스트 본문";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(contents)
                .author("shahn03@cafe24corp.com")
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(contents);
    }
}
