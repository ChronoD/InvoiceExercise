package lt.vtmc.an.SaskaitaFaktura.service;

import java.util.List;
import java.util.Optional;

import lt.vtmc.an.SaskaitaFaktura.model.Invoice;
import lt.vtmc.an.SaskaitaFaktura.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepo;

    @Override
    public List<Invoice> listAllInvoices() {
        return invoiceRepo.findAll();
    }


    @Override
    public Optional<Invoice> findInvoiceById(Long id) {
        return invoiceRepo.findById(id);
    }


    @Override
    public void createInvoice(Invoice invoice) {

        invoiceRepo.save(invoice);
    }


    public Invoice editInvoiceById(Long id, Invoice invoice) {

        Optional<Invoice> getRecord = findInvoiceById(id);
        Invoice recordToEdit = getRecord.get();
        if (invoice.getIssuingCompany() != null)
            recordToEdit.setIssuingCompany(invoice.getIssuingCompany());
        if (invoice.getRecipient() != null)
            recordToEdit.setRecipient(invoice.getRecipient());
        if (invoice.getNumber() != null)
            recordToEdit.setNumber(invoice.getNumber());
        if (invoice.getDateIssued() != null)
            recordToEdit.setDateIssued(invoice.getDateIssued());
        invoiceRepo.save(recordToEdit);
        return recordToEdit;

    }


    @Override
    public void deleteInvoiceById(Long id) {
        invoiceRepo.deleteById(id);
    }


}
