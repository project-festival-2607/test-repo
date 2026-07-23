package com.example.demo.admin; // "example"을 폴더 이름으로 바꾸기

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/*")  // "example"을 폴더 이름으로 바꾸기
public class AdminController {  // "Example"을 첫 글자를 대문자로 한 폴더 이름으로 바꾸기
}