package lt.vtmc.an.SaskaitaFaktura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lt.vtmc.an.SaskaitaFaktura.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
