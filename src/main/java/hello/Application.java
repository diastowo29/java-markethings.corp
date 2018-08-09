package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hello.model.Complaint;
import hello.model.Users;
import hello.repo.ComplaintRepository;
import hello.repo.UsersRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	UsersRepository usersRepo;
	
	@Autowired
	ComplaintRepository complaintRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		usersRepo.deleteAll();
		complaintRepo.deleteAll();
		
		usersRepo.save(new Users("1234", "diastowo", "faryduana", "user", "password", "diastowo@gmail.com", "trees",
				"admin", "bojong", "bogor", "indo", "16320", "cobain"));
		complaintRepo.save(new Complaint(0, 0, "Delivery Lama", "Delivery", "Kok barangnya belum sampai ya?", 0));
		complaintRepo.save(new Complaint(0, 0, "Barang Rusak", "Damage Package", "Kok barangnya rusak ya?", 0));
		complaintRepo.save(new Complaint(0, 0, "Pembayaran Belum Lunas", "Payment", "Kok belum di lunasin ya?", 0));
	}

}
