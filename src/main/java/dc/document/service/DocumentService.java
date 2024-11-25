package dc.document.service;

import dc.document.model.DocumentModel;
import dc.document.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    public List<DocumentModel> getAllDocuments() {
        return documentRepository.findAll();
    }

    public DocumentModel saveDocument(DocumentModel document) {
        return documentRepository.save(document);
    }

    public void deleteDocument(String id) {
        documentRepository.deleteById(id);
    }
}
