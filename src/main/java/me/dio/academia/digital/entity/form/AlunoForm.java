package me.dio.academia.digital.entity.form;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

	@NotBlank(message = "Preencha o campo corretamente")
	@Size(min = 3, max = 50, message = "'${ValidatedValue}' precisa estar entre {min} e {max} caracteres")
  private String nome;

	@NotBlank(message = "Preencha o campo corretamente")
	@CPF(message = "'${validatedValue}' é inválido!")
  private String cpf;

	@NotBlank(message = "Preencha o campo corretamente")
	@Size(min = 3, max = 50, message = "'${ValidatedValue}' precisa estar entre {min} e {max} caracteres")
  private String bairro;

	@NotNull(message = "Preencha o campo corretamente")
	@Past(message = "'${validatedValue}' é inválida!")
  private LocalDate dataDeNascimento;
}
