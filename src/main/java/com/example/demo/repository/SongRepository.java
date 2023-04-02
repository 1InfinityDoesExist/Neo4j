package com.example.demo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Song;

@Repository
public interface SongRepository extends Neo4jRepository<Song, Long> {
}
