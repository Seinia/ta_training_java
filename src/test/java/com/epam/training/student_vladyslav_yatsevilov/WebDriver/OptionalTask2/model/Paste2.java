package com.epam.training.student_vladyslav_yatsevilov.WebDriver.OptionalTask2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Paste2 {
    String pasteCode;
    String pasteSyntax;
    String pasteTitle;
    String pasteExpiration;
}
