package com.agibank.hackathon.ems.controller.request.movimentacao;

import com.agibank.hackathon.ems.enums.StatusMovimentacao;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

 public class CriarMovimentacaoRequest {

    @NotBlank
    private String employeeId;

    @NotBlank
    private String equipmentId;

    private String sku;

    private LocalDateTime dataMovimentacao;

    private StatusMovimentacao movimentacao;
}