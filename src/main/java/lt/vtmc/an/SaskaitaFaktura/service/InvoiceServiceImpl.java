package lt.vtmc.an.SaskaitaFaktura.service;

import java.util.List;
import java.util.Optional;

import lt.vtmc.an.SaskaitaFaktura.model.Invoice;
import lt.vtmc.an.SaskaitaFaktura.repository.InvoiceRepository;

public class InvoiceServiceImpl implements InvoiceService {
private InvoiceRepository invoiceRepo;


/* (non-Javadoc)
 * @see lt.vtmc.an.SaskaitaFaktura.service.InvoiceService#listAllInvoices()
 */
@Override
public List<Invoice> listAllInvoices(){
return	invoiceRepo.findAll();
}
	


/* (non-Javadoc)
 * @see lt.vtmc.an.SaskaitaFaktura.service.InvoiceService#findInvoiceById(java.lang.Long)
 */
@Override
public Optional<Invoice> findInvoiceById(Long id){
	return invoiceRepo.findById(id);
}
	

/* (non-Javadoc)
 * @see lt.vtmc.an.SaskaitaFaktura.service.InvoiceService#createInvoice(lt.vtmc.an.SaskaitaFaktura.model.Invoice)
 */
@Override
public void createInvoice(Invoice invoice) {
	invoiceRepo.save(invoice);
}

//
//public Invoice editInvoiceById(Long id, Invoice invoice) {
//	Optional<Invoice> getRecord = findInvoiceById(id);
//	Invoice recordToEdit= getRecord.get();
//	if (invoice.)
//	
//	
//}
	

/* (non-Javadoc)
 * @see lt.vtmc.an.SaskaitaFaktura.service.InvoiceService#deleteInvoiceById(java.lang.Long)
 */
@Override
public void deleteInvoiceById(Long id) {
	invoiceRepo.deleteById(id);
}





}
