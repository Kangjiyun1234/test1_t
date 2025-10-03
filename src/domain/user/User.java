package domain.user;

import domain.instagram.Instagram;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//domain/user/model/User.java
@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NotBlank
    @Setter
    private String username;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Instagram> instagramPosts;  // 하나의 User는 여러 개의 Instagram 릴스를 가질 수 있음

    // getter, setter, 생성자 등
}

