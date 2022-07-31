package com.jinik.domain.dummy.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DummyDto {
    private Long id;
    private String title;
    private String content;
}
