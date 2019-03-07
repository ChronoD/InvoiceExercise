package lt.vtmc.an.SaskaitaFaktura.service;

import java.util.List;
import java.util.Optional;

import lt.vtmc.an.SaskaitaFaktura.model.Invoice;

public interface InvoiceService {

	List<Invoice> listAllInvoices();

	Optional<Invoice> findInvoiceById(Long id);

	void createInvoice(Invoice invoice);

	void deleteInvoiceById(Long id);

}