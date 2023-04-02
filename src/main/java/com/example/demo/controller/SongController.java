package com.example.demo.controller;

import org.springframework.http.ResponseEntity;

public interface SongController {

	public ResponseEntity<?> getAllSongsUsingGET();

}
