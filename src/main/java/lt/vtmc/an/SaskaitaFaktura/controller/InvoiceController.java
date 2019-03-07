package lt.vtmc.an.SaskaitaFaktura.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.vtmc.an.SaskaitaFaktura.model.Invoice;
import lt.vtmc.an.SaskaitaFaktura.service.InvoiceService;

@RestController
@RequestMapping("/invoice")

public class InvoiceController {
	private InvoiceService invoiceService;

	@GetMapping({ "/all", "/invoices" })
	public ResponseEntity<?> listAllInvoices() {
		return new ResponseEntity<>(invoiceService.listAllInvoices(), HttpStatus.FOUND);
	}

	@PostMapping("/new")
	public ResponseEntity<?> createNewInvoice(@RequestBody Invoice invoice) {
		invoiceService.createInvoice(invoice);
		return new ResponseEntity<>(invoice, HttpStatus.CREATED);
	}

	@PutMapping({ "/invoice/edit/{id}" })
	public ResponseEntity<?> editInvoiceById(@PathVariable Long id) {
		return null;
	}

	@DeleteMapping({ "/invoice/delete/{id}" })
	public ResponseEntity<?> deleteInvoiceById(@PathVariable Long id) {
		invoiceService.deleteInvoiceById(id);
		return new ResponseEntity<>(id, HttpStatus.CONTINUE);
	}

}
