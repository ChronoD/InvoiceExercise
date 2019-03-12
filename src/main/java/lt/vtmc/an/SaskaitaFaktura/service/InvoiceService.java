package lt.vtmc.an.SaskaitaFaktura.service;

import lt.vtmc.an.SaskaitaFaktura.model.Invoice;

import java.util.List;
import java.util.Optional;

public interface InvoiceService {

    List<Invoice> listAllInvoices();

    Optional<Invoice> findInvoiceById(Long id);

    void createInvoice(Invoice invoice);

    Invoice editInvoiceById(Long id, Invoice invoice);

    void deleteInvoiceById(Long id);

}