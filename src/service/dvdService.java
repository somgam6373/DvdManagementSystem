package service;

import dao.dvdDao;
import dto.ResponseDTO;
import java.util.List;

public class dvdService {

    private dvdDao dao = new dvdDao();

    public List<ResponseDTO> getAllDvds() {
        return dao.findAll();
    }
}
