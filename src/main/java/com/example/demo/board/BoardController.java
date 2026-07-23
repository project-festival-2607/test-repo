package com.example.demo.board; // "example"을 폴더 이름으로 바꾸기

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")  // "example"을 폴더 이름으로 바꾸기
public class BoardController {  // "Example"을 첫 글자를 대문자로 한 폴더 이름으로 바꾸기
}
