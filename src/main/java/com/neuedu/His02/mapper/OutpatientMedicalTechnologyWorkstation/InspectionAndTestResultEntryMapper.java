package com.neuedu.His02.mapper.OutpatientMedicalTechnologyWorkstation;

import org.springframework.web.multipart.MultipartFile;

public interface InspectionAndTestResultEntryMapper {
    public int editMovieInfo(int id, MultipartFile file, String uploadDir);
}
