package dc.document.controller;



import dc.document.model.DocumentModel;
import dc.document.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping
    public List<DocumentModel> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    @PostMapping
    public DocumentModel createDocument(@RequestBody DocumentModel document) {
        return documentService.saveDocument(document);
    }

    @DeleteMapping("/{id}")
    public void deleteDocument(@PathVariable String id) {
        documentService.deleteDocument(id);
    }
}
