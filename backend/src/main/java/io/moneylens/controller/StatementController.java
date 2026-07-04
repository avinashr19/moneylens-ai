package io.moneylens.controller;

import io.moneylens.dto.AnalyzeResponse;
import io.moneylens.service.StatementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/statements")
@RequiredArgsConstructor
public class StatementController {

    private final StatementService statementService;

    @PostMapping(
            value = "/analyze",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public AnalyzeResponse analyze(
            @RequestParam("file") MultipartFile file) throws Exception {

        return statementService.analyze(file);

    }

}