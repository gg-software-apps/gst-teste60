package br.com.teste.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.dto.ConsultarTipoContaDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ConsultarTipoContaController {

	@GetMapping("/")
	public ResponseEntity<ConsultarTipoContaDTO> index() throws IOException {

		ConsultarTipoContaDTO oConsultarTipoContaDTO = new ConsultarTipoContaDTO();
		oConsultarTipoContaDTO.setData("Hello Word");
		return ResponseEntity.ok(oConsultarTipoContaDTO);
	}

}