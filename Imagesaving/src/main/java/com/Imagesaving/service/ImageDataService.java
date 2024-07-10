package com.Imagesaving.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.image.fileupload.entity.ImageData;

import jakarta.transaction.Transactional;

@Service
public class ImageDataService {

	    @Autowired
	    private ImageDataRepository imageDataRepository;

	    public ImageUploadResponse uploadImage(MultipartFile file) throws IOException {

	        imageDataRepository.save(ImageData.builder()
	                .name(file.getOriginalFilename())
	                .type(file.getContentType())
	                .imageData(ImageUtil.compressImage(file.getBytes())).build());

	        return new ImageUploadResponse("Image uploaded successfully: " +
	                file.getOriginalFilename());

	    }

	    @Transactional
	    public ImageData getInfoByImageByName(String name) {
	        Optional<ImageData> dbImage = imageDataRepository.findByName(name);

	        return ImageData.builder()
	                .name(dbImage.get().getName())
	                .type(dbImage.get().getType())
	                .imageData(ImageUtil.decompressImage(dbImage.get().getImageData())).build();

	    }

	    @Transactional
	    public byte[] getImage(String name) {
	        Optional<ImageData> dbImage = imageDataRepository.findByName(name);
	        byte[] image = ImageUtil.decompressImage(dbImage.get().getImageData());
	        return image;
	    }


	}

}
