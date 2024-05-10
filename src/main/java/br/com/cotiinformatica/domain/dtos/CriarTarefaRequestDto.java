package br.com.cotiinformatica.domain.dtos;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
public class CriarTarefaRequestDto {
	@Size(min = 8, max = 100, message = "Informe o nome de 8 a 100 caracteres.")
	@NotEmpty(message = "Por favor, informe o nome da tarefa.")
	private String nome;
	@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}",
			message = "Por favor, informe a data no formato 'yyyy-MM-dd'.")
	@NotEmpty(message = "Por favor, informe a data da tarefa.")
	private String data;
	@Pattern(regexp = "\\d{2}:\\d{2}",
			message = "Por favor, informe a hora no formato 'HH-mm'.")
	@NotEmpty(message = "Por favor, informe a hora da tarefa.")
	private String hora;
	@NotEmpty(message = "Por favor, informe o prioridade da pessoa.")
	private Integer prioridade;
}
