package cityservices.com.example.PotholeReport;

import cityservices.com.example.PotholeReport.models.Pothole;
import cityservices.com.example.PotholeReport.repositories.PotholeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PotholeReportApplicationTests {

	@Autowired
	PotholeRepository potholeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createPothole(){
		Pothole pothole1 = new Pothole(10, "Dumbarton rd", "image 1");
		potholeRepository.save(pothole1);

		Pothole pothole2 = new Pothole(5,"Buchanan St", "image2");
		potholeRepository.save(pothole2);
	}

}

