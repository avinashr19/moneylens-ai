package io.moneylens.service;

import io.moneylens.dto.AnalyzeResponse;
import io.moneylens.parser.PdfParserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class StatementService {

    private final PdfParserService pdfParserService;

    public AnalyzeResponse analyze(MultipartFile file) throws Exception {

        String text = pdfParserService.extractText(file);

        int pages = pdfParserService.getPageCount(file);

        return AnalyzeResponse.builder()
                .success(true)
                .fileName(file.getOriginalFilename())
                .pageCount(pages)
                .extractedText(text)
                .build();

    }

}