package hello.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import hello.model.Complaint;

public interface ComplaintRepository extends CrudRepository<Complaint, Long> {
	List<Complaint> findByOrderId(int orderId);
}
