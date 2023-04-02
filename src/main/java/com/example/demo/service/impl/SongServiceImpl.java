package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.AppearsOn;
import com.example.demo.entity.Song;
import com.example.demo.repository.SongRepository;
import com.example.demo.service.SongService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SongServiceImpl implements SongService {

	@Autowired
	private SongRepository songRepository;

	@Override
	public void getSongsDetails() {

		for (Song song : songRepository.findAll()) {
			log.info("-----Song Name : {}", song.getName());
			for (AppearsOn appearsOn : song.getReleases()) {
				log.info(appearsOn.getSongNr() + " -> " + appearsOn.getRelease().getName());
			}
		}
	}

}
