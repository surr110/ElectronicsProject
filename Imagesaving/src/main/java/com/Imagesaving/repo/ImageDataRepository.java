package com.Imagesaving.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.image.fileupload.entity.ImageData;

public interface ImageDataRepository extends JpaRepository<ImageData, Long> {
	Optional<ImageData> findByName(String name);

}
