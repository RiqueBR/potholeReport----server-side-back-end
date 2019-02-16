package cityservices.com.example.PotholeReport.controllers;

import cityservices.com.example.PotholeReport.models.Pothole;
import cityservices.com.example.PotholeReport.repositories.PotholeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/potholes")
public class PotholeController {

    @Autowired
    PotholeRepository potholeRepository;


    // GET All
    @GetMapping
    public List<Pothole> getAllPotholes(){
        return potholeRepository.findAll();
    }

    // GET One
    @GetMapping("{id}")
    public Optional<Pothole> getPothole(@PathVariable Long id){
        return potholeRepository.findById(id);
    }
}
