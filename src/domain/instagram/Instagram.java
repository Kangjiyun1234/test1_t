package domain.instagram;

import domain.user.User;
import jakarta.persistence.*;

// domain/instagram/model/Instagram.java
@Entity
public class Instagram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")  // 외래 키 설정
    private User user;  // Instagram은 하나의 User에 속함

    //@NotNull
    private String url;  // 릴스 URL

    private String caption;  // 캡션
    private String author;   // 작성자
    private String thumbnailUrl;  // 썸네일 URL

    //@Enumerated(EnumType.STRING)
    //private ReelStatus status;  // 상태 (PENDING, SAVED 등)

    // 생성일자 등 추가적인 필드 및 메서드
}

