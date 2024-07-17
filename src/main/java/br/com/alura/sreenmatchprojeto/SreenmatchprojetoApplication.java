package br.com.alura.sreenmatchprojeto;
import br.com.alura.sreenmatchprojeto.model.DadosSerie;
import br.com.alura.sreenmatchprojeto.service.ConsumoApi;
import br.com.alura.sreenmatchprojeto.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SreenmatchprojetoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SreenmatchprojetoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
       var consumoApi = new ConsumoApi();
       var json =  consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=3a493526");
        System.out.println(json);

//		json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
//        System.out.println(json);
        ConverteDados conversor = new ConverteDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
    }
}
