package cityservices.com.example.PotholeReport.components;

import cityservices.com.example.PotholeReport.models.Pothole;
import cityservices.com.example.PotholeReport.repositories.PotholeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PotholeRepository potholeRepository;

    public DataLoader() {
    }


    public void run(ApplicationArguments args) throws Exception {

        Pothole pothole1 = new Pothole(10, "Dumbarton Rd", "Across Cafe Monza");
        potholeRepository.save(pothole1);

        Pothole pothole2 = new Pothole(5,"Buchanan St", "Near Buchanan Galleries");
        potholeRepository.save(pothole2);

        Pothole pothole3 = new Pothole(3, "Denninston Dr.", "Around the corner from Sainsburys");
        potholeRepository.save(pothole3);

        Pothole pothole4 = new Pothole(12,"Hyndland St", "Near Cottiers");
        potholeRepository.save(pothole4);
    }
}
