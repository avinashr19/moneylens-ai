package io.moneylens.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnalyzeResponse {

    private boolean success;

    private String fileName;

    private int pageCount;

    private String extractedText;

}