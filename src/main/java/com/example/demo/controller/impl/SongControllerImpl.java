package com.example.demo.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.SongController;
import com.example.demo.service.SongService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SongControllerImpl implements SongController {

	@Autowired
	private SongService songService;

	@GetMapping("/songs")
	public ResponseEntity<?> getAllSongsUsingGET() {
		log.info("-----Get All Songs with Release Details-----");
		songService.getSongsDetails();
		return ResponseEntity.status(HttpStatus.OK).body(new ModelMap().addAttribute("msg", "Success"));
	}
}
