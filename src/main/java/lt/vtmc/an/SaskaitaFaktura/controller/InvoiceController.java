package lt.vtmc.an.SaskaitaFaktura.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lt.vtmc.an.SaskaitaFaktura.model.Item;
import lt.vtmc.an.SaskaitaFaktura.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
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

@Api(value = "Invoice")

@RestController
@RequestMapping("")

public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private ItemService itemService;



    @ApiOperation(value = "Get all invoices", notes = "Returns all recorded invoices.")
    @GetMapping("/invoices")
    public ResponseEntity<?> listAllInvoices() {
        return new ResponseEntity<>(invoiceService.listAllInvoices(), HttpStatus.FOUND);
    }




    @ApiOperation(value = "Get a particular invoice", notes = "Gets an invoice by its id")
    @GetMapping({"/invoices/{id}"})
    public ResponseEntity<?> getInvoiceById(@PathVariable Long id) {
        return new ResponseEntity<>(invoiceService.findInvoiceById(id), HttpStatus.FOUND);
    }
    @ApiOperation(value = "Create invoice", notes = "Adds a record of an invoice.")
    @PostMapping("/invoices")
    public ResponseEntity<?> createNewInvoice(@RequestBody Invoice invoice) {
        invoiceService.createInvoice(invoice);
        return new ResponseEntity<>(invoice, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Edit invoice", notes = "Edits an invoice by its id")
    @PutMapping({"/invoices/{id}"})
    public ResponseEntity<?> editInvoiceById(@PathVariable Long id, @RequestBody Invoice invoice) {
        return new ResponseEntity<>(invoiceService.editInvoiceById(id, invoice), HttpStatus.ACCEPTED);

    }



    @ApiOperation(value = "Delete invoice", notes = "Deletes an invoice by its id")
    @DeleteMapping({"/invoices/{id}"})
    public ResponseEntity<?> deleteInvoiceById(@PathVariable Long id) {
        invoiceService.deleteInvoiceById(id);
        return new ResponseEntity<>(id, HttpStatus.CONTINUE);
    }










    @ApiOperation(value = "List items", notes = "Lists all items")
    @GetMapping("/items")
    public ResponseEntity<?> listAllItems() {
        return new ResponseEntity<>(itemService.listAllItems(), HttpStatus.FOUND);
    }
    @ApiOperation(value = "Post an item", notes = "Posts an item")
    @PostMapping("/items")
    public ResponseEntity<?> postAnItem(lt.vtmc.an.SaskaitaFaktura.model.Item item) {
        itemService.createItem(item);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

}
