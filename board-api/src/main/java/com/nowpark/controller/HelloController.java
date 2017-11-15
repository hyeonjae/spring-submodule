package com.nowpark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nowpark.model.Member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {

	@Autowired
	private ObjectMapper objectMapper;

	@GetMapping
	public Message hello() {
		log.info("hello()");
		return Message.builder()
				.message("Hello world")
				.member(Member.builder().name("hyeonjae").email("hyeonjae2010@gmail.com").build())
				.build();
	}

	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder
	private static class Message {
		private String message;
		private Member member;
	}
}
